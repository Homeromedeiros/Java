package idioma;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class TelaIdioma {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIdioma window = new TelaIdioma();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaIdioma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\homer\\Documents\\Curso\\Java\\IdiomaSwing\\idiomaimagem.jpg"));
		lblNewLabel.setBounds(10, 33, 200, 200);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idioma do Sistema:");
		lblNewLabel_1.setBounds(220, 33, 97, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblIdioma = new JLabel("Aperte o Bot\u00E3o");
		lblIdioma.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblIdioma.setBounds(220, 58, 158, 30);
		frame.getContentPane().add(lblIdioma);
		
		JButton btnIdioma = new JButton("Idioma");
		btnIdioma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Locale loc = Locale.getDefault();
				lblIdioma.setText(loc.toString());
			}
		});
		btnIdioma.setBounds(220, 90, 85, 23);
		frame.getContentPane().add(btnIdioma);
	}
}
