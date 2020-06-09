import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

/////////////////////////////////////////////
//
//
//	@Author Robert Vasquez - 2019
//
//
////////////////////////////////////////////

public class Ventana {

	private JFrame frame;
	private JTextField textField;

	//Lanzando Aplicaci�n
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Creando Aplicaci�n
	public Ventana() {
		initialize();
	}

	
	//Creando Ventana
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		final JLabel lblNewLabel = new JLabel("New label");
		textField = new JTextField();
		textField.setBounds(10, 21, 195, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//Evento que Valida el texto
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dato = textField.getText();
				
				if(dato.equals("Robert")){
					lblNewLabel.setText(dato);
				}
			}
		});
		btnNewButton.setBounds(116, 52, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		lblNewLabel.setBounds(10, 110, 112, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
