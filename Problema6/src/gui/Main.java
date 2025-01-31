/*Propuesto_1_2*/
package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import clases.Trabajador;

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
		setTitle("Propuesto_1_2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(164, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 41, 414, 209);
		contentPane.add(textArea);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Trabajador t = new Trabajador();
		
		t.codigo = 12345;
		t.nombre = "Roy Paul";
		t.horas = 50;
		t.tarifa = 250;
		
		textArea.setText("Código: " + t.codigo + "\n");
		textArea.append("Nombre: " + t.nombre + "\n");
		textArea.append("Horas: " + t.horas + "\n");
		textArea.append("Tarifa: " + t.tarifa + "\n");
		textArea.append("Sueldo: " + t.Sueldo() + "\n");
	}
}
