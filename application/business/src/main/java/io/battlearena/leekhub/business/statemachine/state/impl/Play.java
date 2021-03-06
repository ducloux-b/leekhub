package io.battlearena.leekhub.business.statemachine.state.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.battlearena.leekhub.business.ia.SingletonIA;
import io.battlearena.leekhub.business.statemachine.StatesMachine;
import io.battlearena.leekhub.business.statemachine.state.State;
import io.battlearena.leekhub.model.configuration.ConfigurationSingleton;
import io.battlearena.leekhub.model.entity.PlayStatus;
import io.battlearena.leekhub.service.PlayService;

@Component
public class Play extends State {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Play.class);

	@Autowired
	private PlayService playService;

	public Play() {
	}

	@Override
	public StatesMachine run() {
		SingletonIA.INSTANCE.performIA();
		PlayStatus status = playService.getPlayStatus(ConfigurationSingleton.INSTANCE.getIdPartie(), ConfigurationSingleton.INSTANCE.getIdEquipe(), SingletonIA.INSTANCE.getAction());
		
		switch (status) {
		case FORBIDDEN:
		case GAMEOVER:
			return StatesMachine.LOOSE;
		case OK:
		case NOTYET:
			return StatesMachine.GET_STATUS;
		default:
			LOGGER.error("Play Status {} inconnu", status.name());
			return null;
		}
	}

}