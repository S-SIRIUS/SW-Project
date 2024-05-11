package Chess;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements ChessPiece {

    // Write your code here

    public void setPosition()
    {
        ChessBoardUI.board[6][0]="P";
        ChessBoardUI.board[6][1]="P";
        ChessBoardUI.board[6][2]="P";
        ChessBoardUI.board[6][3]="P";
        ChessBoardUI.board[6][4]="P";
        ChessBoardUI.board[6][5]="P";
        ChessBoardUI.board[6][6]="P";
        ChessBoardUI.board[6][7]="P";
    }

    public List<int[]> getPossibleMoves(int currentX, int currentY)
    {
        List <int[]> PossibleMoves =  new ArrayList<>();
        int newX = currentX-1;
        int newY = currentY;
        if(newX<=7 && newX>=0 && newY<=7 && newY>=0){
            PossibleMoves.add(new int []{newX, newY});
        }
        return PossibleMoves;
    }

    public boolean checkMovable(int targetX, int targetY) // returns whether the chess piece can move or not
    {
        boolean ans = false;
        if(ChessBoardUI.board[targetX][targetY].equals(" "))
        {
            ans = true;
        }
        return ans;
    }

    public void move(int currentX, int currentY, int targetX, int targetY)
    {
        ChessBoardUI.board[currentX][currentY]=" ";
        ChessBoardUI.board[targetX][targetY] = "P";

    }

}
