package bootcamp.M4.Team1_Juego_del_ahorcado.utils;

import java.util.ArrayList;
import java.util.Random;

public class ListaPalabras {

	private ArrayList<String> ListaPalabras;
	Random rand;

	// Crea lista de palabras segun dificultad
	public ListaPalabras(int dificultad) {
		ListaPalabras = new ArrayList<>();

		switch (dificultad) {
		case 0: // Dificultad facil
			ListaPalabras.add("palabra facil");
			break;
		case 1: // Dificultad media
			ListaPalabras.add("palabra media");
			break;
		case 2: // Dificultad dificil
			ListaPalabras.add("palabra dificil");
			break;
		default:
			throw new IllegalArgumentException("Nivel de dificultad incorrecto: " + dificultad);
		}
	}
	
	// Getter
	public ArrayList<String> getListaPalabras() {
		return ListaPalabras;
	}

	// Agregar palabras a la lista
	public void addWord(String word) {
		ListaPalabras.add(word);
	}
	
	// Devuelve palabra aleatoria de la lista
	public String getRandWord() {
		int i = rand.nextInt(ListaPalabras.size());
		return ListaPalabras.get(i);
	}
	
	

}
