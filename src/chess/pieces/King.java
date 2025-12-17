package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

/**
 *
 * @author PLATINADO
 */
public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(color, board);
    }

    @Override
    public String toString() {

        return "K";
    }

    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);
        //acima
        p.setValue(position.getRow() - 1, position.getColumn());
        if (getBoard().positionExists(p) && canMove(p)) {

            mat[p.getRow()][p.getColumn()] = true;
        }

        //abaixo
        p.setValue(position.getRow() + 1, position.getColumn());
        if (getBoard().positionExists(p) && canMove(p)) {

            mat[p.getRow()][p.getColumn()] = true;
        }

        //a esquerda
        p.setValue(position.getRow(), position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {

            mat[p.getRow()][p.getColumn()] = true;
        }

        //abaixo
        p.setValue(position.getRow(), position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {

            mat[p.getRow()][p.getColumn()] = true;
        }

        //diagonalSuperiorEsquerda
        p.setValue(position.getRow() - 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {

            mat[p.getRow()][p.getColumn()] = true;
        }

        //diagonalSuperiorDireita
        p.setValue(position.getRow() - 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {

            mat[p.getRow()][p.getColumn()] = true;
        }

        //diagonalInferiorEsquerda
        p.setValue(position.getRow() + 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {

            mat[p.getRow()][p.getColumn()] = true;
        }

        //diagonalInferiorDireita
        p.setValue(position.getRow() + 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {

            mat[p.getRow()][p.getColumn()] = true;
        }

        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        return mat;

    }

}
