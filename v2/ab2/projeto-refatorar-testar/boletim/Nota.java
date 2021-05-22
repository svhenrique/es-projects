package boletim;

public class Nota {

	private float valor;
	private int peso;
	
	public Nota() {
		this.valor = 0.0f;
		this.peso = 1;
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
