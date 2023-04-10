package bootcamp.M4.Team1_Juego_del_ahorcado.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bootcamp.M4.Team1_Juego_del_ahorcado.controllers.HomeController;
import bootcamp.M4.Team1_Juego_del_ahorcado.controllers.WelcomeController;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/**
 * 
 * @author TEAM1 (Aitor, Josep, Palmira)
 *
 */

public class WelcomeView extends JFrame {

	private JPanel contentPane;
	public JButton btnPrincipiante;
	public JButton btnIntermedio;
	public JButton btnExperto;

	public WelcomeView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(300, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// TITULO
		JLabel lblTituloJuego = new JLabel("Bienvenidos al juego del AHORCADO");
		lblTituloJuego.setForeground(new Color(4, 21, 108));
		lblTituloJuego.setBackground(new Color(252, 255, 253));
		lblTituloJuego.setFont(new Font("Menlo", Font.BOLD | Font.ITALIC, 20));
		lblTituloJuego.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloJuego.setBounds(5, 5, 440, 30);
		contentPane.add(lblTituloJuego);

		// NIVEL
		JLabel lblNivelDificultad = new JLabel("Elige el nivel de dificultad");
		lblNivelDificultad.setForeground(new Color(78, 28, 190));
		lblNivelDificultad.setFont(new Font("Menlo", Font.BOLD | Font.ITALIC, 16));
		lblNivelDificultad.setHorizontalAlignment(SwingConstants.CENTER);
		lblNivelDificultad.setBounds(75, 45, 300, 30);
		contentPane.add(lblNivelDificultad);

		// BOTONES
		btnPrincipiante = new JButton("Principiante");
		btnPrincipiante.setForeground(new Color(38, 190, 29));
		btnPrincipiante.setBounds(163, 85, 110, 40);
		contentPane.add(btnPrincipiante);

		btnIntermedio = new JButton("Intermedio");
		btnIntermedio.setForeground(new Color(154, 111, 3));
		btnIntermedio.setBounds(163, 135, 110, 40);
		contentPane.add(btnIntermedio);

		btnExperto = new JButton("Experto");
		btnExperto.setForeground(new Color(154, 8, 22));
		btnExperto.setBounds(163, 185, 110, 40);
		contentPane.add(btnExperto);

		setVisible(true);
	}

	// FUNCION NAVEGAR ENTRE PANTALLAS WELCOME-HOME
	public void cambiarPantalla(int dificultad) {

		HomeView home = new HomeView();
		HomeController homeController = new HomeController(home, dificultad);
	}

	// FUNCION NAVEGAR ENTRE PANTALLAS WELCOME-HOME
	public void cambiarPantalla(int dificultad, ArrayList<String> listaExtra) {

		HomeView home = new HomeView();
		HomeController homeController = new HomeController(home, dificultad, listaExtra);
	}

}
