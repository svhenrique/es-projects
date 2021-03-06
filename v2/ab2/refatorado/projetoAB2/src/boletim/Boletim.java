package boletim;

import java.util.ArrayList;

public class Boletim {
	
	private ArrayList<Nota> notas = new ArrayList<Nota>();
	public Media media;
	
	private void novaMedia(Media media) {
		this.media = media;
	}
	
	private float calcularMedia() { 
		return media.calcularMedia(notas);
	}
	
	private void adicionarNota(float valor, int peso) {
		Nota nota = criarNota(valor, peso);
		notas.add(nota);
	}
	
	private Nota criarNota(float valor, int peso) {
		Nota nota = new Nota(valor, peso);
		return nota;
	}

	public static void main(String[] args) {
		
		Boletim boletim = new Boletim();
		
		boletim.novaMedia(new MediaAritmetica());
		boletim.adicionarNota(7.0f, 1);
		boletim.adicionarNota(8.0f,  1);
		System.out.println(boletim.calcularMedia());
		
		boletim.novaMedia(new MediaPonderada());
		boletim.adicionarNota(7.0f, 1);
		boletim.adicionarNota(8.0f,  2);
		System.out.println(boletim.calcularMedia());
	}

}
