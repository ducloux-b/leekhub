package io.battlearena.leekhub.model.configuration;

public enum ConfigurationSingleton {
	INSTANCE;

	/** ID de notre equipe */
	private String idEquipe = "02c4de37-e0e7-45e7-ad6b-96b3c4b22750";
	/** Mode entrainement */
	public final static String TRAINING = "train";
	/** Mode entrainement */
	public final static String BATTLE = "battle";
	/** Mode de jeu */
	private String mode = TRAINING;
	/** ID de la partie */
	private String idPartie;
	/** user */
	private String user = "LeekHub";
	/** mdp */
	private String password = "LH56FTljlj";

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

	public final String getUser() {
		return user;
	}

	public final void setUser(String user) {
		this.user = user;
	}

	public final String getPassword() {
		return password;
	}

	public final void setPassword(String password) {
		this.password = password;
	}

}
