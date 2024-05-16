package poligonos;

public abstract class ObjetoGeometrico {
	
	protected double area;
	protected double perimetro;
	
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
}