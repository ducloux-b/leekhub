package io.battlearena.leekhub.business.statemachine;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.battlearena.leekhub.business.statemachine.state.State;
import io.battlearena.leekhub.business.statemachine.state.impl.Perdu;

public enum StatesMachine {
	GET_ID_EQUIPE { 
		public StatesMachine process() {
			return this.getGetIdEquipe().run();
		}
	},
	NEW_GAME {
		public StatesMachine process() {
			return this.getNewGame().run();
		}
	},
	NEXT_GAME {
		public StatesMachine process() {
			return this.getNextGame().run();
		}
	},
	GET_STATUS {
		public StatesMachine process() {
			return this.getGetStatus().run();
		}
	},
	GET_BOARD {
		public StatesMachine process() {
			return this.getGetBoard().run();
		}
	},
	PLAY {
		public StatesMachine process() {
			return this.getPlay().run();
		}
	},
	LOOSE {
		public StatesMachine process() {
			// FIN DE JEU
			return null;
		}
	};
	
	
	
	public abstract StatesMachine process();
	
	private static String idEquipe;
	private static String idPartie;
	private static StatesMachine currentStep;
	
	private ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] {"Spring-context.xml"});
	
	private State getIdEquipe = (State) appContext.getBean("getIdEquipe");
	private State newGame = (State) appContext.getBean("newGame");
	private State nextGame = (State) appContext.getBean("nextGame");
	private State getStatus = (State) appContext.getBean("getStatus");
	private State getBoard = (State) appContext.getBean("getBoard");
	private State play = (State) appContext.getBean("play");
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
