package io.battlearena.leekhub.business.statemachine.state.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.battlearena.leekhub.business.statemachine.StatesMachine;
import io.battlearena.leekhub.business.statemachine.state.State;
import io.battlearena.leekhub.model.configuration.ConfigurationSingleton;
import io.battlearena.leekhub.service.WorkflowService;

@Component
public class NextGame extends State {

	@Autowired
	private WorkflowService workflowService;

	public NextGame() {
	}

	@Override
	public StatesMachine run() {
		while(StringUtils.isEmpty(ConfigurationSingleton.INSTANCE.getIdPartie())) {
			ConfigurationSingleton.INSTANCE.setIdPartie(workflowService.nextGame(ConfigurationSingleton.INSTANCE.getIdPartie()));
		}
		return StatesMachine.GET_STATUS;
	}

}
