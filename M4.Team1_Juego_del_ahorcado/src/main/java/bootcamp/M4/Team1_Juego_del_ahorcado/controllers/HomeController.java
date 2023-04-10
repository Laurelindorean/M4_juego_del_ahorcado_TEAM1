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
import bootcamp.M4.Team1_Juego_del_ahorcado.views.PlayAgainView;
import bootcamp.M4.Team1_Juego_del_ahorcado.views.WelcomeView;

/**
 * @author TEAM1 (Aitor, Josep, Palmira)
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
	private int numPistas;
	ListaPalabras listaPalabras;
	private ImageIcon imagenAhorcado;
	ArrayList<String> listaExtra;

	public HomeController(HomeView view, int dificultad) {

		// INICIAR JUEGO
		this.view = view;
		this.dificultad = dificultad;
		this.fallos = 0;
		this.intentos = Ahorcado.getIntentos(dificultad);
		this.numPistas = Ahorcado.getPistas(dificultad);
		this.listaPalabras = new ListaPalabras(dificultad);
		this.listaExtra = new ArrayList<>();

		this.palabraSelected = listaPalabras.getRandWord();

		this.palabraCensured = Ahorcado.censorWord(palabraSelected);
		this.view.lblNumIntentos.setText("" + intentos);
		this.imagenAhorcado = new ImageIcon(
				"src/main/java/bootcamp/M4/Team1_Juego_del_ahorcado/assets/ahorcado" + fallos + ".jpg");

		this.view.lblPalabra.setText(palabraCensured);
		// INICIAR BOTONES
		this.view.btnNuevoJuego.addActionListener(btnsMenu);
		this.view.btnDificultad.addActionListener(btnsMenu);
		this.view.btnResolver.addActionListener(btnsMenu);
		this.view.btnMasPalabras.addActionListener(btnsMenu);
		this.view.btnPedirPista.addActionListener(btnsMenu);
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
	
	public HomeController(HomeView view, int dificultad, ArrayList<String> listaExtra) {
		this(view, dificultad);
		this.listaExtra = listaExtra;
		listaPalabras.addAllToListaPalabras(listaExtra);
		this.palabraSelected = listaPalabras.getRandWord();
		this.palabraCensured = Ahorcado.censorWord(palabraSelected);
		System.out.println(listaPalabras.getListaPalabras().toString());
		this.view.lblPalabra.setText(palabraCensured);
	}

	// ACTION LISTENER PARA EL MENU
	ActionListener btnsMenu = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == view.btnNuevoJuego) {
				// pongo en false para que no se dupliquen las ventanas
				view.setVisible(false);
				// Si el usuario selecciona un nuevo juego se le volverá a preguntar la
				// dificultad. Por lo que invocamos al WelcomeController
				WelcomeView vista = new WelcomeView();
				WelcomeController wController = new WelcomeController(vista, listaExtra);

			}
			if (e.getSource() == view.btnDificultad) {
				view.setVisible(false);
				WelcomeView aWelcome = new WelcomeView();
				WelcomeController cWelcome = new WelcomeController(aWelcome);
			}
			if (e.getSource() == view.btnResolver) {
				// Mostramos la palabra secreta
				view.lblPalabra.setText(palabraSelected);
				// Ponemos los intentos en 0, los fallos en 9 y los mostramos en el label junto
				// con la imagen del ahorcado completo
				intentos = 0;
				fallos = 9;
				view.lblNumIntentos.setText("" + intentos);
				imagenAhorcado = new ImageIcon(
						"src/main/java/bootcamp/M4/Team1_Juego_del_ahorcado/assets/ahorcado" + fallos + ".jpg");
				view.labelImagen.setIcon(imagenAhorcado);

				// Si resolvemos desactivamos los botones
				for (JButton jButton : view.btnsTeclado) {
					jButton.setEnabled(false);
				}

			}
			if (e.getSource() == view.btnMasPalabras) {
				nuevaPalabra = JOptionPane.showInputDialog("Escribe la nueva palabra");
				// añadimos la palabra pasada por teclado a nuestro ArrayList de palabras.
				listaExtra.add(nuevaPalabra);
				// prueba para ver como se añaden las palabras
				System.out.println(listaPalabras.getListaPalabras().toString());
			}
			if (e.getSource() == view.btnPedirPista) {
				// compruebo la cantidad de intentos
				if (numPistas == 0) {
					JOptionPane.showMessageDialog(null, "NO TE QUEDAN PISTAS");
				} else {
					numPistas--;
					if (intentos == 1) {
						JOptionPane.showMessageDialog(null, "SI HACES ESTO MUERES");
					} else {
						char c = Ahorcado.getUnusedChar(palabraSelected, palabraCensured);
						palabraCensured = Ahorcado.addUnusedChar(palabraSelected, palabraCensured, c);
						view.lblPalabra.setText(palabraCensured);
						intentos--;
						view.lblNumIntentos.setText("" + intentos);
						fallos = Ahorcado.badChoice(fallos, dificultad);
						imagenAhorcado = new ImageIcon(
								"src/main/java/bootcamp/M4/Team1_Juego_del_ahorcado/assets/ahorcado" + fallos + ".jpg");
						view.labelImagen.setIcon(imagenAhorcado);
					}

					if (Ahorcado.isEqual(palabraSelected, palabraCensured)) {
						for (JButton jButton1 : view.btnsTeclado) {
							jButton1.setEnabled(false);
						}
						view.setVisible(false);
						PlayAgainView win = new PlayAgainView();
						win.lblGanado.setVisible(true);
						win.lblintentos.setText("Has necesitado " + intentos + " intentos");
						PlayAgainController controller = new PlayAgainController(win);
					}
				}
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
					// Comprobamos que haya una palabra seleccionada
					if (!(palabraSelected == null)) {
						System.out.println(palabraSelected);
						// Convertimos a Char el string obtenido del boton pulsado
						char letra = jButton.getText().charAt(0);
						// Comprobamos si la letra aparece en nuestra palabra seleccionada
						if (Ahorcado.checkLetterInWord(letra, palabraSelected)) {
							// Si es asi, se actualiza nuestro panel y se sustituye la raya por la letra
							// correspondiente
							palabraCensured = Ahorcado.updateWord(palabraSelected, palabraCensured, letra);
							view.lblPalabra.setText(palabraCensured);
							// Comprobamos que la palabra se haya completado de ser asi se bloquean las
							// teclas.
							if (Ahorcado.isEqual(palabraSelected, palabraCensured)) {
								for (JButton jButton1 : view.btnsTeclado) {
									jButton1.setEnabled(false);
								}
								view.setVisible(false);
								PlayAgainView win = new PlayAgainView();
								win.lblGanado.setVisible(true);
								win.lblintentos.setText("Has necesitado " + intentos + " intentos");
								PlayAgainController controller = new PlayAgainController(win);

							}
						} else {
							// En caso de error en la letra se suman los fallos y cambiamos la imagen.
							fallos = Ahorcado.badChoice(fallos, dificultad);
							imagenAhorcado = new ImageIcon(
									"src/main/java/bootcamp/M4/Team1_Juego_del_ahorcado/assets/ahorcado" + fallos
											+ ".jpg");
							view.labelImagen.setIcon(imagenAhorcado);
							intentos--;
							view.lblNumIntentos.setText("" + intentos);
							// En caso de llegar al máximo de fallos se desactivan los botones del teclado
							if (intentos == 0 || fallos == 9) {
								for (JButton jButton1 : view.btnsTeclado) {
									jButton1.setEnabled(false);
								}
								view.setVisible(false);
								PlayAgainView lose = new PlayAgainView();
								lose.lblPerdido.setVisible(true);
								lose.lblintentos.setText("Te has quedado sin intentos");
								PlayAgainController controller = new PlayAgainController(lose);
							}

						}

					}
				}
			}

		}
	};

}
