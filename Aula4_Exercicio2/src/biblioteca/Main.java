package biblioteca;

public class Main {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro("Pequeno Principe");
		Periodico periodico1 = new Periodico("computer science",3);
		
		livro1.emprestimo();
		
		System.out.println("o livro: "+livro1.getTitulo()+" disponivel = "+livro1.isDisponivel());
		
		livro1.devolvido();
		
		System.out.println("o livro: "+livro1.getTitulo()+" disponivel = "+livro1.isDisponivel());
		
		System.out.println("periodico: "+periodico1.getTitulo()+" volume "+periodico1.getVolume());
	}

}
