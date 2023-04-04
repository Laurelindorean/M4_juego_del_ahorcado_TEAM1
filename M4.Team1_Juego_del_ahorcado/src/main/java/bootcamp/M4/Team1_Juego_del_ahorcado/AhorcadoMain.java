package bootcamp.M4.Team1_Juego_del_ahorcado;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AhorcadoMain extends JFrame {

	private JPanel contentPane;
	private JButton btnNuevoJuego;
	private JButton btnDificultad;
	private JButton btnResolver;
	private JButton btnMasPalabras;

	public AhorcadoMain() {
		setTitle("Juego del ahorcado!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(319, 11, 302, 661);
		contentPane.add(panel);

		// -----------PANEL DE MENU----------------
		JPanel panel_menu = new JPanel();
		panel_menu.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_menu.setBounds(10, 11, 299, 147);
		panel_menu.setLayout(null);
		contentPane.add(panel_menu);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setBounds(125, 15, 50, 25);
		panel_menu.add(lblNewLabel);

		//BOTONES
		btnNuevoJuego = new JButton("Nuevo juego");
		btnNuevoJuego.addActionListener(btnsMenu);
		btnNuevoJuego.setBounds(15, 50, 110, 30);
		panel_menu.add(btnNuevoJuego);

		btnDificultad = new JButton("Dificultad");
		btnDificultad.addActionListener(btnsMenu);
		btnDificultad.setBounds(140, 51, 110, 30);
		panel_menu.add(btnDificultad);

		btnResolver = new JButton("Resolver");
		btnResolver.addActionListener(btnsMenu);
		btnResolver.setBounds(15, 90, 110, 30);
		panel_menu.add(btnResolver);

		btnMasPalabras = new JButton("Mas Palabras");
		btnMasPalabras.addActionListener(btnsMenu);
		btnMasPalabras.setBounds(140, 90, 110, 30);
		panel_menu.add(btnMasPalabras);
		// -----------------------------------------------------------------------

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 169, 299, 177);
		contentPane.add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(10, 357, 299, 315);
		contentPane.add(panel_3);

		setVisible(true);
	}

	// ACTION LISTENER PARA EL MENU
	ActionListener btnsMenu = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnNuevoJuego) {

			}
			if (e.getSource() == btnDificultad) {
				AhorcadoWelcome w = new AhorcadoWelcome();
			}
			if (e.getSource() == btnResolver) {

			}
			if (e.getSource() == btnMasPalabras) {

			}
		}
	};
}
