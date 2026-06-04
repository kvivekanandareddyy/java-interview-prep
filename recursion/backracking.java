
public class Nqueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        backtrack(board , 0);
    }
    static void backtrack(boolean[][] board , int row){
        if(board.length == row){
            getDisplay(board);
            return ;
        }
        //cheack every row and col that we can place the queen
        for(int c = 0 ; c < board[row].length ; c++){
            //if the queen is at the right place , dia , row , col not contain is the safe place
            if(isRightplace(board, c , row)){
                board[row][c] = true;
                backtrack(board , row + 1);
                board[row][c] = false;
            }
        }
    }
    static boolean isRightplace(boolean[][] board, int c , int row) {
        //cheaking for vertical call
        for(int i = 0 ; i < row ; i++){
            if(board[i][c]){
                return false;
            }
        }
        //cheaking for left diagnol ;
        int maxleft = Math.min(row , c);
        for( int i = 1 ; i <= maxleft ; i++){
            if(board[row - i][c - i]){
                return false;
            }
        }
        //cheaking right side diagnol ;

        int maxright = Math.min(row, board.length - c - 1);
        for(int i = 1 ; i <= maxright ; i++){
            if(board[row - i][c + i]){
                return false;
            }
        }
        return true;
    }
    static void getDisplay(boolean[][] board) {
        for(boolean[] row : board){
            for(boolean col : row){
                if(col){
                    System.out.print('Q');
                }else{
                    System.out.print('X');
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}

