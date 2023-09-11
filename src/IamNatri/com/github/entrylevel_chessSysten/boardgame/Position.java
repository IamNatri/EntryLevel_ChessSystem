package IamNatri.com.github.entrylevel_chessSysten.boardgame;

public class Position {
    private int row;
    private int column;

    public Position(int row, int colum) {
        this.row = row;
        this.column = colum;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "Position{" +
                "row= " + row +
                ", colum= " + column +
                '}';
    }
}
