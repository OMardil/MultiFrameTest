package p1;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Frame2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public Frame2(String labelText) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(labelText);
		lblNewLabel.setBounds(189, 94, 47, 14);
		contentPane.add(lblNewLabel);
		this.setVisible(true);
	}
}
