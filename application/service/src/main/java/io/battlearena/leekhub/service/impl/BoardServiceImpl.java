package io.battlearena.leekhub.service.impl;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import io.battlearena.leekhub.model.entity.Board;
import io.battlearena.leekhub.service.BoardService;
import io.battlearena.leekhub.tools.client.IP521913975_BattleWs.Duel;
import io.battlearena.leekhub.tools.client.IP521913975_BattleWs.Duel.GameBoardIdPartie;
import io.battlearena.leekhub.tools.singleton.ClientSingleton;
import io.battlearena.leekhub.tools.singleton.RootSingleton;

@Service(value="boardService")
public class BoardServiceImpl implements BoardService {

	@Override
	public Board getBoard(String idPartie) {
		Gson gson = new Gson();
		Duel root = RootSingleton.getInstance(ClientSingleton.getInstance());
		GameBoardIdPartie board = root.gameBoardIdPartie(idPartie);
		return gson.fromJson(board.getAsJson(String.class), Board.class);
	}
	
}
