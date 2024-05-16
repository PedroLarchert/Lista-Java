package exercicio1;

public class DiasAula {
	
	private String data;
	private String horario;
	private Turma turma;
	
	
	public DiasAula() {
		
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public Turma getTurma() {
		return turma;
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public void exibirDia() {
	System.out.println("_______________________________________________ ");
	System.out.println("Data: "+data);
	System.out.println("horario: "+horario);
	turma.exibirturma();
	System.out.println("_______________________________________________ ");
	
	}
}

