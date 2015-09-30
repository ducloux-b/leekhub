package io.battlearena.leekhub.business.statemachine.state.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.battlearena.leekhub.business.statemachine.StatesMachine;
import io.battlearena.leekhub.business.statemachine.state.State;
import io.battlearena.leekhub.model.configuration.ConfigurationSingleton;
import io.battlearena.leekhub.service.WorkflowService;

@Component
public class GetIdEquipe extends State {
	
	@Autowired
	private WorkflowService workflowService;

	@Override
	public StatesMachine run() {
		
		while (StringUtils.isEmpty(ConfigurationSingleton.INSTANCE.getIdEquipe())) {
			ConfigurationSingleton.INSTANCE.setIdEquipe(workflowService.getIdEquipe("nomequipe", "password"));
		}
		if (ConfigurationSingleton.INSTANCE.getMode().equals(ConfigurationSingleton.TRAINING)) {
			return StatesMachine.NEW_GAME;
		} else {
			return StatesMachine.NEXT_GAME;
		}
	}

}
