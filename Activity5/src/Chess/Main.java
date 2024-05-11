package Chess;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void printCurrentBoard() {
        for (int i = 0; i < 8; i++) {
            System.out.println(Arrays.deepToString(ChessBoardUI.board[i]));
        }
    }

    public static void pieceMove(ChessPiece chessPiece, int x, int y) {
        List<int[]> target = chessPiece.getPossibleMoves(x,y);
        for (int i = 0; i < target.size(); i++) {
            boolean movable = chessPiece.checkMovable(target.get(i)[0], target.get(i)[1]);
            System.out.println("The (" + x + "," + y + ") piece is movable");
            if (movable) {
                chessPiece.move(x, y, target.get(i)[0], target.get(i)[1]);
                break;
            }
        }
        printCurrentBoard();

    }

    public static void main(String[] args) {
        ChessBoardUI chessBoardUI = new ChessBoardUI();
        Pawn pawn = new Pawn();

        // put pawn piece
        chessBoardUI.putPiece(pawn);
        printCurrentBoard();

        // move the pawn piece at (6,0) to the target coordinate
        pieceMove(pawn, 6, 0 );

        // move the pawn piece at (6,4) to the target coordinate
        pieceMove(pawn, 6, 4 );

        pieceMove(pawn, 5, 4 );

    }

}

