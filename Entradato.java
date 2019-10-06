//Programa que recibe un dato desde el teclado y lo despliega en pantalla

import java.util.Scanner;

/*public class Entradato
{
    public static void main(String[] args)
	{
	    Scanner entrada = new Scanner(System.in);
	    //int numero;
	    //float numero;
	    //double numero;

	    System.out.print("Teclee un numero: ");
	    //numero = entrada.nextInt(); //Solo sirve cuando la variable es de INT
	    //numero = entrada.nextFloat(); //Solo sirve cuando la variable es de FLOAT
	    numero = entrada.nextDouble(); //Solo sirve cuando la variable es de DOUBLE
	    

		System.out.println("El numero ingresado es:" +numero);

	}
}
*/

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
//Ahora este es un programa que lee una cadena

/*public class Entradato
{
     public static void main(String[] args)
     {
	Scanner entrada = new Scanner(System.in);
	
	String cadena;

	System.out.print("Teclee una oracion:");	
	//cadena = entrada.next();  //Esto solo lee la cadena hasta encontrar un espacio
	cadena = entrada.nextLine(); //Esto lee la cadena completa

	System.out.println("La cadena es: "+cadena);
     }
}
*/

//***********************************************************************************//
//Ahora este programa lee un caracter

public class Entradato
{
    public static void main(String[] args)
    {
	Scanner entrada = new Scanner(System.in);

	char letra;

	System.out.print("Ingresa una letra o un numero:");
	letra = entrada.next().charAt(2);

	System.out.println("La letra o numero ingresado es: " + letra);
    }
}


