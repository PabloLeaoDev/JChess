package com.chess.engine.pieces;

import java.util.List;

import com.chess.engine.Allience;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;

public abstract class Piece {
	protected final int piecePosition;
	protected final Allience pieceAllience;
	
	Piece(final int piecePosition, final Allience pieceAllience) {
		this.piecePosition = piecePosition;
		this.pieceAllience = pieceAllience;
	}
	
	public abstract List<Move> CalculateLegalMoves(final Board board);
}
