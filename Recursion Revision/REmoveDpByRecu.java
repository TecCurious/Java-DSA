public class REmoveDpByRecu {
    public static void removedp(String str, int idx, StringBuilder newStr, boolean map[]){
        // base case 
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        // kam

    char current = str.charAt(idx);
        
        if(map[current-'a']==true){
            removedp(str, idx+1, newStr, map);
        }else{
            map[current-'a']=true;
            removedp(str, idx+1, newStr.append(current), map);

        }
    }
    public static void main(String[] args) {
        String str = "prakash";
        StringBuilder newStr = new StringBuilder("");
        boolean map[]=new boolean[26];

        removedp(str, 0, newStr, map);
    }
}
