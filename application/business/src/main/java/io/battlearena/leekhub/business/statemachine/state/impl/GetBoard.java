package io.battlearena.leekhub.business.statemachine.state.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.battlearena.leekhub.business.statemachine.StatesMachine;
import io.battlearena.leekhub.business.statemachine.state.State;
import io.battlearena.leekhub.model.configuration.ConfigurationSingleton;
import io.battlearena.leekhub.service.WorkflowService;

@Component
public class GetBoard extends State {

	@Autowired
	private WorkflowService workflowService;

	public GetBoard() {
	}

	@Override
	public StatesMachine run() {
		workflowService.getBoard(ConfigurationSingleton.INSTANCE.getIdPartie());
		return StatesMachine.PLAY;
	}

}
