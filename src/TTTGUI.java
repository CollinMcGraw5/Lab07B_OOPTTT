import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TTTGUI extends JFrame {
    private Game game;
    private TTTTileButton[][] buttons = new TTTTileButton[3][3];

    public TTTGUI() {
        game = new Game();
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setLayout(new GridLayout(3, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new TTTTileButton(i, j);
                buttons[i][j].addActionListener(new ButtonListener());
                add(buttons[i][j]);
            }

        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TTTTileButton btn = (TTTTileButton) e.getSource();
            if (game.makeMove(btn.getRow(), btn.getCol())) {
                btn.setText(game.getCurrentPlayer().getSymbol());
                if (game.checkWin()) {
                    JOptionPane.showMessageDialog(null, game.getCurrentPlayer().getName() + " wins!");
                    game.resetGame();
                    resetButtons();
                } else if (game.checkDraw()) {
                    JOptionPane.showMessageDialog(null, "It's a draw!");
                    game.resetGame();
                    resetButtons();
                } else {
                    game.switchPlayer();
                }
            }
        }
    }

    private void resetButtons() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                buttons[i][j].setText("");
    }

    public static void main(String[] args) {
        new TTTGUI();
    }
}