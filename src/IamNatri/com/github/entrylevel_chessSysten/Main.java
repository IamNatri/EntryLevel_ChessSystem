package IamNatri.com.github.entrylevel_chessSysten;

import IamNatri.com.github.entrylevel_chessSysten.chess.ChessMatch;
import IamNatri.com.github.entrylevel_chessSysten.UI;
import IamNatri.com.github.entrylevel_chessSysten.chess.ChessPiece;
import IamNatri.com.github.entrylevel_chessSysten.chess.ChessPosition;

import java.util.Scanner;

public class Main {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

        }

    }

}
