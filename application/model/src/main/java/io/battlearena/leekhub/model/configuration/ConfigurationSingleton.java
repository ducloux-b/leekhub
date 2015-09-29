package io.battlearena.leekhub.model.configuration;

public enum ConfigurationSingleton {
	INSTANCE;
	
	/** ID de notre equipe */
	private String idEquipe;

	public final String getIdEquipe() {
		return idEquipe;
	}

	public final void setIdEquipe(String idEquipe) {
		this.idEquipe = idEquipe;
	}
	
	

}
