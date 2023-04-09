/**
 * 
 */
package bootcamp.M4.Team1_Juego_del_ahorcado.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bootcamp.M4.Team1_Juego_del_ahorcado.views.PlayAgainView;
import bootcamp.M4.Team1_Juego_del_ahorcado.views.WelcomeView;
import bootcamp.M4.Team1_Juego_del_ahorcado.controllers.WelcomeController;

/**
 * @author TEAM1 (Aitor, Josep, Palmira)
 *
 */
public class PlayAgainController implements ActionListener{
	
	private PlayAgainView view;
	private WelcomeController controller;
	
	public PlayAgainController(PlayAgainView view) {
		this.view = view;
		this.view.btnJugar.addActionListener(this);
		this.view.btnSalir.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//si clickamos en Jugar volvemos al menú del WelcomeView he iniciamos nuevo juego
		if(e.getSource() == this.view.btnJugar) {
			this.view.setVisible(false);
			WelcomeView vista1 = new WelcomeView();
			controller = new WelcomeController(vista1);
			
			
			
		}
		//Si clickamos a Salir se cierra la aplicación
		if(e.getSource()==this.view.btnSalir) {
			System.exit(0);
		}
		
	}

}
