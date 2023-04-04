package bootcamp.M4.Team1_Juego_del_ahorcado;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AhorcadoMain extends JFrame {

	private JPanel contentPane;

	public AhorcadoMain() {
		setTitle("Juego del ahorcado!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		panel_3.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBounds(10, 71, 279, 214);
		panel_3.add(panel);
		panel.setLayout(new MigLayout("", "[53px][51px][53px][49px][51px]", "[23px][23px][23px][23px][23px][23px]"));
		
		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnA, "cell 0 0,growx,aligny center");
		
		JButton btnB = new JButton("B");
		panel.add(btnB, "cell 1 0,growx,aligny center");
		
		JButton btnC = new JButton("C");
		panel.add(btnC, "cell 2 0,growx,aligny center");
		
		JButton btnD = new JButton("D");
		panel.add(btnD, "cell 3 0,growx,aligny center");
		
		JButton btnE = new JButton("E");
		panel.add(btnE, "cell 4 0,growx,aligny center");
		
		JButton btnF = new JButton("F");
		panel.add(btnF, "cell 0 1,growx,aligny center");
		
		JButton btnG = new JButton("G");
		panel.add(btnG, "cell 1 1,growx,aligny center");
		
		JButton btnH = new JButton("H");
		panel.add(btnH, "cell 2 1,growx,aligny center");
		
		JButton btnI = new JButton("I");
		panel.add(btnI, "cell 3 1,growx,aligny center");
		
		JButton btnJ = new JButton("J");
		panel.add(btnJ, "cell 4 1,growx,aligny center");
		
		JButton btnK = new JButton("K");
		panel.add(btnK, "cell 0 2,growx,aligny center");
		
		JButton btnL = new JButton("L");
		panel.add(btnL, "cell 1 2,growx,aligny center");
		
		JButton btnM = new JButton("M");
		panel.add(btnM, "cell 2 2,growx,aligny center");
		
		JButton btnN = new JButton("N");
		panel.add(btnN, "cell 3 2,growx,aligny center");
		
		JButton btnNY = new JButton("Ñ");
		panel.add(btnNY, "cell 4 2,growx,aligny center");
		
		JButton btnO = new JButton("O");
		panel.add(btnO, "cell 0 3,growx,aligny center");
		
		JButton btnP = new JButton("P");
		panel.add(btnP, "cell 1 3,growx,aligny center");
		
		JButton btnQ = new JButton("Q");
		panel.add(btnQ, "cell 2 3,growx,aligny center");
		
		JButton btnR = new JButton("R");
		panel.add(btnR, "cell 3 3,growx,aligny center");
		
		JButton btnS = new JButton("S");
		panel.add(btnS, "cell 4 3,growx,aligny center");
		
		JButton btnT = new JButton("T");
		panel.add(btnT, "cell 0 4,growx,aligny center");
		
		JButton btnU = new JButton("U");
		panel.add(btnU, "cell 1 4,growx,aligny center");
		
		JButton btnV = new JButton("V");
		panel.add(btnV, "cell 2 4,growx,aligny center");
		
		JButton btnW = new JButton("W");
		panel.add(btnW, "cell 3 4,growx,aligny center");
		
		JButton btnX = new JButton("X");
		panel.add(btnX, "cell 4 4,growx,aligny center");
		
		JButton btnY = new JButton("Y");
		panel.add(btnY, "cell 0 5,growx,aligny center");
		
		JButton btnZ = new JButton("Z");
		panel.add(btnZ, "cell 1 5,growx,aligny center");
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Teclado");
		lblNewJgoodiesLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel.setBounds(20, 38, 92, 22);
		panel_3.add(lblNewJgoodiesLabel);
		
		setVisible(true);
	}
}
