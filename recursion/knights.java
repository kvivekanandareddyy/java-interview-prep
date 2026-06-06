public class knight {
    public static void main(String[] args) {
        boolean[][] path =  new boolean[4][4];
        backtrack(path , 0 , 0 , 5);
    }

    static void backtrack(boolean[][] board , int row , int col , int knights){
        if(knights == 0){
            diaplay(board);
            System.out.println();
            return;
        }
        if(row == board.length){
            return;
        }
        if(col == board.length){
            backtrack(board , row + 1 , 0 , knights);
            return;
        }

        if(isIssafe(board, row, col)){
            board[row][col] = true;
            backtrack(board , row , col + 1 , knights - 1);
            board[row][col] = false;
        }
        backtrack(board , row , col + 1 , knights);

    }

    static boolean isIssafe(boolean[][] board, int row, int col) {
        //this cheak is for the  2 row above and = 1col
        if(row - 2 >= 0 && col + 1 < board.length   ){
            if(board[row - 2][col + 1]){
                return false;
            }
        }
        //this cheak for the 2 row above and col - 1
        if(row - 2 >= 0 &&  col - 1 >= 0){
            if(board[row - 2][col - 1]){
                return false;
            }
        }
        //this cheak is for the  1 row - and 2 col -
        if(row - 1 >= 0 && col - 2 >= 0 ){
            if(board[row - 1][col - 2]){
                return false;
            }
        }

        //this cheak is for the r - 1 and col + 2
        if(row - 1 >= 0 && col + 2 < board.length){
            if(board[row - 1][col + 2]){
                return false;
            }
        }
        return true;
    }

    static void diaplay(boolean[][] board) {
        for (boolean[] r : board) {
            for (boolean ele : r) {
                if (ele == true) {
                    System.out.print('K');
                }
                else{
                    System.out.print('X');
                }
            }
            System.out.println();
        }
    }
}

