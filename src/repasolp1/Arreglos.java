
package repasolp1;

public class Arreglos {
    
    public static void Arreglos(){
        /*un arreglo o array nos permite guardar una cantidad de datos del mismo tipo, es una variable que puede contener
        multiples valores, a diferencia de una variable normal y los tipos de arreglos que se pueden generar son basicamente
        de igual tipo que de las variables (String, int, double, float, boleean, etc)*/
    
        //entonces empezare por crear una de tipo int
        int[] listaNumeros = {1, 2, 3, 4, 5};
        /*para declarar un arreglo se le colocan corchetes[] a lado del tipo de arreglo y para agregar valores en el se usan
        llaves{}*/
    
        //arreglo String
        String[] carros = {"Ferrari", "Audi", "Mercedes Benz", "Renault"};
    
        /*para mostrar la longitud de nuestro arreglo*/ System.out.println(carros.length);
        
        char[] caracter = new char[carros.length];
        
    }
}