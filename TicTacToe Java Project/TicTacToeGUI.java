import javax.swing.*;
import java.awt.*;


public class TicTacToeGUI {
    private JFrame frame;
    private JButton[] buttons = new JButton[9];
    private String player1, player2;
    private boolean player1Turn = true;

    public TicTacToeGUI() {
      
        player1 = JOptionPane.showInputDialog(null, "Enter Player 1 Name (X):");
        player2 = JOptionPane.showInputDialog(null, "Enter Player 2 Name (O):");

        if (player1 == null || player1.trim().isEmpty()) player1 = "Player 1";
        if (player2 == null || player2.trim().isEmpty()) player2 = "Player 2";

       
        frame = new JFrame("Tic Tac Toe - " + player1 + " vs " + player2);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(3, 3));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.BOLD, 50));
            buttons[i].setFocusPainted(false);

            int index = i;
            buttons[i].addActionListener(e -> buttonClick(index));

            frame.add(buttons[i]);
        }

        frame.setVisible(true);
    }

    
    private void buttonClick(int index) {
        if (!buttons[index].getText().equals("")) return; 

        if (player1Turn) {
            buttons[index].setText("X");
        } else {
            buttons[index].setText("O");
        }

        if (checkWin()) {
            String winner = player1Turn ? player1 : player2;
            JOptionPane.showMessageDialog(frame, winner + " wins!");
            resetBoard();
            return;
        }

        if (isDraw()) {
            JOptionPane.showMessageDialog(frame, "It's a draw!");
            resetBoard();
            return;
        }

        player1Turn = !player1Turn;
    }

   
    private boolean checkWin() {
        int[][] winPatterns = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // rows
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // columns
                {0, 4, 8}, {2, 4, 6}             // diagonals
        };

        for (int[] wp : winPatterns) {
            String b1 = buttons[wp[0]].getText();
            String b2 = buttons[wp[1]].getText();
            String b3 = buttons[wp[2]].getText();

            if (!b1.equals("") && b1.equals(b2) && b2.equals(b3)) {
                return true;
            }
        }
        return false;
    }

    
    private boolean isDraw() {
        for (JButton btn : buttons) {
            if (btn.getText().equals("")) return false;
        }
        return true;
    }

    
    private void resetBoard() {
        for (JButton btn : buttons) {
            btn.setText("");
        }
        player1Turn = true;
    }

  
    public static void main(String[] args) {
        new TicTacToeGUI();
    }
}

