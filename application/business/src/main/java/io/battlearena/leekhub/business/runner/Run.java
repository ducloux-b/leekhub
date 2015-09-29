package io.battlearena.leekhub.business.runner;

import io.battlearena.leekhub.business.statemachine.state.State;
import io.battlearena.leekhub.business.statemachine.state.impl.GetIdEquipe;

public class Run {
	
	private static final State START_SATE = new GetIdEquipe();

	public static void main(String[] args) {
		State currentState = START_SATE;
		while(null != currentState) {
			currentState = currentState.run();
		}
	}
}
