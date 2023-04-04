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
	
	/*
	public static String updateWord(String wordOriginal, String wordCensured, char l) {
		
	}
	*/

}
