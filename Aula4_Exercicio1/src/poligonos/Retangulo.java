package poligonos;

public class Retangulo extends ObjetoGeometrico {
	private double ladoA;
	private double ladoB;
	
	
	public Retangulo(double ladoA, double ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		calcularArea();
		calcularPerimetro();
	}
	
	public double calcularArea() {
		area = ladoA*ladoB;
		return area ;
	}
	
	public double calcularPerimetro() {
		perimetro = 2 * (ladoA + ladoB);
		return perimetro ;
	}
	
	public void setLados(double ladoA, double ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
}


	
