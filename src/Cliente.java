import javax.swing.JOptionPane;
import java.util.Scanner;


public class Cliente {

	public static void main (String [] args) {
		
	
		
		String tipoDocumento = (JOptionPane.showInputDialog("Ingrese tipo de documento"));
		int numeroDeDocumento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de documento"));
		
		JOptionPane.showMessageDialog(null, "El tipo y número de documento es : " +(tipoDocumento +" " +numeroDeDocumento));
		
		 
	}
}
