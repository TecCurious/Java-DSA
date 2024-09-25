public class stairCaseSearch {

public static boolean MatrixStrairCaseSearch(int Matrix[][],int key){
    int row=0 , col=Matrix[0].length-1;
    while(row<=Matrix.length-1 && col>=0){
        if(key == Matrix[row][col]){
            System.out.println("key found at :"+row+","+col);
            return true;
        }
        else if(key < Matrix[row][col]){
            col--;
        }
        else{
            row++;
        }
    }
    System.out.println("key is note found");
    return false;
}
    public static void main(String[] args) {
        int Mtrix[][]={{10,20,30,40},
                      {15,25,35,45},
                      {27,29,37,48},
                      {32,33,39,50}};
        int key =12;
       System.out.println(MatrixStrairCaseSearch(Mtrix, key));
    }
}
