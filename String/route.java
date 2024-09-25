import java.util.*;
public class route {
    public static float shortpath(String str){
        int x=0,y=0;
        
        for(int i=0; i<str.length(); i++){
            char dire = str.charAt(i);
            if(dire == 'N'){
                y++;
            }
            else if(dire == 'S'){
            y--;
            }
            else if(dire == 'E'){
                x++;
            }
            else{
                x--;
            }
            
        }
        int x2 = x*x;
            int y2 = y*y;

            return (float)Math.sqrt(x2+y2);

    }
    public static void main(String[] args) {
        String direction = "WNEENESENNN";
       System.out.println(shortpath(direction)); 
    }
}
