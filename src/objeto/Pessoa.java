package objeto;

public class Pessoa {
	
	private int peso;
	private int cod;
	
	public Pessoa(int cod, int peso) {
		this.cod = cod;
		this.peso = peso;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getNome() {
		return cod;
	}
	
	public void setNome(int cod) {
		this.cod = cod;
	}
	
}
