import javax.swing.JOptionPane;

public class Entradato2
{
   public static void main(String[] args)
   {
	String cadena;
	int entero;
	char letra;
	double decimal;

	cadena = JOptionPane.showInputDialog("Teclee una cadena:");
	entero = Integer.parseInt(JOptionPane.showInputDialog("Teclee un numero entero:")); //Forzosamente debe ser un numero entero sino marca un error.
	letra = JOptionPane.showInputDialog("Teclee un caracter:").charAt(0);
	decimal = Double.parseDouble(JOptionPane.showInputDialog("Teclee un decimal:")); //Tienes que colocar la decimal con un punto (.) porque con la coma(,) marca error.

	JOptionPane.showMessageDialog(null, "La cadena original es: "+cadena);
	JOptionPane.showMessageDialog(null, "El numero entero es: "+entero);
	JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
	JOptionPane.showMessageDialog(null, "El decimal es: " +decimal);
   }
}



