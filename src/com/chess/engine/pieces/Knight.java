package com.chess.engine.pieces;

import java.util.ArrayList;
import java.util.List;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;
import com.chess.engine.board.Tile;
import com.google.common.collect.ImmutableList;

public class Knight extends Piece {

	private final static int[] CANDIDATES_MOVES_COORDINATES = { -17, -15, -10, -6, 6, 10, 15, 17 };

	Knight(final int piecePosition, final Alliance pieceAlliance) {
		super(piecePosition, pieceAlliance);
	}

	@Override
	public List<Move> CalculateLegalMoves(Board board) {
		int candidateDestinationCoordinate;
		final List<Move> legalMoves = new ArrayList<>();
		for (final int currentCandidate : CANDIDATES_MOVES_COORDINATES) {
			candidateDestinationCoordinate = this.piecePosition + currentCandidate;
			if (true /* isValidCoordinate */) {
				final Tile candidateDestinationTile = board.getTile(candidateDestinationCoordinate);
				if (!candidateDestinationTile.isTileOccupied()) {
					legalMoves.add(new Move());
				} else {
					final Piece pieceAtDestination = candidateDestinationTile.getPiece();
					final Alliance pieceAlliance = pieceAtDestination.getPieceAlliance();
					if (this.pieceAlliance != pieceAlliance) {
						legalMoves.add(new Move());
					}
				}
			}
		}
		return ImmutableList.copyOf(legalMoves);
	}

}
