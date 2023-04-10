/**
 * 
 */
package bootcamp.M4.Team1_Juego_del_ahorcado.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import bootcamp.M4.Team1_Juego_del_ahorcado.views.HomeView;
import bootcamp.M4.Team1_Juego_del_ahorcado.views.WelcomeView;

/**
 * @author TEAM1 (Aitor, Josep, Palmira)
 *
 */
public class WelcomeController {

	// ATRIBUTOS
	private WelcomeView view;
	private ArrayList<String> listaExtra;

	// CONSTRUCTOR
	public WelcomeController(WelcomeView view) {
		this.view = view;
		this.view.btnPrincipiante.addActionListener(a1);
		this.view.btnIntermedio.addActionListener(a1);
		this.view.btnExperto.addActionListener(a1);
		view.setVisible(true);
	}
	
	public WelcomeController(WelcomeView view, ArrayList<String> listaExtra) {
		this.view = view;
		this.view.btnPrincipiante.addActionListener(a2);
		this.view.btnIntermedio.addActionListener(a2);
		this.view.btnExperto.addActionListener(a2);
		this.listaExtra = listaExtra;
		view.setVisible(true);
	}
	
	// Listener para primer constructor
	ActionListener a1 = new ActionListener() {
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
	};
	
	// Listener para constructor con arraylist
	ActionListener a2 = new ActionListener() {
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
			view.cambiarPantalla(dificultad, listaExtra);
		}
	};
	
}



