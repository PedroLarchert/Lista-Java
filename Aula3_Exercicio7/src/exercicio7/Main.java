package exercicio7;

public class Main {

	public static void main(String[] args) {
		SerieLimitada instancia1 = SerieLimitada.criarInstancia();
        SerieLimitada instancia2 = SerieLimitada.criarInstancia();
        SerieLimitada instancia3 = SerieLimitada.criarInstancia();
        SerieLimitada instancia4 = SerieLimitada.criarInstancia();
        SerieLimitada instancia5 = SerieLimitada.criarInstancia();
        SerieLimitada instancia6 = SerieLimitada.criarInstancia(); 
        SerieLimitada instancia7 = SerieLimitada.criarInstancia();
        SerieLimitada instancia8 = SerieLimitada.criarInstancia();
        SerieLimitada instancia9 = SerieLimitada.criarInstancia();
        SerieLimitada instancia10 = SerieLimitada.criarInstancia();
        SerieLimitada instancia11 = SerieLimitada.criarInstancia();
        SerieLimitada instancia12 = SerieLimitada.criarInstancia(); 

       
        System.out.println("Número de série da instância 1: " + instancia1.getNumeroSerie());
        System.out.println("Número de série da instância 2: " + instancia2.getNumeroSerie());
        System.out.println("Número de série da instância 3: " + instancia3.getNumeroSerie());
        System.out.println("Número de série da instância 4: " + instancia4.getNumeroSerie());
        System.out.println("Número de série da instância 5: " + instancia5.getNumeroSerie());

       
        System.out.println("Total de instâncias criadas: " + SerieLimitada.getTotalInstanciasCriadas());

	}

}
