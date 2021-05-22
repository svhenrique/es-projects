package boletim;

import java.util.ArrayList;

public class Boletim {
	
	private static int MEDIA_ARITMETICA = 0;
	private static int MEDIA_PONDERADA = 1;
	
	private int tipoMedia = MEDIA_ARITMETICA;

	private ArrayList<Nota> notas = new ArrayList<Nota>();

	private void adicionarNota(float valor, int peso) {
		Nota nota = new Nota();
		nota.setValor(valor);
		nota.setPeso(peso);
		notas.add(nota);
	}

	public int getTipoMedia() {
		return tipoMedia;
	}

	public void setTipoMedia(int tipoMedia) {
		this.tipoMedia = tipoMedia;
	}

	private float calcularMedia() {
		float media = 0;
		if (tipoMedia == MEDIA_ARITMETICA) {
			for (Nota nota : notas) {
				media = media + nota.getValor();
			}
			media = media / notas.size();
		} else if(tipoMedia == MEDIA_PONDERADA) {
			int peso = 0;
			for (Nota nota : notas) {
				media = media + nota.getValor() * nota.getPeso();
				peso = peso + nota.getPeso();
			}
			media = media / peso;			
		}
		return media;
	}

	public static void main(String[] args) {
		Boletim boletim = new Boletim();
		boletim.setTipoMedia(MEDIA_ARITMETICA);
		boletim.adicionarNota(7.0f, 1);
		boletim.adicionarNota(8.0f,  1);
		System.out.println(boletim.calcularMedia());
		
		boletim.setTipoMedia(MEDIA_PONDERADA);
		boletim.adicionarNota(7.0f, 1);
		boletim.adicionarNota(8.0f,  2);
		System.out.println(boletim.calcularMedia());
	}

}
