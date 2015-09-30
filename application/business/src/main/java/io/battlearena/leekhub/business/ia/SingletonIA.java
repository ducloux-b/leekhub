package io.battlearena.leekhub.business.ia;

import io.battlearena.leekhub.model.entity.Action;
import io.battlearena.leekhub.model.entity.Board;

public enum SingletonIA {
	INSTANCE;
	
	private Board board;
	private Action action;
	public final Board getBoard() {
		return board;
	}
	public final void setBoard(Board board) {
		this.board = board;
	}
	public final Action getAction() {
		return action;
	}
	public final void setAction(Action action) {
		this.action = action;
	}
	
	public void performIA() {
		// TODO developper l'IA ICI
	}

}
