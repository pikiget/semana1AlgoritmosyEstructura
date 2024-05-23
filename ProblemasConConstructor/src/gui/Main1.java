/*Propuesto_1_1*/
package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import clases.Expositor;

public class Main1 extends JFrame implements ActionListener {

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
					Main1 frame = new Main1();
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
	public Main1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 61, 414, 189);
		contentPane.add(textArea);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(172, 11, 89, 23);
		contentPane.add(btnProcesar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Expositor ex = new Expositor(123,"Juan",5,50);
		
		textArea.setText("Código: " + ex.codigo + "\n");
		textArea.append("Nombre: " + ex.nombre + "\n");
		textArea.append("Horas: " + ex.horas + "\n");
		textArea.append("Tarifa: " + ex.tarifa + "\n");
		textArea.append("Sueldo bruto: " + ex.sueldoBruto() + "\n");
		textArea.append("Descuento AFP: " + ex.descuentoAFP() + "\n");
		textArea.append("Descuento EPS: " + ex.descuentoEPS() + "\n");
		textArea.append("Sueldo neto: " + ex.sueldoNeto());
	}
}
