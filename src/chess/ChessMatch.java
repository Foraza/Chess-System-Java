package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		this.board = new Board(8, 8);
		this.initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		this.board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	public  void initialSetup() {
		this.placeNewPiece('c', 1, new Rook(board, Colors.WHITE));
		this.placeNewPiece('c', 2, new Rook(board, Colors.WHITE));
		this.placeNewPiece('d', 2, new Rook(board, Colors.WHITE));
		this.placeNewPiece('e', 2, new Rook(board, Colors.WHITE));
		this.placeNewPiece('e', 1, new Rook(board, Colors.WHITE));
		this.placeNewPiece('d', 1, new King(board, Colors.WHITE));

		this.placeNewPiece('c', 7, new Rook(board, Colors.BLACK));
		this.placeNewPiece('c', 8, new Rook(board, Colors.BLACK));
		this.placeNewPiece('d', 7, new Rook(board, Colors.BLACK));
		this.placeNewPiece('e', 7, new Rook(board, Colors.BLACK));
		this.placeNewPiece('e', 8, new Rook(board, Colors.BLACK));
		this.placeNewPiece('d', 8, new King(board, Colors.BLACK));
	}
}
