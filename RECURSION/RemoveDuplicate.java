public class RemoveDuplicate {
public static void removeDuplicate(String str , int ind, StringBuilder newString,boolean map[]) {
if(ind == str.length()){
    System.out.println(newString);
    return;
}
// kam
char curchar = str.charAt(ind);
// duplicate situation
if(map[curchar-'a']==true){
    removeDuplicate(str, ind+1, newString, map);
}else{
    map[curchar-'a']=true;
    removeDuplicate(str, ind+1, newString.append(curchar), map);
}
}
    public static void main(String[] args) {
        String str = "prakash";
        // StringBuilder newString = new StringBuilder("");
        // boolean map[]=new boolean[26];

        removeDuplicate(str,0, new StringBuilder("") , new boolean[26]);
    }
}
