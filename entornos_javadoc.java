/*
 * Primero pasamos los números del array, 
 * seguidamente declaramos la variables que necesitamos para calcular la media,
 * por último creamos la variables que son necesarias para hacer que el bucle funciones
 */

public class entornos_javadoc {
	
	/**
	 * author Héctor Olmedilla Calero
	 * @param args en este proyecto no se usa, se deja por defecto
	 */

	public static void main(String[] args) {
		//Almacena los números de la forma que quiras
		int[] array = {5, 7, 3, 7, 2, 9, 7};
        
		//Cuenta las veces que aparece un número del array
		int contador = 0;
        
		//Te dice cuantas veces aparece
        int repeticiones = 0;
        
        //Te ayuda a comparar número
        int auxiliar = array[0];

        //Bucle para recorrer el array
        for (int i = 1; i < array.length; i++) {
            if (array[i] > auxiliar) {
                auxiliar = array[i];
            }
        }

        //Bucle que recorre el array y cuenta cuantas veces sale el mismo número
        for (int i = 0; i < array.length; i++) {
            if (array[i] == auxiliar) {
                contador++;
            }
        }

        //Almacena las repeticiones
        if (contador > 1) {
            repeticiones = 1;
        }

        //Muestra si repite el número más alto y muestra el mensaje
        if (repeticiones == 1) {
            System.out.println("Se repite el número");
        } else {
            System.out.println("No se repite el número");
        }

        //Guarda el resultado de sumar los números del array
        int suma = 0;
        
        //Bucle que recorre el array para guardar en la variable "suma" todos los número sumados del array
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        //Guarda el valor de la media de la suma de los números del array
        double media = (double) suma / array.length;
        
        //Muestra el resultado de la media
        System.out.println("La media es : " + media);

        //Dice si la media es mayor que 5
        if (media >= 5) {
            System.out.println("La media es mayor que 5");
        } else {
            System.out.println("La media es menor que 5");
        }
	}

}
