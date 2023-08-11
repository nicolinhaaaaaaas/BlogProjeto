import java.sql.Date;
import java.util.List;

public class Postagem {

	private int IdPostagem;
	private String titulo;
	private String conteudo;
	private Date dataPublicacao;
	private Usuario autor;
	private List<Comentario> comentarios;
	
	public Postagem(int IdPostagem, String titulo, String conteudo, Date dataPublicacao, Usuario autor, List<Comentario> comentarios) {
		this.IdPostagem = IdPostagem;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.dataPublicacao = dataPublicacao;
		this.autor = autor;
		this.comentarios = comentarios;
	}
	
	public void addComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	
	public int getIdPostagem() {
		return IdPostagem;
	}
	public void setIdPostagem(int idPostagem) {
		IdPostagem = idPostagem;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public Usuario getAutor() {
		return autor;
	}
	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
	
	
	
}
