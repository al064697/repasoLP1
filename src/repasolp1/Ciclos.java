
package repasolp1;

public class Ciclos {
    
    public static void cicloWhile() {
        /*el ciclo while repite una accion con la ayuda de los operadores condicionales*/
        
        int i /*viene de la palabra integracion, que tiene una secuencia logica*/ = 1;
        
        while /*mientras*/ (i<10) {
        //se coloca la accion a repetir hasta llegar al limite establecido
        System.out.println(i+1);
        i = i + 1; //esto se puede hacer con cualquier operador aritmetico, evidentemente
        }
    }
    
    public static void cicloDoWhile() {
        /*do while es un ciclo no tan diferente a while en donde tu puedes declarar una variable de x valor y pedir
        que corra una accion mientras que la variable cumpla la condicion puesta, una vez cumplida, el ciclo se detiene*/
        
        int i = 1; //en este caso, el do while no es tan estricto con el tipo, valor o nombre de la variable
        
        do { //a diferencia del while, este inicia poniendo primero do
            System.out.println(i);
            i++;
        }while(i >= 10); //y termina cerrando la llave, seguido de la condicion while
    }
    
    public static void cicloFori() {
        //el fori declara todo en una sola linea: el valor de i, el rango de i y si es de incremento o decremento
        //el nombre viene de for y la variable i
        for /*para */ (int i = 1; i <= 10 ; i++) {
            //cuerpo del metodo fori
            System.out.println(i);
            i=+2;
        }
    }
    
    public static void cicloFore() {
        //los array o los arreglos se verán en el siguiente archivo, asi que por lo pronto agregare este para que lean el archivo de arreglos
        String[] carros = {"Ferrari", "Audi", "Mercedes Benz", "Renault"};
        /*su nombre viene de for each, que vendria siendo "para cada", por lo que podriamos decir que para cada variable
        hay un objeto*/
            for(/*se declara una variable*/String carro: /*recibe el numero de datos en el arreglo*/carros){
                /*cuerpo del metodo fore*/ System.out.println(carro);
        }
    }
}
