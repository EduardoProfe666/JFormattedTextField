package componentes;

import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;

public class Prueba extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public Prueba() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		MaskFormatter m1 = new MaskFormatter("'A-###");
		MaskFormatter m2 = new MaskFormatter("###########"); //Carnet de identidad
		MaskFormatter m3 = new MaskFormatter("(+53) ###-####"); //Contacto telefonico
		JFormattedTextField formattedTextField = new JFormattedTextField(m1);
		formattedTextField.setBounds(106, 40, 385, 53);
		contentPane.add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(m2);
		formattedTextField_1.setBounds(106, 122, 385, 53);
		contentPane.add(formattedTextField_1);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField(m3);
		formattedTextField_2.setBounds(106, 210, 385, 53);
		contentPane.add(formattedTextField_2);
	}

}
