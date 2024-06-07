package ChessGame_Activity;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ChessGame_Activity.ChessBoardUI.board;

public class ButtonListener implements ActionListener {
    // x and y indicate the location of the piece
    private final int x;
    private final int y;

    public ButtonListener(int x, int y) {
        // Write code here
        this.x = x;
        this.y = y;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Write code here
        // 1) 움직이는 로직
        if(x-1 >=0 && ChessGame_Activity.ChessBoardUI.board[x][y]=="P") {
            ChessGame_Activity.ChessBoardUI.board[x][y] = "";
            ChessGame_Activity.ChessBoardUI.board[x - 1][y] = "P";
        }
        // 2) UI 업데이트
        ChessGame_Activity.ChessBoardUI.updateUI();

    }
}
