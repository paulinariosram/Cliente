import javax.swing.JOptionPane;

public class ClienteVictoria {
	
	public static void main (String[] args) {
		
		int edad;
		String telefono;
		
		edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
		telefono = JOptionPane.showInputDialog("Ingrese el telefono:");
		
		JOptionPane.showMessageDialog(null,"La edad de la persona es: "+edad);
		JOptionPane.showMessageDialog(null,"El telefono de la persona es: "+telefono);
	}

}
