package poligonos;

public class Circulo extends ObjetoGeometrico{
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
		calcularArea();
		calcularPerimetro();
	}
	
	
	public double calcularArea() {
		area =  3.14 * ( raio * raio);
		return area ;
	}
	
	public double calcularPerimetro() {
		perimetro = 2* 3.14 *  raio ;
		return perimetro;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
}