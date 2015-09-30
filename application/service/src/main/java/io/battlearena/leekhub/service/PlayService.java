package io.battlearena.leekhub.service;

import io.battlearena.leekhub.model.entity.Action;
import io.battlearena.leekhub.model.entity.Board;
import io.battlearena.leekhub.model.entity.PlayStatus;

/**
 * Definitif
 * @author leperrin
 *
 */
public interface PlayService {
	public PlayStatus getPlayStatus(String idPartie, String idEquipe, Action move);
	public Board getBoard(String idPartie);
	public Action getLastMove(String idPartie, String idEquipe);
	public PlayStatus move(String idPartie, String idEquipe, Action move);
	public String getOpponent(String idPartie, String idEquipe);
}
