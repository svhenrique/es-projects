package boletim;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MediaTest {
	
	Media media_aritmetica = new MediaAritmetica();
	Media media_ponderada = new MediaPonderada();
	
	@Test
	void testMediaAritmetica1() {	
		ArrayList<Nota> notas = new ArrayList<Nota>();
		
		notas.add(new Nota(2, 1));
		notas.add(new Nota(2, 1));
		notas.add(new Nota(2, 1));
		
		assertEquals(2.0,  media_aritmetica.calcularMedia(notas));
	}
	
	@Test
	void testMediaAritmetica2() {	
		ArrayList<Nota> notas = new ArrayList<Nota>();
		
		notas.add(new Nota(2, 1));
		notas.add(new Nota(1, 1));
		notas.add(new Nota(6, 1));
		
		assertEquals(3.0,  media_aritmetica.calcularMedia(notas));
	}

	@Test
	void testMediaPodderada1() {	
		ArrayList<Nota> notas = new ArrayList<Nota>();
		
		notas.add(new Nota(1, 1));
		notas.add(new Nota(1, 1));
		notas.add(new Nota(1, 1));
		
		assertEquals(1.0,  media_aritmetica.calcularMedia(notas));
	}
	
	@Test
	void testMediaPodderada2() {	
		ArrayList<Nota> notas = new ArrayList<Nota>();
		
		notas.add(new Nota(2, 5));
		notas.add(new Nota(1, 3));
		notas.add(new Nota(2, 3));
		
		assertEquals(19/11,  media_aritmetica.calcularMedia(notas));
	}
}
