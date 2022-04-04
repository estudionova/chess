package boardgame;

public class Board {

    private int row;
    private int colums;
    private Piece[][] pieces;

    public Board() {
    }

    public Board(int row, int colums) {
        this.row = row;
        this.colums = colums;
        pieces = new Piece[row][colums];
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColums() {
        return colums;
    }

    public void setColums(int colums) {
        this.colums = colums;
    }


    public Piece piece(int row, int colums) {
        return pieces[row][colums];
    }

    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColum()];
    }

    public void placePiece(Piece piece, Position position){
        pieces[position.getRow()][position.getColum()] = piece;
        piece.position = position;
    }

}
