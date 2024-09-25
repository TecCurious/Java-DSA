public class LinearS {
    // linear search 
    public static int Search(int num[],int key){
        for(int i=0; i<num.length; i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int MenuSearch(String menu[],String item){
        for(int i=0; i<menu.length; i++){
            if(menu[i]==item){
                System.out.println(menu[i]);
                return i;
                
            }

        }
        return -1;
    }

    public static void main(String args[]){
        int num[] = {1,3,1,4,10,6,16,16};
        String menu[]= {"dal roti","paratha","tea","samosa","nan"};
        String item = "tea";
        int key =6;
       int index =  Search(num, key);

        if(index == -1){
            System.out.println("key is not found");
        }else{
            System.out.println("key is at index"+index);
        }

       int ide = MenuSearch(menu, item);
       if(ide==-1){
        System.out.println("item does not found");
       }else{
        System.out.println("item is on index :"+ide);
       }



    }
}
