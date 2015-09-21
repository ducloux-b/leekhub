package io.battlearena.leekhub.business.statemachine;

import io.battlearena.leekhub.business.statemachine.state.State;
import io.battlearena.leekhub.business.statemachine.state.impl.GetBoard;
import io.battlearena.leekhub.business.statemachine.state.impl.GetIdEquipe;
import io.battlearena.leekhub.business.statemachine.state.impl.GetStatus;
import io.battlearena.leekhub.business.statemachine.state.impl.NewGame;
import io.battlearena.leekhub.business.statemachine.state.impl.NextGame;
import io.battlearena.leekhub.business.statemachine.state.impl.Perdu;
import io.battlearena.leekhub.business.statemachine.state.impl.Play;

public enum StatesMachine {
	GET_ID_EQUIPE { 
		public StatesMachine process() {
			return this.getGetIdEquipe().run();
		}
	},
	NEW_GAME {
		StatesMachine process() {
			return this.getNewGame().run();
		}
	},
	NEXT_GAME {
		StatesMachine process() {
			return this.getNextGame().run();
		}
	},
	GET_STATUS {
		StatesMachine process() {
			return this.getGetStatus().run();
		}
	},
	GET_BOARD {
		StatesMachine process() {
			return this.getGetBoard().run();
		}
	},
	PLAY {
		StatesMachine process() {
			return this.getPlay().run();
		}
	},
	LOOSE {
		StatesMachine process() {
			// FIN DE JEU
			return null;
		}
	};
	
	
	
	abstract StatesMachine process();
	
	private static String idEquipe;
	private static String idPartie;
	private static StatesMachine currentStep;
	
	private State getIdEquipe = new GetIdEquipe();
	private State newGame = new NewGame();
	private State nextGame = new NextGame();
	private State getStatus = new GetStatus();
	private State getBoard = new GetBoard();
	private State play = new Play();
	private State perdu = new Perdu();
	
	public State getGetIdEquipe() {
		return getIdEquipe;
	}
	public State getNewGame() {
		return newGame;
	}
	public State getNextGame() {
		return nextGame;
	}
	public State getGetStatus() {
		return getStatus;
	}
	public State getGetBoard() {
		return getBoard;
	}
	public State getPlay() {
		return play;
	}
	public State getPerdu() {
		return perdu;
	}
	public static String getIdEquipe() {
		return idEquipe;
	}
	public static void setIdEquipe(String pIdEquipe) {
		idEquipe = pIdEquipe;
	}
	public static String getIdPartie() {
		return idPartie;
	}
	public static void setIdPartie(String pIdPartie) {
		idPartie = pIdPartie;
	}
	public static StatesMachine getCurrentStep() {
		return currentStep;
	}
	public static void setCurrentStep(StatesMachine pCurrentStep) {
		currentStep = pCurrentStep;
	}

}
