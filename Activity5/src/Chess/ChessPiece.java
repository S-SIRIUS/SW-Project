package Chess;

import java.util.List;

public interface ChessPiece {
    void setPosition();
    List<int[]> getPossibleMoves(int currentX, int currentY); // returns the coordinates of the board the chess piece can move to
    boolean checkMovable(int targetX, int targetY); // returns whether the chess piece can move or not
    void move(int currentX, int currentY, int targetX, int targetY);

}
