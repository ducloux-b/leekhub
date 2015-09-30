package io.battlearena.leekhub.model.webscript.response.impl;

import io.battlearena.leekhub.model.entity.Board;
import io.battlearena.leekhub.model.webscript.response.IWSResponse;

public class BoardResponse extends IWSResponse<Board> {
	
	Board board;

	@Override
	public Class<Board> getResponseType() {
		return Board.class;
	}

	@Override
	public void setResponseValue(Board resonseValue) {
		board = resonseValue;
	}
	
	public void displayResult() {
		System.out.println(board.toString());
	}

}
