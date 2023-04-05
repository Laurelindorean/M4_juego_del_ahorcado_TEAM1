package bootcamp.M4.Team1_Juego_del_ahorcado.views;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import bootcamp.M4.Team1_Juego_del_ahorcado.controllers.WelcomeController;
import bootcamp.M4.Team1_Juego_del_ahorcado.utils.Ahorcado;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.BorderLayout;

public class HomeView extends JFrame {

	private JPanel contentPane;

	private JButton btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnNY, btnO,
			btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ;
	private JSeparator separator;
	private JSeparator separator_1;

	private JButton btnNuevoJuego;
	private JButton btnDificultad;
	private JButton btnResolver;
	private JButton btnMasPalabras;
	private ImageIcon imagenAhorcado;
	private JLabel labelImagen;
	private ArrayList<JButton> btnsTeclado = new ArrayList<>();

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

		panel_3.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBounds(10, 71, 279, 188);
		panel_3.add(panel);
		panel.setLayout(new MigLayout("", "[53px][51px][53px][49px][51px]", "[23px][23px][23px][23px][23px][23px][]"));

		btnA = new JButton("A");
		btnA.addActionListener(btnTeclado);
		panel.add(btnA, "cell 0 0,growx,aligny center");
		btnsTeclado.add(btnA);

		btnB = new JButton("B");
		btnB.addActionListener(btnTeclado);
		panel.add(btnB, "cell 1 0,growx,aligny center");
		
		btnsTeclado.add(btnB);
		btnC = new JButton("C");
		btnC.addActionListener(btnTeclado);
		panel.add(btnC, "cell 2 0,growx,aligny center");
		
		btnsTeclado.add(btnC);
		btnD = new JButton("D");
		btnD.addActionListener(btnTeclado);
		panel.add(btnD, "cell 3 0,growx,aligny center");
		
		btnsTeclado.add(btnD);
		btnE = new JButton("E");
		btnE.addActionListener(btnTeclado);
		panel.add(btnE, "cell 4 0,growx,aligny center");
		
		btnsTeclado.add(btnE);
		btnF = new JButton("F");
		btnF.addActionListener(btnTeclado);
		panel.add(btnF, "cell 0 1,growx,aligny center");
		
		btnsTeclado.add(btnF);
		btnG = new JButton("G");
		btnG.addActionListener(btnTeclado);
		panel.add(btnG, "cell 1 1,growx,aligny center");
		
		btnsTeclado.add(btnG);
		btnH = new JButton("H");
		btnH.addActionListener(btnTeclado);
		panel.add(btnH, "cell 2 1,growx,aligny center");
		
		btnsTeclado.add(btnH);
		btnI = new JButton("I");
		btnI.addActionListener(btnTeclado);
		panel.add(btnI, "cell 3 1,growx,aligny center");
		
		btnsTeclado.add(btnI);
		btnJ = new JButton("J");
		btnJ.addActionListener(btnTeclado);
		panel.add(btnJ, "cell 4 1,growx,aligny center");
		
		btnsTeclado.add(btnJ);
		btnK = new JButton("K");
		btnK.addActionListener(btnTeclado);
		panel.add(btnK, "cell 0 2,growx,aligny center");
		
		btnsTeclado.add(btnK);

		btnL = new JButton("L");
		btnL.addActionListener(btnTeclado);
		panel.add(btnL, "cell 1 2,growx,aligny center");
		
		btnsTeclado.add(btnL);
		btnM = new JButton("M");
		btnM.addActionListener(btnTeclado);
		panel.add(btnM, "cell 2 2,growx,aligny center");
		
		btnsTeclado.add(btnM);
		btnN = new JButton("N");
		btnN.addActionListener(btnTeclado);
		panel.add(btnN, "cell 3 2,growx,aligny center");
		
		btnsTeclado.add(btnN);
		btnNY = new JButton("Ñ");
		btnNY.addActionListener(btnTeclado);
		panel.add(btnNY, "cell 4 2,growx,aligny center");
		
		btnsTeclado.add(btnNY);
		btnO = new JButton("O");
		btnO.addActionListener(btnTeclado);
		panel.add(btnO, "cell 0 3,growx,aligny center");
		
		btnsTeclado.add(btnO);
		btnP = new JButton("P");
		btnP.addActionListener(btnTeclado);
		panel.add(btnP, "cell 1 3,growx,aligny center");
		
		btnsTeclado.add(btnP);
		btnQ = new JButton("Q");
		btnQ.addActionListener(btnTeclado);
		panel.add(btnQ, "cell 2 3,growx,aligny center");
		
		btnsTeclado.add(btnQ);
		btnR = new JButton("R");
		btnR.addActionListener(btnTeclado);
		panel.add(btnR, "cell 3 3,growx,aligny center");
		
		btnsTeclado.add(btnR);
		btnS = new JButton("S");
		btnS.addActionListener(btnTeclado);
		panel.add(btnS, "cell 4 3,growx,aligny center");
		
		btnsTeclado.add(btnS);
		btnT = new JButton("T");
		btnT.addActionListener(btnTeclado);
		panel.add(btnT, "cell 0 4,growx,aligny center");
		
		btnsTeclado.add(btnT);
		btnU = new JButton("U");
		btnU.addActionListener(btnTeclado);
		panel.add(btnU, "cell 1 4,growx,aligny center");
		
		btnsTeclado.add(btnU);
		btnV = new JButton("V");
		btnV.addActionListener(btnTeclado);
		panel.add(btnV, "cell 2 4,growx,aligny center");
		
		btnsTeclado.add(btnV);
		btnW = new JButton("W");
		btnW.addActionListener(btnTeclado);
		panel.add(btnW, "cell 3 4,growx,aligny center");
		
		btnsTeclado.add(btnW);
		btnX = new JButton("X");
		btnX.addActionListener(btnTeclado);
		panel.add(btnX, "cell 4 4,growx,aligny center");
		
		btnsTeclado.add(btnX);
		btnY = new JButton("Y");
		btnY.addActionListener(btnTeclado);
		panel.add(btnY, "cell 0 5,growx,aligny center");
		
		btnsTeclado.add(btnY);
		btnZ = new JButton("Z");
		btnZ.addActionListener(btnTeclado);
		panel.add(btnZ, "cell 1 5,growx,aligny center");
		
		btnsTeclado.add(btnZ);
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

		setVisible(true);

	}

	ActionListener btnTeclado = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			//Para desactivar la letra pulsada
			for (JButton jButton : btnsTeclado) {
				if(e.getSource()==jButton) {
					jButton.setEnabled(false);
					if(!(palabra == null)) {
						System.out.println(Ahorcado.checkLetterInWord((jButton.getText().charAt(0)), palabra));
					}
				}
				
			}
			
			
		}
	};

	// ACTION LISTENER PARA EL MENU
	ActionListener btnsMenu = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnNuevoJuego) {
				//pongo en false para que no se dupliquen las ventanas
				setVisible(false);
				HomeView aMain = new HomeView();
				
			}
			if (e.getSource() == btnDificultad) {
				setVisible(false);
				WelcomeView aWelcome = new WelcomeView();
				WelcomeController cWelcome = new WelcomeController(aWelcome);
			}
			if (e.getSource() == btnResolver) {
				// TODO: Resolver ahorcado
				// Para desactivar todas las teclas
				for (JButton jButton : btnsTeclado) {
						jButton.setEnabled(false);
					
				}
				
			}
			if (e.getSource() == btnMasPalabras) {
				palabra = JOptionPane.showInputDialog("Escribe la nueva palabra");
			}
		}
	};
}
