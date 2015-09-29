package io.battlearena.leekhub.model.configuration;

public enum ConfigurationSingleton {
	INSTANCE;
	
	/** ID de notre equipe */
	private String idEquipe;
	/** Mode entrainement */
	public final static String TRAINING = "train"; 
	/** Mode entrainement */
	public final static String BATTLE = "battle"; 
	/** Mode de jeu */
	private String mode = TRAINING;
	/** ID de la partie */
	private String idPartie;

	public final String getIdEquipe() {
		return idEquipe;
	}

	public final void setIdEquipe(String idEquipe) {
		this.idEquipe = idEquipe;
	}

	public final String getMode() {
		return mode;
	}

	public final void setMode(String mode) {
		this.mode = mode;
	}

	public String getIdPartie() {
		return idPartie;
	}

	public void setIdPartie(String idPartie) {
		this.idPartie = idPartie;
	}
	
	

}
