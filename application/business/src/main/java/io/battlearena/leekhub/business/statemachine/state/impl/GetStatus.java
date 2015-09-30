package io.battlearena.leekhub.business.statemachine.state.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.battlearena.leekhub.business.statemachine.StatesMachine;
import io.battlearena.leekhub.business.statemachine.state.State;
import io.battlearena.leekhub.model.configuration.ConfigurationSingleton;
import io.battlearena.leekhub.model.entity.Status;
import io.battlearena.leekhub.service.WorkflowService;

@Component
public class GetStatus extends State {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GetStatus.class);

	@Autowired
	private WorkflowService workflowService;

	public GetStatus() {
	}

	@Override
	public StatesMachine run() {
		Status status = Status.valueOf(workflowService.getStatus(ConfigurationSingleton.INSTANCE.getIdPartie(), ConfigurationSingleton.INSTANCE.getIdEquipe()));
		switch (status) {
		case CANCELLED:
		case CANTPLAY:
			return StatesMachine.GET_STATUS;
		case DEFEAT:
		case VICTORY:
			if (ConfigurationSingleton.INSTANCE.getMode().equals(ConfigurationSingleton.TRAINING)) {
				return StatesMachine.NEW_GAME;
			} else {
				return StatesMachine.NEXT_GAME;
			}
		case CANPLAY:
			return StatesMachine.GET_BOARD;
		default:
			LOGGER.error("Status {} non trait�", status.name());
			return null;
		}
	}

}
