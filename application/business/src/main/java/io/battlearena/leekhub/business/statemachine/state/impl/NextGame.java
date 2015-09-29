package io.battlearena.leekhub.business.statemachine.state.impl;

import org.apache.commons.lang3.StringUtils;

import io.battlearena.leekhub.business.statemachine.StatesMachine;
import io.battlearena.leekhub.business.statemachine.state.State;
import io.battlearena.leekhub.model.configuration.ConfigurationSingleton;
import io.battlearena.leekhub.service.NextGameService;

public class NextGame extends State {
	
	private NextGameService nextGameService;

	public NextGame() {
	}

	@Override
	public StatesMachine run() {
		while(StringUtils.isEmpty(ConfigurationSingleton.INSTANCE.getIdPartie())) {
			ConfigurationSingleton.INSTANCE.setIdPartie(nextGameService.getIdPartie());
		}
		return StatesMachine.GET_STATUS;
	}

}
