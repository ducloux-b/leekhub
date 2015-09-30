package io.battlearena.leekhub.service.impl;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import io.battlearena.leekhub.tools.client.BattlearenaIo_TestWs.Root;
import io.battlearena.leekhub.tools.client.BattlearenaIo_TestWs.Root.GameBoardIdPartie;
import io.battlearena.leekhub.tools.singleton.ClientSingleton;
import io.battlearena.leekhub.tools.singleton.RootSingleton;
import io.battlearena.leekhub.model.entity.Board;
import io.battlearena.leekhub.service.WorkflowService;

@Service(value="workflowService")
public class WorkflowServiceImpl implements WorkflowService {
	
	public String getIdEquipe(String nomEquipe, String password) {
		Root root = RootSingleton.getInstance(ClientSingleton.getInstance());
		return root.playerGetIdEquipeNomEquipeMotDePasse(nomEquipe, password).getAsTextPlain(String.class);
	}
	
	public String newGame(String level, String idEquipe) {
		Root root = RootSingleton.getInstance(ClientSingleton.getInstance());
		return root.practiceNewLevelIdEquipe(level, idEquipe).getAsTextPlain(String.class);
	}

	public String nextGame(String idEquipe) {
		Root root = RootSingleton.getInstance(ClientSingleton.getInstance());
		return root.practiceNextIdEquipe(idEquipe).getAsTextPlain(String.class);
	}

	public String getStatus(String idPartie, String idEquipe) {
		Root root = RootSingleton.getInstance(ClientSingleton.getInstance());
		return root.gameStatusIdPartieIdEquipe(idPartie, idEquipe).getAsTextPlain(String.class);
	}
	
	public Board getBoard(String idPartie) {
		Gson gson = new Gson();
		Root root = RootSingleton.getInstance(ClientSingleton.getInstance());
		GameBoardIdPartie board = root.gameBoardIdPartie(idPartie);
		return gson.fromJson(board.getAs(String.class), Board.class);
	}
}
