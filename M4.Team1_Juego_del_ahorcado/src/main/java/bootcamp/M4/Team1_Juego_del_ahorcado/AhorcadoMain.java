package bootcamp.M4.Team1_Juego_del_ahorcado;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class AhorcadoMain extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPista;

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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 11, 299, 147);
		contentPane.add(panel_1);
		
		JPanel panel_pistas = new JPanel();
		panel_pistas.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_pistas.setBounds(10, 169, 299, 177);
		contentPane.add(panel_pistas);
		panel_pistas.setLayout(null);
		
		JLabel lblPistas = new JLabel("Pistas");
		lblPistas.setBounds(17, 16, 46, 16);
		panel_pistas.add(lblPistas);
		
		JButton btnPedirPista = new JButton("Pedir Pista");
		btnPedirPista.setBounds(6, 130, 117, 29);
		panel_pistas.add(btnPedirPista);
		
		textFieldPista = new JTextField();
		textFieldPista.setBounds(147, 130, 130, 26);
		panel_pistas.add(textFieldPista);
		textFieldPista.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(10, 357, 299, 315);
		contentPane.add(panel_3);
		
		setVisible(true);
	}
}
