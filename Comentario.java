import java.sql.Date;

public class Comentario {
	
	private int IdComentario;
	private String texto;
	private Date dataComentario;
	private Usuario autor;
	
	public Comentario(int IdComentario, String texto, Date dataComentario, Usuario autor) {
		this.IdComentario = IdComentario;
		this.texto = texto;
		this.dataComentario = dataComentario;
		this.autor = autor;
	}
	
	public int getIdComentario() {
		return IdComentario;
	}
	public void setIdComentario(int idComentario) {
		IdComentario = idComentario;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getDataComentario() {
		return dataComentario;
	}
	public void setDataComentario(Date dataComentario) {
		this.dataComentario = dataComentario;
	}
	public Usuario getAutor() {
		return autor;
	}
	public void setAutor(Usuario autor) {
		this.autor = autor;
	}

}
