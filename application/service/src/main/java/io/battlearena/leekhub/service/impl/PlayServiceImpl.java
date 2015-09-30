package io.battlearena.leekhub.service.impl;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import io.battlearena.leekhub.model.entity.Action;
import io.battlearena.leekhub.model.entity.Board;
import io.battlearena.leekhub.model.entity.PlayStatus;
import io.battlearena.leekhub.service.PlayService;
import io.battlearena.leekhub.tools.client.IP521913975_BattleWs.Duel;
import io.battlearena.leekhub.tools.singleton.ClientSingleton;
import io.battlearena.leekhub.tools.singleton.RootSingleton;

@Service(value="playService")
public class PlayServiceImpl implements PlayService {

	@Override
	public PlayStatus getPlayStatus(String idPartie, String idEquipe, Action move) {
		Gson gson = new Gson();
		Duel root = RootSingleton.getInstance(ClientSingleton.getInstance());
		return gson.fromJson(root.gamePlayIdPartieIdEquipeMove(idPartie, idEquipe, move.toString()).getAsJson(String.class), PlayStatus.class);
	}
	
	@Override
	public Board getBoard(String idPartie) {
		Gson gson = new Gson();
		Duel root = RootSingleton.getInstance(ClientSingleton.getInstance());
		return gson.fromJson(root.gameBoardIdPartie(idPartie).getAsJson(String.class), Board.class);
	}

	@Override
	public Action getLastMove(String idPartie, String idEquipe) {
		Gson gson = new Gson();
		Duel root = RootSingleton.getInstance(ClientSingleton.getInstance());
		return gson.fromJson(root.gameGetlastmoveIdPartieIdEquipe(idPartie, idEquipe).getAsJson(String.class), Action.class);
	}

	@Override
	public PlayStatus move(String idPartie, String idEquipe, Action move) {
		Gson gson = new Gson();
		Duel root = RootSingleton.getInstance(ClientSingleton.getInstance());
		return gson.fromJson(root.gamePlayIdPartieIdEquipeMove(idPartie, idEquipe, move.toString()).getAsJson(String.class), PlayStatus.class);
	}

	@Override
	public String getOpponent(String idPartie, String idEquipe) {
		Gson gson = new Gson();
		Duel root = RootSingleton.getInstance(ClientSingleton.getInstance());
		return gson.fromJson(root.gameOpponentIdPartieIdEquipe(idPartie, idEquipe).getAsJson(String.class), String.class);
	}
}


