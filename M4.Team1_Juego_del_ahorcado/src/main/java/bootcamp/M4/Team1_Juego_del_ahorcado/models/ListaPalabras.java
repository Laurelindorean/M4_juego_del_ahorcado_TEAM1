package bootcamp.M4.Team1_Juego_del_ahorcado.models;

import java.util.ArrayList;
import java.util.Random;
/**
 * 
 * @author TEAM1 (Aitor, Josep, Palmira)
 *
 */
public class ListaPalabras {

	private ArrayList<String> ListaPalabras;
	Random rand;

	// Crea lista de palabras segun dificultad
	public ListaPalabras(int dificultad) {
		ListaPalabras = new ArrayList<>();

		switch (dificultad) {
		case 0: // Dificultad facil
			ListaPalabras.add("PATO");
			ListaPalabras.add("DADO");
			ListaPalabras.add("PERA");
			ListaPalabras.add("RAYA");
			ListaPalabras.add("YOGA");
			ListaPalabras.add("LECHE");
			ListaPalabras.add("LLAMA");
			ListaPalabras.add("ZORRO");
			ListaPalabras.add("BAÑO");
			ListaPalabras.add("BESO");
			break;
		case 1: // Dificultad media
			ListaPalabras.add("PLANO");
			ListaPalabras.add("CREMA");
			ListaPalabras.add("CHICLE");
			ListaPalabras.add("CHARCO");
			ListaPalabras.add("ARAÑA");
			ListaPalabras.add("CANGREJO");
			ListaPalabras.add("CASCADA");
			ListaPalabras.add("PULSO");
			ListaPalabras.add("BARCO");
			ListaPalabras.add("MOSQUITO");
			break;
		case 2: // Dificultad dificil
			ListaPalabras.add("MONASTERIO");
			ListaPalabras.add("MOTOCICLETA");
			ListaPalabras.add("ARQUITECTURA");
			ListaPalabras.add("CIRCUNFERENCIA");
			ListaPalabras.add("INGREDIENTE");
			ListaPalabras.add("BALONCESTO");
			ListaPalabras.add("ZAPATILLAS");
			ListaPalabras.add("MITOLOGIA");
			ListaPalabras.add("CONSTITUCION");
			ListaPalabras.add("CUADRILATERO");
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
		word = word.toUpperCase();
		ListaPalabras.add(word);
	}
	
	// Devuelve palabra aleatoria de la lista
	public String getRandWord() {
		rand = new Random();
		int i = rand.nextInt(ListaPalabras.size());
		return ListaPalabras.get(i);
	}
	
	

}
