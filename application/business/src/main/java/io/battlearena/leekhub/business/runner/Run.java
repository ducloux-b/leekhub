package io.battlearena.leekhub.business.runner;

import io.battlearena.leekhub.business.statemachine.StatesMachine;

public class Run {
	public static void main(String[] args) {
		StatesMachine currentState = StatesMachine.GET_ID_EQUIPE;
		while(null != currentState) {
			currentState = currentState.process();
		}
	}
}
