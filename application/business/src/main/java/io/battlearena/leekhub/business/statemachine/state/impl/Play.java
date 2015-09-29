package io.battlearena.leekhub.business.statemachine.state.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.battlearena.leekhub.business.statemachine.StatesMachine;
import io.battlearena.leekhub.business.statemachine.state.State;
import io.battlearena.leekhub.model.entity.PlayStatus;
import io.battlearena.leekhub.service.PlayService;

public class Play extends State {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Play.class);
	
	private PlayService playService;

	public Play() {
	}

	@Override
	public StatesMachine run() {
		PlayStatus status = playService.getPlayStatus();
		switch (status) {
		case KO:
			return StatesMachine.LOOSE;
		case OK:
		case PTT:
			return StatesMachine.GET_STATUS;
		default:
			LOGGER.error("Play Status {} inconnu", status.name());
			return null;
		}
	}

}
