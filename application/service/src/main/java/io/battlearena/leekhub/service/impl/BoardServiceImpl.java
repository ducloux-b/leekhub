package io.battlearena.leekhub.service.impl;

import io.battlearena.client.BattlearenaIo_TestWs.Root;
import io.battlearena.leekhub.model.entity.Board;
import io.battlearena.leekhub.service.BoardService;
import io.battlearena.leekhub.singleton.ClientSingleton;
import io.battlearena.leekhub.singleton.RootSingleton;

public class BoardServiceImpl implements BoardService {

	@Override
	public Board getBoard(String idPartie) {
		Root root = RootSingleton.getInstance(ClientSingleton.getInstance());
		return null;
	}
	
}
