public class KNight {
public static boolean isSafe(char board[][] ,int i, int j){
    // 1
    int n = board.length;
    if(i<0 && i>n-1 && j<0 && j>n-1 && board[i-1][j-2]!='k'){
        return false;
    }

    //2
     if(i<0 && i>n-1 && j<0 && j>n-1 && board[i-2][j-1]!='k'){
         return false;
    }

    //3
     if(i<0 && i>n-1 && j<0 && j>n-1 && board[i-2][j+1]!='k'){
         return false;
    }

    //4
     if(i<0 && i>n-1 && j<0 && j>n-1 && board[i-1][j+2]!='k'){
         return false;
    }

    return true;
}

    public static void knights(char board[][] ,int row ){
        if(row==board.length){
            printBoard(board);
            return;
        }

        //kam
        for(int j=0; j<board.length; j++){
            if(isSafe(board,row,j)){
            board[row][j]='K';
            knights(board, row+1);
            board[row][j] = 'x';
            }
        }
    }


    public static void printBoard(char board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
           
        }
         System.out.println("--------board----------");
    }
    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++ ){
                board[i][j]='x';
            }
        }

        knights(board,0);
    }
}
