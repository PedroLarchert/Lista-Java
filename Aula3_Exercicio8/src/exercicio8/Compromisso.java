package exercicio8;

public class Compromisso {
	
	private  Mes mes;
	private  String descricao;
	
	public Compromisso(Mes mes, String descricao) {
		this.mes = mes;
		this.descricao = descricao;
	}
	
	public Mes getMes() {
        return mes;
    }

    public String getDescricao() {
        return descricao;
    }

}
