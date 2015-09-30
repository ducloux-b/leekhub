package io.battlearena.leekhub.business.statemachine.state.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.battlearena.leekhub.business.statemachine.StatesMachine;
import io.battlearena.leekhub.business.statemachine.state.State;
import io.battlearena.leekhub.model.configuration.ConfigurationSingleton;
import io.battlearena.leekhub.service.WorkflowService;

@Component
public class NewGame extends State {

	@Autowired
	private WorkflowService workflowService;

	@Override
	public StatesMachine run() {
		System.out.println("Nouvelle partie");
		while(StringUtils.isEmpty(ConfigurationSingleton.INSTANCE.getIdPartie())) {
			ConfigurationSingleton.INSTANCE.setIdPartie(workflowService.newGame("1", ConfigurationSingleton.INSTANCE.getIdEquipe()));
		}
		return StatesMachine.GET_STATUS;
	}

}
