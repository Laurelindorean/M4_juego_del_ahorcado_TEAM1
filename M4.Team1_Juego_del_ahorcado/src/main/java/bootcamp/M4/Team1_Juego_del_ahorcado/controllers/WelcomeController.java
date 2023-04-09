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
 * @author TEAM1 (Aitor, Josep, Palmira)
 *
 */
public class WelcomeController implements ActionListener {

	// ATRIBUTOS
	private WelcomeView view;

	// CONSTRUCTOR
	public WelcomeController(WelcomeView view) {
		this.view = view;
		this.view.btnPrincipiante.addActionListener(this);
		this.view.btnIntermedio.addActionListener(this);
		this.view.btnExperto.addActionListener(this);
		view.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		int dificultad;
		if (e.getSource() == view.btnIntermedio) {
			dificultad = 1;
		} else if (e.getSource() == view.btnExperto) {
			dificultad = 2;
		} else {
			dificultad = 0;
		}
		view.setVisible(false);
		view.cambiarPantalla(dificultad);
	}

}



