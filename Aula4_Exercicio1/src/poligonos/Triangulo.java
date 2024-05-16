package poligonos;

public class Triangulo extends ObjetoGeometrico {
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	
	public Triangulo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		calcularArea();
		calcularPerimetro();
	}
	
	public double calcularArea() {
		double s = (ladoA + ladoB + ladoC) / 2;
		area = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
		return area;
	}
	
	public double calcularPerimetro() {
		perimetro = ladoA + ladoB + ladoC;
		return perimetro;
	}
}
