package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Caja;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setTitle("Propuesto_1_4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(163, 22, 89, 23);
		contentPane.add(btnProcesar);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 73, 414, 177);
		contentPane.add(textArea);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Caja c = new Caja();
		
		c.largo = 20.5;
		c.ancho = 30.5;
		c.alto = 10;
		c.pesoBanlanza = 50;
		
		textArea.setText("Largo: " + c.largo + "\n");
		textArea.append("Ancho: " + c.ancho + "\n");
		textArea.append("Alto: " + c.alto + "\n");
		textArea.append("Peso balanza: " + c.pesoBanlanza + "\n");
		textArea.append("Volumen de la caja: " + c.volumenCaja() + "\n");
		textArea.append("Peso Volumétrico: " + c.pesoVolumetrico() + "\n");
		textArea.append("Peso facturable: " + c.pesoFacturable() + "\n");
	}
}
