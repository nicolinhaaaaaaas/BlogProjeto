
public enum CargoUsuario {

	ADMIN("Admin"),
	AUTOR("Autor"),
	CONVIDADO("Convidado");
	
	private final String displayNome;
	
	CargoUsuario(String displayNome){
		this.displayNome = displayNome;
	}
	
	public String getDisplayNome() {
		return displayNome;
	}
}
