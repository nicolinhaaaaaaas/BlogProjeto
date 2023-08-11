import java.sql.Date;

public class Usuario {

	private int IdUsuario;
	private String nome;
	private String senha;
	private String email;
	private Date dataRegistro;
	private CargoUsuario cargo;
	
	public Usuario(int IdUsuario, String nome, String senha, String email, Date dataRegistro, CargoUsuario cargo) {
		this.IdUsuario = IdUsuario;
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.dataRegistro = dataRegistro;
		this.cargo = cargo;
	}
	
	public int getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(int IdUsuario) {
		this.IdUsuario = IdUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public CargoUsuario getCargo() {
		return cargo;
	}
	public void setCargo(CargoUsuario cargo) {
		this.cargo = cargo;
	}
	
	
}
