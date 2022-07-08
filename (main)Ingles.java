package main;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class Ingles extends JFrame {

	private JPanel contentPane;
	private JTextField tfRespuesta;
	private JLabel lbPreguntadeingles;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ingles frame = new Ingles();
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
	public Ingles() {
		setTitle("Pregunta de ingles");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Indique cual es el pronombre correcto en la frase: \r\n______ is an apple.\r\r\n\r\r\n\r\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(5, 5, 424, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Escriba el pronombre que considere correcto:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(5, 324, 424, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("a. This");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(25, 224, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("b. That");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(25, 249, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("c. These");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(25, 274, 68, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("d. Those");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1_1.setBounds(25, 299, 68, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		tfRespuesta = new JTextField();
		tfRespuesta.setBounds(270, 322, 86, 20);
		contentPane.add(tfRespuesta);
		tfRespuesta.setColumns(10);
		
		lbPreguntadeingles = new JLabel("");
		lbPreguntadeingles.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbPreguntadeingles.setHorizontalAlignment(SwingConstants.CENTER);
		lbPreguntadeingles.setBounds(5, 349, 424, 14);
		contentPane.add(lbPreguntadeingles);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = tfRespuesta.getText();
				lbPreguntadeingles.setText("Correcto ");
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnOk.setBounds(5, 374, 424, 23);
		contentPane.add(btnOk);
		
		JLabel lblNewLabel_4 = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Manzana.jpg"));
		lblNewLabel_4.setIcon(img);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(5, 30, 419, 183);
		contentPane.add(lblNewLabel_4);
	}
}
