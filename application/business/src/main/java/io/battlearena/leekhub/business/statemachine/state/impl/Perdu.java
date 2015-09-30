package io.battlearena.leekhub.business.statemachine.state.impl;

import io.battlearena.leekhub.business.statemachine.StatesMachine;
import io.battlearena.leekhub.business.statemachine.state.State;
import io.battlearena.leekhub.service.PerduService;

public class Perdu extends State {
	
	private PerduService perduService;

	public Perdu() {
	}

	@Override
	public StatesMachine run() {
		perduService.getPerdu();
		return null;
	}

}
