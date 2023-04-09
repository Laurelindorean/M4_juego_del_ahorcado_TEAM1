package bootcamp.M4.Team1_Juego_del_ahorcado.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;


/**
 * 
 * @author TEAM1 (Aitor, Josep, Palmira)
 *
 */

public class PlayAgainView extends JFrame {

	private JPanel contentPane;
	public JLabel lblPerdido;
	public JLabel lblGanado;
	public JButton btnJugar;
	public JButton btnSalir;
	public JLabel lblintentos;

	/**
	 * Create the frame.
	 */
	public PlayAgainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblGanado = new JLabel("¡¡HAS GANADO!!");
		lblGanado.setForeground(new Color(4, 21, 108));
		lblGanado.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		lblGanado.setHorizontalAlignment(SwingConstants.CENTER);
		lblGanado.setBounds(29, 33, 375, 45);
		lblGanado.setVisible(false);
		contentPane.add(lblGanado);
		
		lblPerdido = new JLabel("HAS PERDIDO...");
		lblPerdido.setForeground(new Color(4, 21, 108));
		lblPerdido.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		lblPerdido.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerdido.setBounds(29, 33, 375, 45);
		lblPerdido.setVisible(false);
		contentPane.add(lblPerdido);
		
		btnJugar = new JButton("Jugar");
		
		btnJugar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnJugar.setBounds(72, 128, 110, 40);
		contentPane.add(btnJugar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSalir.setBounds(260, 128, 110, 40);
		contentPane.add(btnSalir);
		
		lblintentos = new JLabel("intentos");
		lblintentos.setHorizontalAlignment(SwingConstants.CENTER);
		lblintentos.setFont(new Font("Dialog", Font.BOLD, 11));
		lblintentos.setBounds(142, 78, 141, 28);
		contentPane.add(lblintentos);
		setVisible(true);
	}
}

