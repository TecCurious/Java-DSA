public class BankClass {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.name="prakash kumar";
        System.out.println(myAccount.name);
        myAccount.setpassword("kumar");
        
    }
}

class BankAccount {
    public String name;
    private String password;

    void setpassword(String pwd){
        password = pwd;
    }

}