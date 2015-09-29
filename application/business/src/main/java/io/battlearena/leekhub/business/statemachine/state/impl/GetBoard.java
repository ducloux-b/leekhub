package io.battlearena.leekhub.business.statemachine.state.impl;

import io.battlearena.leekhub.business.statemachine.StatesMachine;
import io.battlearena.leekhub.business.statemachine.state.State;
import io.battlearena.leekhub.service.GetBoardService;

public class GetBoard extends State {
	
	private GetBoardService getBoardService;

	public GetBoard() {
	}

	@Override
	public StatesMachine run() {
		getBoardService.getPlay();
		return StatesMachine.PLAY;
	}

}
