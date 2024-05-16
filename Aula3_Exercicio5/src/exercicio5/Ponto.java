package exercicio5;

public class Ponto {
	private double x;
	private double y;
	
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public Ponto() {
		this.x = 0;
		this.y = 0;
		
	}
	
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Ponto(Ponto ponto) {
		this.x = ponto.getX();
		this.y =ponto.getY();
	}
	
	public void desloca(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
	
	 public void desloca(Ponto deslocamento) {
	        this.x += deslocamento.getX();
	        this.y += deslocamento.getY();
	    }
	 
	 @Override
	 public String toString() {
	        return "(" + x + ", " + y + ")";
	    }
	 
	 public void setPonto(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }
	 
	 public void setPonto(Ponto ponto) {
	        this.x = ponto.getX();
	        this.y = ponto.getY();
	    }
	
}
