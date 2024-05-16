package biblioteca;

public class Livro extends Biblioteca{
	private boolean disponivel ;
	
	public Livro() {
		
	}
	
	public Livro(String titulo) {
		this.titulo = titulo;
		disponivel = true;
	}
	
	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	
	
	public void emprestimo() {
		disponivel = false;
	}
	
	public void devolvido(){
		disponivel = true;
	}
}
