/**
 * 
 */
package bootcamp.M4.Team1_Juego_del_ahorcado.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import bootcamp.M4.Team1_Juego_del_ahorcado.views.HomeView;
import bootcamp.M4.Team1_Juego_del_ahorcado.views.WelcomeView;

/**
 * @author aitor
 *
 */
public class HomeController {

	//ATRIBUTO
	private HomeView view;
	private String palabra;

	//
	public HomeController(HomeView view) {
		this.view = view;
		this.view.btnNuevoJuego.addActionListener(btnsMenu);
		this.view.btnDificultad.addActionListener(btnsMenu);
		this.view.btnResolver.addActionListener(btnsMenu);
		this.view.btnMasPalabras.addActionListener(btnsMenu);

	}

	// ACTION LISTENER PARA EL MENU
	ActionListener btnsMenu = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == view.btnNuevoJuego) {
				// pongo en false para que no se dupliquen las ventanas
				view.setVisible(false);
				HomeView aMain = new HomeView();

			}
			if (e.getSource() == view.btnDificultad) {
				view.setVisible(false);
				WelcomeView aWelcome = new WelcomeView();
				WelcomeController cWelcome = new WelcomeController(aWelcome);
			}
			if (e.getSource() == view.btnResolver) {
				// TODO: Resolver ahorcado
				// Para desactivar todas las teclas
				for (JButton jButton : view.btnsTeclado) {
					jButton.setEnabled(false);
				}
			}
			if (e.getSource() == view.btnMasPalabras) {
				palabra = JOptionPane.showInputDialog("Escribe la nueva palabra");
			}
		}
	};

}
