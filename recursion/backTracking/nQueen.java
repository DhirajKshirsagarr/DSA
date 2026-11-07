public class nQueen {

    public static boolean isSaif(char[][] board, int row, int col) {
        // for virtical check
        for (int j = row - 1; j >= 0; j--) {
            if (board[j][col] == 'Q') {
                return false;
            }
        }

        // for right digonal check
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // for left digonal check
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void no_Queen(char[][] board, int row) {
        if (row == board.length) {
            printBrd(board);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSaif(board, row, i)) {
                board[row][i] = 'Q';
                no_Queen(board, row + 1);//function call
                board[row][i] = 'X';// backtracking step
            }
            
        }
    }

    // condition of without attacking queens
    //
    //
    // for(int i = 0;i<board.length;i++)
    // {
    // board[row][i] = 'Q';
    // no_Queen(board, row + 1);
    // board[row][i] = 'X';
    // }

    public static void printBrd(char[][] board) {
        int n = board.length;
        System.out.println("-----solution-----");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        no_Queen(board, 0);
    }
}
