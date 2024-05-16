package exercicio8;

public class Mes {
	public static final Mes JANEIRO = new Mes("Janeiro");
    public static final Mes FEVEREIRO = new Mes("Fevereiro");
    public static final Mes MARCO = new Mes("Março");
    public static final Mes ABRIL = new Mes("Abril");
    public static final Mes MAIO = new Mes("Maio");
    public static final Mes JUNHO = new Mes("Junho");
    public static final Mes JULHO = new Mes("Julho");
    public static final Mes AGOSTO = new Mes("Agosto");
    public static final Mes SETEMBRO = new Mes("Setembro");
    public static final Mes OUTUBRO = new Mes("Outubro");
    public static final Mes NOVEMBRO = new Mes("Novembro");
    public static final Mes DEZEMBRO = new Mes("Dezembro");
    
    private final String descricao;
    
    private Mes(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
