/**
 * 
 */
package bootcamp.M4.Team1_Juego_del_ahorcado.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import bootcamp.M4.Team1_Juego_del_ahorcado.utils.Ahorcado;
import bootcamp.M4.Team1_Juego_del_ahorcado.views.HomeView;
import bootcamp.M4.Team1_Juego_del_ahorcado.views.WelcomeView;

/**
 * @author aitor
 *
 */
public class HomeController {

	// ATRIBUTO
	private HomeView view;
	private String palabra;
	// private ArrayList<JButton> btnsTeclado = new ArrayList<>();

	//
	public HomeController(HomeView view) {
		this.view = view;
		this.view.btnNuevoJuego.addActionListener(btnsMenu);
		this.view.btnDificultad.addActionListener(btnsMenu);
		this.view.btnResolver.addActionListener(btnsMenu);
		this.view.btnMasPalabras.addActionListener(btnsMenu);
		this.view.btnsTeclado.add(view.btnA);
		this.view.btnsTeclado.add(view.btnB);
		this.view.btnsTeclado.add(view.btnC);
		this.view.btnsTeclado.add(view.btnD);
		this.view.btnsTeclado.add(view.btnE);
		this.view.btnsTeclado.add(view.btnF);
		this.view.btnsTeclado.add(view.btnG);
		this.view.btnsTeclado.add(view.btnH);
		this.view.btnsTeclado.add(view.btnI);
		this.view.btnsTeclado.add(view.btnJ);
		this.view.btnsTeclado.add(view.btnK);
		this.view.btnsTeclado.add(view.btnL);
		this.view.btnsTeclado.add(view.btnM);
		this.view.btnsTeclado.add(view.btnN);
		this.view.btnsTeclado.add(view.btnNY);
		this.view.btnsTeclado.add(view.btnO);
		this.view.btnsTeclado.add(view.btnP);
		this.view.btnsTeclado.add(view.btnQ);
		this.view.btnsTeclado.add(view.btnR);
		this.view.btnsTeclado.add(view.btnS);
		this.view.btnsTeclado.add(view.btnT);
		this.view.btnsTeclado.add(view.btnU);
		this.view.btnsTeclado.add(view.btnV);
		this.view.btnsTeclado.add(view.btnW);
		this.view.btnsTeclado.add(view.btnX);
		this.view.btnsTeclado.add(view.btnY);
		this.view.btnsTeclado.add(view.btnZ);
		for(JButton jButton : view.btnsTeclado) {
			jButton.addActionListener(btnTeclado);
		}
		/*view.btnA.addActionListener(btnTeclado);
		view.btnB.addActionListener(btnTeclado);
		view.btnC.addActionListener(btnTeclado);
		view.btnD.addActionListener(btnTeclado);
		view.btnE.addActionListener(btnTeclado);
		view.btnF.addActionListener(btnTeclado);
		view.btnG.addActionListener(btnTeclado);
		view.btnH.addActionListener(btnTeclado);
		view.btnI.addActionListener(btnTeclado);
		view.btnJ.addActionListener(btnTeclado);
		view.btnK.addActionListener(btnTeclado);
		view.btnL.addActionListener(btnTeclado);
		view.btnM.addActionListener(btnTeclado);
		view.btnN.addActionListener(btnTeclado);
		view.btnNY.addActionListener(btnTeclado);
		view.btnO.addActionListener(btnTeclado);
		view.btnP.addActionListener(btnTeclado);
		view.btnQ.addActionListener(btnTeclado);
		view.btnR.addActionListener(btnTeclado);
		view.btnS.addActionListener(btnTeclado);
		view.btnT.addActionListener(btnTeclado);
		view.btnU.addActionListener(btnTeclado);
		view.btnV.addActionListener(btnTeclado);
		view.btnW.addActionListener(btnTeclado);
		view.btnX.addActionListener(btnTeclado);
		view.btnY.addActionListener(btnTeclado);
		view.btnZ.addActionListener(btnTeclado);*/
		
		

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
	// ACTIONLISTENER PARA EL TECLADO
	ActionListener btnTeclado = new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			// Para desactivar la letra pulsada
			for (JButton jButton : view.btnsTeclado) {
				if (e.getSource() == jButton) {
					jButton.setEnabled(false);
					if(!(palabra == null)) {
						char letra = jButton.getText().charAt(0);
						System.out.println(Ahorcado.checkLetterInWord(letra, palabra));
					}
				}						
			}
	
		}
	};

}
