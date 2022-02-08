package apllication;

import chess.ChessMatch;


public class Program {
    public static void main(String[] args) throws Exception {

        ChessMatch chessMatch = new ChessMatch();
        Ui.printBoard(chessMatch.getPieces());
    }
}
