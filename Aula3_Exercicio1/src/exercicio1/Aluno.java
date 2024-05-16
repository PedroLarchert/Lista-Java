package exercicio1;

public class Aluno {
	private String nome;
	private int matricula;
	private String dataNasc;
	
	
	public Aluno(String nome, int matricula, String dataNasc){
		this.nome = nome;
		this.matricula= matricula;
		this.dataNasc = dataNasc;
	}
	
	public Aluno() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public void registrarAluno() {
		
	}
	
	public void exibirAluno() {
		System.out.println("_________________________________________________________");
		System.out.println("Nome do aluno: "+ nome);
		System.out.println("Matricula do aluno : "+ matricula);
		System.out.println("Data de nascimento do aluno: "+ dataNasc);
		System.out.println("_________________________________________________________");
		
	}
	 
}
