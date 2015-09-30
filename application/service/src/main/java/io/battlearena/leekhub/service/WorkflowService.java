package io.battlearena.leekhub.service;

import io.battlearena.leekhub.model.entity.Board;

public interface WorkflowService {
	
	public String getIdEquipe(String nomEquipe, String password);
	
	public String newGame(String level, String idEquipe);

	public String nextGame(String idEquipe);

	public String getStatus(String idPartie, String idEquipe);
	
	public Board getBoard(String idPartie);
	
}
