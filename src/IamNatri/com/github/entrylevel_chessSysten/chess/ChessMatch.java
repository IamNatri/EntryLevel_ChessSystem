package IamNatri.com.github.entrylevel_chessSysten.chess;

import IamNatri.com.github.entrylevel_chessSysten.boardgame.Board;
import IamNatri.com.github.entrylevel_chessSysten.boardgame.Position;
import IamNatri.com.github.entrylevel_chessSysten.chess.enums.Color;
import IamNatri.com.github.entrylevel_chessSysten.chess.pieces.King;
import IamNatri.com.github.entrylevel_chessSysten.chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        this.board = new Board(8, 8);
        initialSetup();
    }

    //Promove a separação de visibilidade do sistema não permitindo o programa conhecer uma classe fora da chess
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i<board.getRows(); i++){
            for(int j=0; j< board.getColumns(); j++ ){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }

        }
        return mat;
    }

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup(){
        placeNewPiece('e', 1, new King(board, Color.WHITE));
    }
}
