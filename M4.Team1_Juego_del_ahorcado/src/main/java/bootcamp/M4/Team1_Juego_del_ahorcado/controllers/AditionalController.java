package bootcamp.M4.Team1_Juego_del_ahorcado.controllers;

import bootcamp.M4.Team1_Juego_del_ahorcado.views.AditionalView;

/**
 * 
 * @author TEAM1 (Aitor, Josep, Palmira)
 *
 */

public class AditionalController {
	private AditionalView view;
		
	public AditionalController(AditionalView view) {
		
		this.view = view;
		view.setVisible(true);
		view.contentAdicional.setVisible(true);
		view.textJugar.setEditable(false);
		view.textAcerca.setEditable(false);
		
		
	}

}
