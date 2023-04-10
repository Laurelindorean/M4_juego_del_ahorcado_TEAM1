package bootcamp.M4.Team1_Juego_del_ahorcado.views;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;

/**
 * 
 * @author TEAM1 (Aitor, Josep, Palmira)
 *
 */

public class AditionalView extends JFrame {

	public JPanel contentAdicional;
	public JTextPane textAcerca;
	public JTextPane textJugar;
	public JLabel lblComoJugar;
	public JLabel lblAcerca;


	public AditionalView() {
		setTitle("Ayuda");
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 448, 486);
		contentAdicional = new JPanel();
		contentAdicional.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentAdicional);
		contentAdicional.setLayout(null);
		contentAdicional.setVisible(true);
		
		
		lblComoJugar = new JLabel("Como se Juega");
		lblComoJugar.setFont(new Font("Dialog", Font.BOLD, 15));
		lblComoJugar.setForeground(new Color(4, 21, 108));
		lblComoJugar.setBounds(23, 32, 160, 33);	
		contentAdicional.add(lblComoJugar);
		lblComoJugar.setVisible(false);	
		
		textJugar = new JTextPane();
		textJugar.setFont(new Font("Dialog", Font.ITALIC, 12));
		textJugar.setBounds(23, 76, 356, 335);
		contentAdicional.add(textJugar);
		textJugar.setText("\n1. Escogemos una dificultad: \n    Principiante \n    Intermedio \n    Experto" 
		+ "\n2. Debemos seleccionar letras para poder desvelar el panel. \n    Por cada letra acertada se nos revelará en la posición \n    correspondiente de la palabra a adivinar" + "\n3. Una vez no hayan más letras para desvelar \n    habremos ganado" 
				+ "\n4. Pero debemos ir con cuidado, tenemos intentos limitados: \n    10 en nivel Principiante \n    8 en nivel Intermedio \n    6 en nivel Experto" 
		+ "\n    Si gastamos todos los intentos perderemos la partida \n6. Podemos pedir pistas que nos desvelarán letras, pero \n    cuidado, cada pista usada nos quita un intento" 
				+ "\n7. Y por ultimo podemos añadir palabras a nuestra lista para \n    poder adivinarlas en otras partidas");
		textJugar.setVisible(false);
		
		textAcerca = new JTextPane();
		textAcerca.setText(" Los creadores de esta versión del Juego del Ahorcado són: " 
				+ "\n \n *** Josep Maria Pallàs *** " + "\n *** Aitor Iglesias ***" + "\n *** Palmira Romia ***" 
				+ "\n\n Estudiantes del Bootcamp FullStack de Java para T-Systems de la Fundació Esplai");
		textAcerca.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		textAcerca.setEditable(false);
		textAcerca.setBounds(23, 98, 377, 210);
		contentAdicional.add(textAcerca);
		textAcerca.setVisible(false);
		
		lblAcerca = new JLabel("Acerca de...");
		lblAcerca.setForeground(new Color(4, 21, 108));
		lblAcerca.setFont(new Font("Dialog", Font.BOLD, 15));
		lblAcerca.setBounds(23, 32, 160, 33);
		lblAcerca.setVisible(false);
		contentAdicional.add(lblAcerca);
		
		
	}
}
