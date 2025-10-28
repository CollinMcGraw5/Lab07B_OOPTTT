public class TTTBoard {
    private String[][] tiles = new String[3][3];

    public void resetBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                tiles[i][j] = "";
    }

    public boolean setTile(int row, int col, String symbol) {
        if (tiles[row][col].equals("")) {
            tiles[row][col] = symbol;
            return true;
        }
        return false;
    }

    public String[][] getTiles() {
        return tiles;
    }
}