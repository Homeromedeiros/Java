package resolucao;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaResolucao {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaResolucao window = new TelaResolucao();
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
	public TelaResolucao() {
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\homer\\Documents\\Curso\\Java\\ResolucaoSwing\\Monitor.jpg"));
		lblNewLabel.setBounds(10, 55, 197, 148);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resolu\u00E7\u00E3o da Tela:");
		lblNewLabel_1.setBounds(225, 55, 107, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblResolucao = new JLabel("Aperte o Bot\u00E3o");
		lblResolucao.setFont(new Font("Leelawadee UI", Font.PLAIN, 16));
		lblResolucao.setBounds(225, 91, 120, 26);
		frame.getContentPane().add(lblResolucao);
		
		JButton btnNewButton = new JButton("Mostrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
				//Dimension tela = tk.getScreenSize()
				lblResolucao.setText(tela.width+" x "+tela.height);
			}
		});
		btnNewButton.setBounds(225, 128, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
