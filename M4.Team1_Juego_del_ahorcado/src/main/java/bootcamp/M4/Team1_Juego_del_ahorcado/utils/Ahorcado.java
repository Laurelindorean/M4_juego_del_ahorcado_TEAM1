package bootcamp.M4.Team1_Juego_del_ahorcado.utils;

import java.util.ArrayList;

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
	public static int badChoice(int intentos, int dificultad) {
		switch (dificultad) {
		case 0:
			intentos++;
		case 1:
			intentos = intentos + 2;
		case 2:
			intentos = intentos + 3;
		}
		if (intentos > 9) {
			intentos = 9;
		}
		return intentos;
	}

}
