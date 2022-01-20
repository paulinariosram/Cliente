import javax.swing.JOptionPane;

public class ClientePauli {
	public static void main (String [] args) {
	
		String nombres;
		String direccion;
		
		nombres= JOptionPane.showInputDialog("Por favor ingresa nombre y apellidos completos");
			
		JOptionPane.showMessageDialog(null, "El nombre ingresado es: "+(nombres));
		
		direccion= JOptionPane.showInputDialog("Por favor ingresa direccion de residencia");
		
		JOptionPane.showMessageDialog(null, "El nombre ingresado es: "+(direccion));

	}
}
