package boletim;
import java.util.ArrayList;

public interface Media { 
	float calcularMedia(ArrayList<Nota> notas);
}

class MediaAritmetica implements Media {
	@Override
	public float calcularMedia(ArrayList<Nota> notas) {
		float media = 0;
		for (Nota nota : notas) {
			media = media + nota.getValor();
		}
		return media/notas.size();
	}
}

class MediaPonderada implements Media {
	@Override
	public float calcularMedia(ArrayList<Nota> notas) {
		float media = 0;
		int peso = 0;
		for (Nota nota : notas) {
			media = media + (nota.getValor() * nota.getPeso());
			peso = peso + nota.getPeso();
		}
		media = media / peso;	
		return media;
	}	
}

