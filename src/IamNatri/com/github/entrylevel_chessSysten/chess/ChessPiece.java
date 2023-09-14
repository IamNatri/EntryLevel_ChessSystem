package IamNatri.com.github.entrylevel_chessSysten.chess;

import IamNatri.com.github.entrylevel_chessSysten.boardgame.Board;
import IamNatri.com.github.entrylevel_chessSysten.boardgame.Piece;
import IamNatri.com.github.entrylevel_chessSysten.chess.enums.Color;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
