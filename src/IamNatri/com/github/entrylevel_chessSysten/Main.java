package IamNatri.com.github.entrylevel_chessSysten;

import IamNatri.com.github.entrylevel_chessSysten.chess.ChessMatch;
import IamNatri.com.github.entrylevel_chessSysten.UI;

public class Main {

    public static void main(String[] Args) {

        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());
    }

}
