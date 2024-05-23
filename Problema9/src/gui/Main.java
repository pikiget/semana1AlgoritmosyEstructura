package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Equipo;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea;
	private JButton btnProcesar;

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
		setTitle("Propuesto_1_5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 70, 414, 180);
		contentPane.add(textArea);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(169, 22, 89, 23);
		contentPane.add(btnProcesar);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Equipo eq = new Equipo();
		
		eq.codigo = 1234;
		eq.marca = "Samsung";
		eq.color = "Azul";
		eq.precioD = 120;
		
		textArea.setText("Codigo: " + eq.codigo + "\n");
		textArea.append("Marca: " + eq.marca + "\n");
		textArea.append("Color: " + eq.color + "\n");
		textArea.append("Precio dolar: " + eq.precioD + "\n");
		textArea.append("Marca: " + eq.marca + "\n");
		textArea.append("Precio Soles: " + eq.precioSoles() + "\n");
		textArea.append("Precio Euro: " + eq.precioEuro()+ "\n");
	}
}
