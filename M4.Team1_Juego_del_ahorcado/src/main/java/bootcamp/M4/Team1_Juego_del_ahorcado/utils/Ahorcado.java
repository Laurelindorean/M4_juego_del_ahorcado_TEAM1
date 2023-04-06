package bootcamp.M4.Team1_Juego_del_ahorcado.utils;
/**
 * 
 * @author TEAM1 (Aitor, Josep, Palmira)
 *
 */

public class Ahorcado {

	// Comprueba si x carácter está presente en una palabra
	public static boolean checkLetterInWord(char l, String word) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == l) {
				return true;
			}
		}
		return false;
	}

	// Funcion que censura la palabra al iniciar el programa
	public static String censorWord(String word) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ' ') {
				sb.append(' ');
			} else {
				sb.append('_');
			}
			if (i + 1 < word.length()) {
				sb.append(' ');
			}
		}
		return sb.toString();
	}

	// Funcion que actualiza la palabra quitando censura
	public static String updateWord(String wordOriginal, String wordCensured, char l) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < wordOriginal.length(); i++) {
			if (wordOriginal.charAt(i) == ' ') {
				sb.append(' ');
			} else if (wordOriginal.charAt(i) == l) {
				sb.append(l);
			} else if (wordOriginal.charAt(i) == wordCensured.charAt(i * 2)) {
				sb.append(wordOriginal.charAt(i));
			} else {
				sb.append('_');
			}
			if (i + 1 < wordOriginal.length()) {
				sb.append(' ');
			}
		}
		return sb.toString();
	}

	// Funcion que aumenta contador de intentos segun dificultad
	public static int badChoice(int fallos, int dificultad) {
		switch (dificultad) {
		case 0:
			fallos++;
			break;
		case 1:
			if (fallos < 4) {
				fallos = fallos+2;
			} else {
				fallos = fallos+1;
			}
			break;
		case 2:
			fallos = fallos + 2;
			break;
		}
		
		if (fallos > 9) {
			fallos = 9;
		}
		return fallos;
	}
	
	// Crea intentos segun dificultad
	public static int getIntentos(int dificultad) {
		switch (dificultad) {
		case 0:
			return 9;
		case 1:
			return 7;
		case 2:
			return 5;
		}
		return 0;
	}

	// Funcion que compara las dos palabras por si son iguales
	public static boolean isEqual(String wordOriginal, String wordCensured) {
		int counter = 0;
		for (int i = 0; i < wordOriginal.length(); i++) {
			if (wordOriginal.charAt(i) == wordCensured.charAt(i * 2)) {
				counter++;
			}
		}
		if (counter == wordOriginal.length()) {
			return true;
		}
		return false;
	}

}
