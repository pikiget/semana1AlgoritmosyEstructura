package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import clases.Persona;

public class Main extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnProcesar;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(158, 35, 89, 23);
		contentPane.add(btnProcesar);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 66, 414, 184);
		contentPane.add(textArea);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Persona p = new Persona();
		
		p.nombre = "Juan";
		p.apellido = "Paredes";
		p.edad = 20;
		p.estatura = 1.69;
		p.peso = 82;
		
		textArea.setText("Nombre: " + p.nombre + "\n");
		textArea.append("Apellido: " + p.apellido + "\n");
		textArea.append("Edad: " + p.edad + "\n");
		textArea.append("Estatura: " + p.estatura + "\n");
		textArea.append("Peso: " + p.peso + "\n");
		textArea.append("IMC: " + p.masaCorporal() + "\n");
	}
}
