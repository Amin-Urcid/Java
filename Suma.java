import javax.swing.JOptionPane;

//Este programa hace una suma ingresand números por medio de ventanas emergentes
class Suma
{
  public static void main(String[] args)
  {
    	float num1;
	float num2;
	float resultado;
	float suma;


	num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero: "));
	num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingres el segundo numero: "));
	resultado = num1 + num2;

	JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
   
  }
}