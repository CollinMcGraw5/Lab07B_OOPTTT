public class Game {
    private TTTBoard board;
    private TTTPlayer playerX, playerO, currentPlayer;
    private TTTWinChecker winChecker;

    public Game() {
        board = new TTTBoard();
        playerX = new TTTPlayer("Player X", "X");
        playerO = new TTTPlayer("Player O", "O");
        currentPlayer = playerX;
        winChecker = new TTTWinChecker();
        board.resetBoard();
    }

    public TTTPlayer getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }

    public boolean makeMove(int row, int col) {
        return board.setTile(row, col, currentPlayer.getSymbol());
    }

    public boolean checkWin() {
        return winChecker.checkWin(board.getTiles(), currentPlayer.getSymbol());
    }

    public boolean checkDraw() {
        return winChecker.checkDraw(board.getTiles());
    }

    public void resetGame() {
        board.resetBoard();
        currentPlayer = playerX;
    }
}