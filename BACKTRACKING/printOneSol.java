public class printOneSol {
// checking safe 
public static boolean isSafe(char Board[][], int row,int col){
// vertical up
for(int i=row-1; i>=0; i--){
    if(Board[i][col]=='Q'){
        return false;
    }
}    

//left digonal
for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
    if(Board[i][j]=='Q'){
        return false;
    }
}

// right digonal
for(int i=row-1, j=col+1; i>=0 && j<Board.length; i--,j++){
    if(Board[i][j]=='Q'){
        return false;
    }
}
return true;
}

    public static boolean nQueens(char Board[][], int row){
        // base case 
        if(row==Board.length){
            // printBoard(Board);
            // for ways count 
            count++;
            return true;
        }
        // kam
        for(int j=0; j<Board.length; j++){
            if(isSafe(Board, row, j)){
                 Board[row][j]='Q';
            if(nQueens(Board, row+1)){
                return true;
            }
            Board[row][j]='x';// backtracking step
            }
           
        }
        return false;

    }

    public static void printBoard(char Board[][]){
        for(int i=0; i<Board.length; i++){
            for(int j=0; j<Board.length; j++){
                System.out.print(Board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----chess board----");
    }

     static int count;
    public static void main(String[] args) {
        int n=5;
        char Board[][]=new char[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
            Board[i][j]='x';
            }
        }
        if(nQueens(Board, 0)){
            System.out.println("sollution is possible");
          printBoard(Board);
        }else{
            System.out.println("sollution is note possible");
        }
        System.out.println("total ways of solve n queens n = "+count);

    }
}
