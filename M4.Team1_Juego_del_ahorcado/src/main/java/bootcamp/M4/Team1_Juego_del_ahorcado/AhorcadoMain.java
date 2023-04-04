package bootcamp.M4.Team1_Juego_del_ahorcado;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.BorderLayout;

public class AhorcadoMain extends JFrame {

	private JPanel contentPane;
	private ImageIcon imagenAhorcado;
	private JLabel labelImagen;

	public AhorcadoMain() {
		setTitle("Juego del ahorcado!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 11, 299, 147);
		contentPane.add(panel_1);
		
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
}
