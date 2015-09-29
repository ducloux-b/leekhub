package io.battlearena.leekhub.business.statemachine.state.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.battlearena.leekhub.business.statemachine.StatesMachine;
import io.battlearena.leekhub.business.statemachine.state.State;
import io.battlearena.leekhub.model.configuration.ConfigurationSingleton;
import io.battlearena.leekhub.model.entity.Status;
import io.battlearena.leekhub.service.GetStatusService;

public class GetStatus extends State {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GetStatus.class);
	
	private GetStatusService getStatusService;

	public GetStatus() {
	}

	@Override
	public StatesMachine run() {
		Status status = getStatusService.getStatus();
		switch (status) {
		case CANCELED:
		case NO:
			return StatesMachine.GET_STATUS;
		case LOOSE:
		case WIN:
			if (ConfigurationSingleton.INSTANCE.getMode().equals(ConfigurationSingleton.TRAINING)) {
				return StatesMachine.NEW_GAME;
			} else {
				return StatesMachine.NEXT_GAME;
			}
		case YES:
			return StatesMachine.GET_BOARD;
		default:
			LOGGER.error("Status {} non traité", status.name());
			return null;
		}
	}

}
