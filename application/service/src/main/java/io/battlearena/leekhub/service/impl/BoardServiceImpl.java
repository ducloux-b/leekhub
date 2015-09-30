package io.battlearena.leekhub.service.impl;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import io.battlearena.leekhub.model.entity.Board;
import io.battlearena.leekhub.service.BoardService;
import io.battlearena.leekhub.tools.client.BattlearenaIo_TestWs.Root;
import io.battlearena.leekhub.tools.client.BattlearenaIo_TestWs.Root.GameBoardIdPartie;
import io.battlearena.leekhub.tools.singleton.ClientSingleton;
import io.battlearena.leekhub.tools.singleton.RootSingleton;

@Service(value="boardService")
public class BoardServiceImpl implements BoardService {

	@Override
	public Board getBoard(String idPartie) {
		Gson gson = new Gson();
		Root root = RootSingleton.getInstance(ClientSingleton.getInstance());
		GameBoardIdPartie board = root.gameBoardIdPartie(idPartie);
		return gson.fromJson(board.getAs(String.class), Board.class);
	}
	
}
