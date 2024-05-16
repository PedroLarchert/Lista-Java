package biblioteca;

public class Periodico extends Biblioteca {
	private int volume;
	
	public Periodico(){
		
	}
	
	public Periodico(String titulo, int volume) {
		this.titulo = titulo;
		this.volume = volume;
		
	}

	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}

}
	
