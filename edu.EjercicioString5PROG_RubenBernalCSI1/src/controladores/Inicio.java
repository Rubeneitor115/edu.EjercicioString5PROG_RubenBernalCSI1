/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

/**
 * Clase controladora de la aplicación
 * rbr - 061024
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 061024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variable
		String frase1 = "Estoy aprediendo a programar";
		
		//Reemplazo todas las vocales del mensaje por la vocal u y lo guardo en una variable
		String frase2 = frase1.replace("a", "u");
		frase2 = frase2.replace("E", "u");
		frase2 = frase2.replace("e", "u");
		frase2 = frase2.replace("i", "u");
		frase2 = frase2.replace("o", "u");
		
		//Muestro la frase resultante por consola
		System.out.println(frase2);

	}

}
