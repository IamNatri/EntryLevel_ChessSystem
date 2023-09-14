package IamNatri.com.github.entrylevel_chessSysten.chess.pieces;

import IamNatri.com.github.entrylevel_chessSysten.boardgame.Board;
import IamNatri.com.github.entrylevel_chessSysten.chess.ChessPiece;
import IamNatri.com.github.entrylevel_chessSysten.chess.enums.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return " K";
    }
}
