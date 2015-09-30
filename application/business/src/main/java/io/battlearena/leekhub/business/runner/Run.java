package io.battlearena.leekhub.business.runner;

import io.battlearena.leekhub.business.statemachine.StatesMachine;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		StatesMachine currentState = StatesMachine.GET_ID_EQUIPE;
		while(null != currentState) {
			Thread.sleep(10);
			System.out.println(currentState.name());
			currentState = currentState.process();
		}
	}
}
