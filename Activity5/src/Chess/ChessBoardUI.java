package Chess;

public class ChessBoardUI {
    public static String[][] board = new String[8][8];

    public ChessBoardUI() {
        initializeBoard();
    }

    private void initializeBoard() {
        // Write your code here
        // hint: 1.	A chess board is a board of fixed size, 8x8, where each square initially contains an whitespace (“ ”).

        for(int i=0; i<=7; i++){
            for(int j=0; j<=7; j++){
                board[i][j] = " ";
            }
        }
        System.out.println("Board initialized");
    }

    public void putPiece(ChessPiece piece) {
        piece.setPosition();
    }
}
