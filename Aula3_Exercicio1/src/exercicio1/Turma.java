package exercicio1;

public class Turma {
	private int codigo;
	private String disciplina;
	
	public Turma(int codigo, String disciplina) {
		this.codigo = codigo;
		this.disciplina = disciplina;
		
	}
	
	public Turma() {
		
	}
	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public void exibirturma() {
		System.out.println("_______________________________________________ ");
		System.out.println("codigo da turma: "+codigo);
		System.out.println("disciplina: "+disciplina);
		System.out.println("_______________________________________________ ");
	}
	
	
	
}
