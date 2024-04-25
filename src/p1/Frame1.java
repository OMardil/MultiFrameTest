package p1;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 {

	private JFrame frame;
	private JTextField inputBase;
	private Pokemon pikachu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
		
		pikachu = new Pokemon("Pikachu", 25);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Input");
		lblNewLabel.setBounds(29, 45, 47, 14);
		frame.getContentPane().add(lblNewLabel);
		
		inputBase = new JTextField();
		inputBase.setBounds(86, 42, 96, 20);
		frame.getContentPane().add(inputBase);
		inputBase.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//String text = inputBase.getText();
				//Frame2 n = new Frame2(text);
				
				String text = pikachu.getName();
				Frame2 n = new Frame2(text);
				
			}
		});
		btnCalculate.setBounds(86, 103, 89, 23);
		frame.getContentPane().add(btnCalculate);
	}
}
