package io.battlearena.leekhub.business.ia;

import io.battlearena.leekhub.model.configuration.ConfigurationSingleton;
import io.battlearena.leekhub.model.entity.Action;
import io.battlearena.leekhub.model.entity.Board;
import io.battlearena.leekhub.model.entity.Player;

public enum SingletonIA {
	INSTANCE;
	
	private Board board;
	private Action action;
	private Integer level = 1;
	
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
	
	public final Integer getLevel() {
		return level;
	}
	public final void setLevel(Integer level) {
		this.level = level;
	}
	public void performIA() {
		Player me;
		Player enemy;
		if(board.getPlayer1().getName().equals(ConfigurationSingleton.INSTANCE.getUser())){
			me = board.getPlayer1();
			enemy = board.getPlayer2();			
		}else{
			enemy = board.getPlayer1();
			me = board.getPlayer2();		
		}
		
		if (me.getBullet()==0){
			if (me.isFocused()){ //TODO nbCover<7
				action =  Action.COVER;
				return;
			}else{
				action =   Action.RELOAD;
				return;
			}
		}else{
			if (me.isFocused()){
				action =   Action.SHOOT;
				return;
			}else{
				if(enemy.isFocused() || enemy.getHealth()<=2){
					action =   Action.SHOOT;
					return;
				}else{
					if(me.getBullet()<2){
						action =   Action.RELOAD;
						return;
					}else{
						action =   Action.AIM;
						return;
					}
				}
			}
			
		}
	}

}
