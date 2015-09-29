package io.battlearena.leekhub.service.impl;

import com.google.gson.Gson;

import io.battlearena.client.BattlearenaIo_TestWs.Root;
import io.battlearena.client.BattlearenaIo_TestWs.Root.GameBoardIdPartie;
import io.battlearena.leekhub.model.entity.Board;
import io.battlearena.leekhub.service.BoardService;
import io.battlearena.leekhub.singleton.ClientSingleton;
import io.battlearena.leekhub.singleton.RootSingleton;

public class BoardServiceImpl implements BoardService {

	@Override
	public Board getBoard(String idPartie) {
		Gson gson = new Gson();
		Root root = RootSingleton.getInstance(ClientSingleton.getInstance());
		GameBoardIdPartie board = root.gameBoardIdPartie(idPartie);
		Board b = gson.fromJson(board.getAs(String.class), Board.class);
		return null;
	}
	
}
