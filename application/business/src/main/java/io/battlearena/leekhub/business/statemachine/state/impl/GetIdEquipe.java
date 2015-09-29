package io.battlearena.leekhub.business.statemachine.state.impl;

import io.battlearena.leekhub.business.statemachine.state.State;
import io.battlearena.leekhub.model.configuration.ConfigurationSingleton;
import io.battlearena.leekhub.service.GetIdEquipeService;

public class GetIdEquipe extends State {
	
	private GetIdEquipeService getIdEquipeService;

	@Override
	public State run() {
		ConfigurationSingleton.INSTANCE.setIdEquipe(getIdEquipeService.getIdEquipe());
		return null;
	}

}
