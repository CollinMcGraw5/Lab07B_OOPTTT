import javax.swing.JButton;

public class TTTTileButton extends JButton {
    private int row, col;

    public TTTTileButton(int row, int col) {
        this.row = row;
        this.col = col;
        setText("");
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
}