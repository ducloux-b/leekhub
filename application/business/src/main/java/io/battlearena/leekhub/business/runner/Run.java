package io.battlearena.leekhub.business.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.battlearena.leekhub.business.ia.SingletonIA;
import io.battlearena.leekhub.business.statemachine.StatesMachine;
import io.battlearena.leekhub.service.PlayService;
@Component
public class Run {
	public PlayService getPlayService() {
		return playService;
	}

	public void setPlayService(PlayService playService) {
		playService = playService;
	}

	@Autowired
	static
	PlayService playService;
	
	public Run() {
		super();
	}

	public static void main(String[] args) throws InterruptedException {
		StatesMachine currentState = StatesMachine.GET_ID_EQUIPE;
		SingletonIA.INSTANCE.setPlayService(playService);
		while(null != currentState) {
			Thread.sleep(10);
			System.out.println(currentState.name());
			currentState = currentState.process();
		}
		
	}
}
