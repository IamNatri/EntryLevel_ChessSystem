package IamNatri.com.github.entrylevel_chessSystem.chess;

import IamNatri.com.github.entrylevel_chessSystem.boardgame.BoardException;

import java.io.Serial;

public class ChessException extends BoardException {
    @Serial
    private static final long serialVersionUID = 1L;
    public ChessException(String message) {
        super(message);
    }
}
