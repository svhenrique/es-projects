package boletim;

public class Nota {

	private float valor;
	private int peso;
	
	public Nota(float valor, int peso) {
		this.valor = valor;
		this.peso = peso;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
