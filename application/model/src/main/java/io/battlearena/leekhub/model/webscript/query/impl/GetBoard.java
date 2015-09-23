package io.battlearena.leekhub.model.webscript.query.impl;

import io.battlearena.leekhub.model.entity.Board;
import io.battlearena.leekhub.model.web.HTTPVerb;
import io.battlearena.leekhub.model.webscript.query.IWSQuery;
import io.battlearena.leekhub.model.webscript.response.impl.BoardResponse;

public class GetBoard extends IWSQuery<Board, BoardResponse> {

	public GetBoard(String idPartie) {
		super(new BoardResponse(), "game/board/"+idPartie, null, HTTPVerb.GET);
	}

}
