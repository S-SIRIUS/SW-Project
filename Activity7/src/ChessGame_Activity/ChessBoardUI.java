package ChessGame_Activity;

// Write code here
// - import awt and swing here
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChessBoardUI extends JFrame {
    public static JButton[][] squares = new JButton[8][8];
    public static String[][] board = new String[8][8];

    // 생성자
    public ChessBoardUI() {
        // Write code here
        // 1) 윈도우 타이틀
        this.setTitle("Chess Game");
        // 2) 윈도우 닫히면 프로그램도 닫히도록
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 3) 8x8 grid and suitable
        this.setLayout(new GridLayout(8,8));
        // 4) 600 x 600 pixels
        this.setSize(600, 600);

        // 각 버튼 초기화
        initializeButtons();

        // 5) window visible 하게
        this.setVisible(true);
    }
    private void initializeButtons() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new JButton();
                this.add(squares[i][j]);
            }
        }
    }
    public void initializeBoard() {
        // Write code here
        // 1) 초기화
        for(int i=0; i<=7; i++){
            for(int j=0; j<=7; j++){
                this.board[i][j]="";
            }
        }

        // 2) board에 pawn을 놓는다.
        for(int i=0; i<=7; i++){
            this.board[6][i] = "P";
        }

        // 3) pawn말고 다른것들을 board에 놓는다.
        this.board[7][0] = "R";

        this.board[7][1] = "K";

        this.board[7][2] = "B";

        this.board[7][3] = "Q";

        this.board[7][4] = "King";

        this.board[7][5] = "B";

        this.board[7][6] = "K";

        this.board[7][7] = "R";

    }

    public void createUI() {
        // Write code here
        // 1) 스퀘어 별로 칼라 설정
        // 2) 각 버튼마다 액션리스너 추가
            for(int i=0; i<=7; i++){
                for(int j=0; j<=7; j++){
                    this.squares[i][j].addActionListener(new ButtonListener(i,j));
                    if((i+j) % 2 == 1) {
                        this.squares[i][j].setBackground(Color.GRAY);
                    }
                    else{
                        this.squares[i][j].setBackground(Color.WHITE);
                    }
                }
            }

    }

    public static void updateUI() {
        // Write code here
        // 1) board에 텍스트 설정
        for(int i=0; i<=7; i++){
            for(int j=0; j<=7; j++){
                squares[i][j].setText(board[i][j]);
            }
        }

    }
}
