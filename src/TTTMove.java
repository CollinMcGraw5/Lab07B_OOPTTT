public class TTTMove {
    private int row;
    private int col;
    private String symbol;

    public TTTMove(int row, int col, String symbol) {
        this.row = row;
        this.col = col;
        this.symbol = symbol;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Move: " + symbol + " at (" + row + ", " + col + ")";
    }
}