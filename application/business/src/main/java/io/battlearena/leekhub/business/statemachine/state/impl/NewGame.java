package io.battlearena.leekhub.business.statemachine.state.impl;

import org.apache.commons.lang3.StringUtils;

import io.battlearena.leekhub.business.statemachine.StatesMachine;
import io.battlearena.leekhub.business.statemachine.state.State;
import io.battlearena.leekhub.model.configuration.ConfigurationSingleton;
import io.battlearena.leekhub.service.NewGameService;

public class NewGame extends State {
	
	private NewGameService newGameService;

	public NewGame() {
	}

	@Override
	public StatesMachine run() {
		while(StringUtils.isEmpty(ConfigurationSingleton.INSTANCE.getIdPartie())) {
			ConfigurationSingleton.INSTANCE.setIdPartie(newGameService.getIdPartie());
		}
		return StatesMachine.GET_STATUS;
	}

}
