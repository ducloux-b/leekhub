package io.battlearena.leekhub.service.impl;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import io.battlearena.leekhub.tools.client.IP521913975_BattleWs.Duel;
import io.battlearena.leekhub.tools.client.IP521913975_BattleWs.Duel.GameBoardIdPartie;
import io.battlearena.leekhub.tools.singleton.ClientSingleton;
import io.battlearena.leekhub.tools.singleton.RootSingleton;
import io.battlearena.leekhub.model.entity.Board;
import io.battlearena.leekhub.service.WorkflowService;

@Service(value="workflowService")
public class WorkflowServiceImpl implements WorkflowService {
	
	public String ping() {
		Duel root = RootSingleton.getInstance(ClientSingleton.getInstance());
		return root.ping().getAsJson(String.class);
	}
	
	public String getIdEquipe(String nomEquipe, String password) {
		Duel root = RootSingleton.getInstance(ClientSingleton.getInstance());
		return root.playerGetIdEquipeNomEquipeMotDePasse(nomEquipe, password).getAsJson(String.class);
	}
	
	public String newGame(String level, String idEquipe) {
		Duel root = RootSingleton.getInstance(ClientSingleton.getInstance());
		return root.practiceNewLevelIdEquipe(level, idEquipe).getAsJson(String.class);
	}

	public String nextGame(String idEquipe) {
		Duel root = RootSingleton.getInstance(ClientSingleton.getInstance());
		return root.versusNextIdEquipe(idEquipe).getAsJson(String.class);
	}

	public String getStatus(String idPartie, String idEquipe) {
		Duel root = RootSingleton.getInstance(ClientSingleton.getInstance());
		return root.gameStatusIdPartieIdEquipe(idPartie, idEquipe).getAsJson(String.class);
	}
	
	public Board getBoard(String idPartie) {
		Gson gson = new Gson();
		Duel root = RootSingleton.getInstance(ClientSingleton.getInstance());
		GameBoardIdPartie board = root.gameBoardIdPartie(idPartie);
		return gson.fromJson(board.getAsJson(String.class), Board.class);
	}
}
