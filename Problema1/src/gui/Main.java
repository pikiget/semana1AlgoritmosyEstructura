package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import clases.Docente;
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
		btnProcesar.setBounds(173, 27, 89, 23);
		contentPane.add(btnProcesar);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 74, 414, 176);
		contentPane.add(textArea);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Docente d = new Docente();
		
		d.nombre = "Gisella Guzman";
		d.codigo = 74354575;
		d.horas = 60;
		d.tarifa = 70;
		
		textArea.setText("Nombre: " + d.nombre + "\n");
		textArea.append("Codigo: " + d.codigo + "\n");
		textArea.append("Horas del mes: " + d.horas + "\n");
		textArea.append("Tarifa por hora: " + d.tarifa + "\n");
		textArea.append("Sueldo Bruto: " + d.sueldoBruto() + "\n");
		textArea.append("Descuento: " + d.calcularDescuento() + "\n");
		textArea.append("Sueldo Neto: " + d.sueldoNeto() + "\n");
		
	}
}
