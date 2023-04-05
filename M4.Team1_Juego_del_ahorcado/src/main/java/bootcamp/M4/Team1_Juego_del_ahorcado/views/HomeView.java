package bootcamp.M4.Team1_Juego_del_ahorcado.views;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class HomeView extends JFrame {

	private JPanel contentPane;

	public JButton btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnNY, btnO,
			btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ;
	private JSeparator separator;
	private JSeparator separator_1;

	public JButton btnNuevoJuego;
	public JButton btnDificultad;
	public JButton btnResolver;
	public JButton btnMasPalabras;
	public JLabel lblNumIntentos;
	public JLabel lblPalabra;
	private ImageIcon imagenAhorcado;
	public JLabel labelImagen;
	public ArrayList<JButton> btnsTeclado = new ArrayList<>();

	private String palabra;

	public HomeView() {
		setTitle("Juego del ahorcado!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 647, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// -----------PANEL DE MENU----------------
		JPanel panel_menu = new JPanel();
		panel_menu.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_menu.setBounds(10, 11, 299, 147);
		panel_menu.setLayout(null);
		contentPane.add(panel_menu);

		// Imagen inicial del ahorcado
		imagenAhorcado = new ImageIcon("src/main/java/bootcamp/M4/Team1_Juego_del_ahorcado/assets/ahorcado0.jpg");
		// Label contenedora de la imagen
		labelImagen = new JLabel(imagenAhorcado);

		JPanel panelPantallaAhorcado = new JPanel();
		panelPantallaAhorcado.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPantallaAhorcado.setBounds(319, 11, 302, 661);
		panelPantallaAhorcado.setLayout(new BorderLayout(0, 0));
		panelPantallaAhorcado.add(labelImagen); // Agregar imagen al panel
		contentPane.add(panelPantallaAhorcado);

		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setBounds(125, 15, 50, 25);
		panel_menu.add(lblNewLabel);

		// BOTONES
		btnNuevoJuego = new JButton("Nuevo juego");
		btnNuevoJuego.setBounds(15, 50, 110, 30);
		panel_menu.add(btnNuevoJuego);

		btnDificultad = new JButton("Dificultad");
		btnDificultad.setBounds(140, 51, 110, 30);
		panel_menu.add(btnDificultad);

		btnResolver = new JButton("Resolver");
		btnResolver.setBounds(15, 90, 110, 30);
		panel_menu.add(btnResolver);

		btnMasPalabras = new JButton("Mas Palabras");
		btnMasPalabras.setBounds(140, 90, 110, 30);
		panel_menu.add(btnMasPalabras);
		// -----------------------------------------------------------------------

		JPanel panel_pistas = new JPanel();
		panel_pistas.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_pistas.setBounds(10, 169, 299, 88);
		contentPane.add(panel_pistas);
		panel_pistas.setLayout(null);

		JLabel lblPistas = new JLabel("PISTAS");
		lblPistas.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblPistas.setBounds(119, 6, 58, 25);
		panel_pistas.add(lblPistas);

		JButton btnPedirPista = new JButton("Pedir Pista");
		btnPedirPista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPedirPista.setBounds(17, 32, 99, 29);
		panel_pistas.add(btnPedirPista);

		JLabel lblIntentos = new JLabel("INTENTOS:");
		lblIntentos.setBounds(166, 37, 74, 16);
		panel_pistas.add(lblIntentos);
		
		lblNumIntentos = new JLabel("");
		lblNumIntentos.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumIntentos.setBounds(249, 37, 21, 16);
		panel_pistas.add(lblNumIntentos);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(10, 357, 299, 315);
		contentPane.add(panel_3);

		panel_3.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBounds(10, 71, 279, 188);
		panel_3.add(panel);
		panel.setLayout(new MigLayout("", "[53px][51px][53px][49px][51px]", "[23px][23px][23px][23px][23px][23px][]"));

		btnA = new JButton("A");
		panel.add(btnA, "cell 0 0,growx,aligny center");

		btnB = new JButton("B");
		panel.add(btnB, "cell 1 0,growx,aligny center");

		btnC = new JButton("C");
		panel.add(btnC, "cell 2 0,growx,aligny center");

		btnD = new JButton("D");
		panel.add(btnD, "cell 3 0,growx,aligny center");

		btnE = new JButton("E");
		panel.add(btnE, "cell 4 0,growx,aligny center");

		btnF = new JButton("F");
		panel.add(btnF, "cell 0 1,growx,aligny center");

		btnG = new JButton("G");
		panel.add(btnG, "cell 1 1,growx,aligny center");

		btnH = new JButton("H");
		panel.add(btnH, "cell 2 1,growx,aligny center");

		btnI = new JButton("I");

		panel.add(btnI, "cell 3 1,growx,aligny center");

		btnJ = new JButton("J");
		panel.add(btnJ, "cell 4 1,growx,aligny center");

		btnK = new JButton("K");

		panel.add(btnK, "cell 0 2,growx,aligny center");

		btnL = new JButton("L");
		panel.add(btnL, "cell 1 2,growx,aligny center");

		btnM = new JButton("M");

		panel.add(btnM, "cell 2 2,growx,aligny center");

		btnN = new JButton("N");

		panel.add(btnN, "cell 3 2,growx,aligny center");

		btnNY = new JButton("Ñ");

		panel.add(btnNY, "cell 4 2,growx,aligny center");

		btnO = new JButton("O");
		panel.add(btnO, "cell 0 3,growx,aligny center");

		btnP = new JButton("P");
		panel.add(btnP, "cell 1 3,growx,aligny center");

		btnQ = new JButton("Q");

		panel.add(btnQ, "cell 2 3,growx,aligny center");

		btnR = new JButton("R");

		panel.add(btnR, "cell 3 3,growx,aligny center");

		btnS = new JButton("S");

		panel.add(btnS, "cell 4 3,growx,aligny center");

		btnT = new JButton("T");

		panel.add(btnT, "cell 0 4,growx,aligny center");

		btnU = new JButton("U");

		panel.add(btnU, "cell 1 4,growx,aligny center");

		btnV = new JButton("V");

		panel.add(btnV, "cell 2 4,growx,aligny center");

		btnW = new JButton("W");

		panel.add(btnW, "cell 3 4,growx,aligny center");

		btnX = new JButton("X");

		panel.add(btnX, "cell 4 4,growx,aligny center");

		btnY = new JButton("Y");

		panel.add(btnY, "cell 0 5,growx,aligny center");

		btnZ = new JButton("Z");

		panel.add(btnZ, "cell 1 5,growx,aligny center");

		separator = new JSeparator();
		separator.setBounds(20, 57, 252, 7);
		panel_3.add(separator);

		separator_1 = new JSeparator();
		separator_1.setBounds(20, 270, 252, 2);
		panel_3.add(separator_1);

		JLabel teclado = new JLabel("Teclado");
		teclado.setFont(new Font("Tahoma", Font.BOLD, 11));
		teclado.setBounds(20, 37, 46, 14);
		panel_3.add(teclado);

		JPanel panel_resultado = new JPanel();
		panel_resultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_resultado.setBounds(10, 269, 299, 76);
		contentPane.add(panel_resultado);
		panel_resultado.setLayout(null);

		JLabel lblPalabraAAdivinar = new JLabel("PALABRA A ADIVINAR");
		lblPalabraAAdivinar.setHorizontalAlignment(SwingConstants.CENTER);
		lblPalabraAAdivinar.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblPalabraAAdivinar.setBounds(51, 6, 186, 25);
		panel_resultado.add(lblPalabraAAdivinar);

		lblPalabra = new JLabel("palabra...");
		lblPalabra.setHorizontalAlignment(SwingConstants.CENTER);
		lblPalabra.setBounds(61, 43, 176, 16);
		panel_resultado.add(lblPalabra);

		setVisible(true);

	}
}
