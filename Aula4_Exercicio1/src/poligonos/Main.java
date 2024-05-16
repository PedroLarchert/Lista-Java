package poligonos;

public class Main {

	public static void main(String[] args) {
		
	  Circulo circulo = new Circulo(5);
	  Retangulo retangulo = new Retangulo(4, 5);
	  Triangulo triangulo = new Triangulo(12,12,12);
	 
	  
	  System.out.println("area do circulo: "+circulo.calcularArea());
	  System.out.println("perimetro do circulo: "+circulo.calcularPerimetro());
	  System.out.println("area do retangulo: "+retangulo.calcularArea());
	  System.out.println("perimetro do retangulo: "+retangulo.calcularPerimetro());
	  System.out.println("area do triangulo: "+triangulo.calcularArea());
	  System.out.println("perimetro do triangulo: "+triangulo.calcularPerimetro());
	}

}
