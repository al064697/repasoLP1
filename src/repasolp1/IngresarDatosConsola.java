
package repasolp1;

import java.util.Scanner;

public class IngresarDatosConsola {

    public static void IngresarDatosConsola() {
        /*se declara una variable de tipo Scanner (si no se mencionó anteriormente fue porque Scanner es para
        introducir valores por el teclado)*/
        
        //yo a esta variable le puedo poner el nombre que yo quiera, pero por el momento sera entradaDato
        Scanner entradaDato = new Scanner(System.in);
        /*si declaras una variable de tipo Scanner y marca un error, es porque se necesita importar una clase de Scanner
        y esto se hace escribiendo java.util.Scanner  entre el package y la declaracion de nuestra clase*/
        //ahora si podemos usar el scanner declarando una variable con ella
        
        //el nextInt(); es para escribir enteros
        System.out.println("Ingrese un entero");
        int entero = entradaDato.nextInt();
        System.out.println("Tu entero es " + entero);
        
        //el .nextDouble(); es para las variables de tipo decimal
        System.out.println("Ingrese un numero con decimal o con decimal");
        double decimal = entradaDato.nextDouble(); 
        System.out.println("Tu numero es " + decimal);
        
        //para añadir una linea de textto se utiliza el .next();
        System.out.println("Ingresa tu nombre");
        String nombre = entradaDato.next();
        System.out.println("Tu nombre es: " + nombre);
        
        /*pero si por ejemplo, deseo añadir mi nombre + mi apellido, se utilizaran el .next(); seguido de
        una variable declarada con.nextLine();*/
        System.out.println("Ingresa tu nombre completo");
        nombre = entradaDato.next();
        String nombrecompleto = entradaDato.nextLine();
        System.out.println("Su nombre completo es" + nombre + nombrecompleto);
        /*Esto pasa porque nextLine no tiene la capacidad de escribir nuevos datos, pero si puede escribir los valores
        que se agregaron despues del .next*/
    }
    
}