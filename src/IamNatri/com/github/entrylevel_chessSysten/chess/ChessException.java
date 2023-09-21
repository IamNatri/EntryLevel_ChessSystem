package IamNatri.com.github.entrylevel_chessSysten.chess;

import IamNatri.com.github.entrylevel_chessSysten.boardgame.BoardException;

import java.io.Serial;

public class ChessException extends BoardException {
    @Serial
    private static final long serialVersionUID = 1L;
    public ChessException(String message) {
        super(message);
    }
}
