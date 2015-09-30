package io.battlearena.leekhub.business.statemachine.state.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.battlearena.leekhub.business.ia.SingletonIA;
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
		while(StringUtils.isEmpty(ConfigurationSingleton.INSTANCE.getIdPartie()) || ConfigurationSingleton.INSTANCE.getIdPartie().equals("NA")) {
			ConfigurationSingleton.INSTANCE.setIdPartie(workflowService.newGame(SingletonIA.INSTANCE.getLevel().toString(), ConfigurationSingleton.INSTANCE.getIdEquipe()));
			System.out.println("Id Partie: "+ ConfigurationSingleton.INSTANCE.getIdPartie());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Id Partie: "+ ConfigurationSingleton.INSTANCE.getIdPartie());
		return StatesMachine.GET_STATUS;
	}

}
