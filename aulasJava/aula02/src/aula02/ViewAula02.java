package aula02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewAula02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAula02 frame = new ViewAula02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewAula02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMensagem = new JLabel("Mensagem");
		lblMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMensagem.setBounds(139, 72, 140, 23);
		contentPane.add(lblMensagem);
		
		JButton btnClick = new JButton("Clique");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblMensagem.setText("Olá, Mundo!");
				
			}
		});
		btnClick.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnClick.setBounds(165, 143, 89, 23);
		contentPane.add(btnClick);
	}

}
