package bootcamp.M4.Team1_Juego_del_ahorcado;

import java.awt.EventQueue;

public class App {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AhorcadoWelcome frame = new AhorcadoWelcome();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
