import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class TelaRelogio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelogio frame = new TelaRelogio();
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
	public TelaRelogio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 219);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(46, 40, 100, 100);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\homer\\Documents\\Curso\\Java\\RelogioSwing\\calendario100x100.jpg"));
		contentPane.add(lblNewLabel);
		
		JLabel lblHora = new JLabel("Click no Bot\u00E3o");
		lblHora.setForeground(Color.GRAY);
		lblHora.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblHora.setBounds(156, 65, 202, 14);
		lblHora.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblHora);
		
		JLabel lblNewLabel_1 = new JLabel("Data e Hora Atuak");
		lblNewLabel_1.setBounds(156, 40, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnHora = new JButton("Clique Aqui");
		btnHora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date rel = new Date();
				lblHora.setText(rel.toString());
			}
		});
		btnHora.setBounds(156, 99, 89, 23);
		contentPane.add(btnHora);
	}
}
