/**
 * 
 */
package bootcamp.M4.Team1_Juego_del_ahorcado.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import bootcamp.M4.Team1_Juego_del_ahorcado.models.ListaPalabras;
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
	private String palabraSelected;
	private String palabraCensured;
	private String nuevaPalabra;
	private int dificultad;
	private int fallos;
	private int intentos;
	ListaPalabras listaPalabras;
	private ImageIcon imagenAhorcado;
	

	// private ArrayList<JButton> btnsTeclado = new ArrayList<>();
	//
	public HomeController(HomeView view, int dificultad) {
		
		//INICIAR JUEGO
		this.view = view;
		this.dificultad = dificultad;
		this.fallos = 0;
		this.intentos = Ahorcado.getIntentos(dificultad);
		this.listaPalabras = new ListaPalabras(dificultad);
		this.palabraSelected = listaPalabras.getRandWord();
		this.palabraCensured = Ahorcado.censorWord(palabraSelected);
		this.view.lblNumIntentos.setText(""+intentos);
		this.imagenAhorcado = new ImageIcon("src/main/java/bootcamp/M4/Team1_Juego_del_ahorcado/assets/ahorcado"+fallos+".jpg");
		
		this.view.lblPalabra.setText(palabraCensured);
		//INICIAR BOTONES
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
		for (JButton jButton : view.btnsTeclado) {
			jButton.addActionListener(btnTeclado);
		}
	}

	// ACTION LISTENER PARA EL MENU
	ActionListener btnsMenu = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == view.btnNuevoJuego) {
				// pongo en false para que no se dupliquen las ventanas
				view.setVisible(false);
				HomeView aMain = new HomeView();
				HomeController hController = new HomeController(aMain, dificultad);

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
				nuevaPalabra = JOptionPane.showInputDialog("Escribe la nueva palabra");
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
					if (!(palabraSelected == null)) {
						System.out.println(palabraSelected);
						char letra = jButton.getText().charAt(0);
						if(Ahorcado.checkLetterInWord(letra, palabraSelected)) {
							palabraCensured = Ahorcado.updateWord(palabraSelected, palabraCensured, letra);
							view.lblPalabra.setText(palabraCensured);
							if(Ahorcado.isEqual(palabraSelected, palabraCensured)) {
								for (JButton jButton1 : view.btnsTeclado) {
									jButton1.setEnabled(false);
								}
							}
						} else {
							fallos = Ahorcado.badChoice(fallos, dificultad);
							imagenAhorcado = new ImageIcon("src/main/java/bootcamp/M4/Team1_Juego_del_ahorcado/assets/ahorcado"+fallos+".jpg");
							view.labelImagen.setIcon(imagenAhorcado);
							intentos--;	
							view.lblNumIntentos.setText(""+intentos);
							if(intentos == 0 || fallos == 9) {
								for (JButton jButton1 : view.btnsTeclado) {
									jButton1.setEnabled(false);
								}
							}
							
						}
						
						
					}
				}
			}

		}
	};

}
