package bootcamp.M4.Team1_Juego_del_ahorcado;

import java.awt.EventQueue;

import bootcamp.M4.Team1_Juego_del_ahorcado.controllers.WelcomeController;
import bootcamp.M4.Team1_Juego_del_ahorcado.views.WelcomeView;

/**
 * 
 * @author TEAM1 (Aitor, Josep, Palmira)
 *
 */
public class App {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeView wv = new WelcomeView();
					WelcomeController wc = new WelcomeController(wv);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
