
package repasolp1;

public class Variables_y_Metodos {
    
    public static void Variables() {
    /* Para mostrar una variable, un metodo o simplemente un caracter de carácter 
        ya sea entero (int), decimal (double), boleano (boolean), de texto (String), etc,
        utilizamos la función imprimir que se interpreta como: */
        System.out.print("Hola Mundo");
        //como ejemplo se colocó el hola mundo...
        /* Sin embargo, si queremos imprimir algo y luego agregar una nueva linea que no choque
        con el contenido anterior, podemos utilizar:
        */
        System.out.println("Hola Mundo");
        /* De hecho la instruccion nos dice lo que hace: print = imprimir; ln = New Line*/
        
        /*Variables_y_Metodos: Las variables sirven para guardar cosas dependiendo de su tipo, ya que existen
        diversos tipos de variables
       Para declarar variables primero se declara que tipo de variable sera, en este caso, un:*/
        int numeroEntero;
        /*(el int permite guardar valores enteros con una minima de -2147483648 y un mayor de 2147483647)
        Despues de declarar la variable con el tipo de variable ya asignado, se le da un valor
        */
        numeroEntero = 30000;
        //Mientras que para registrar decimales usamos double:
        double numeroDecimal;
        numeroDecimal=3000.220825;
         
        /*El chart es utilizado para agregar solo un caracter en especifico, y se estructura de la siguiente
         manera*/
        char caracter;
        caracter = 'C';
         
        //La variable de tipo boleano (boolean) solo acepta dos valores: true y false
        boolean valorBoleano;
        valorBoleano = true;
        valorBoleano = false;
        
        /*Para meter una cadena de datos, se utiliza String, y String nos permite meter texto y numeros, pero
         solo con comillas ("")*/
        String Nombre = "Sebastian Eligio Rios Fuentes";
        
        /*Para mostar diversos valores en la pantalla se hace una impresión concatenada, o mas basico, se unen los elementos
        y esto se hace con el signo de (+) y esto se puede hacer en un System.out.print o en un System.out.println o en una 
        variable de tipo String
        */ //Ejemplo:
        int edad = 19;
        String carrera = "Ingenieria en sistemas computacionales";
        String universidad = "Universidad Autonoma de Campeche";
        System.out.println("Hola, me llamo " + Nombre + ", tengo " + edad + " y estudio " + carrera + " en la " +universidad);
        /*Como ya se habia agregado la variable nombre, simplemente se vuelve a reutilizar*/
    }
    
    /*por otro lado asi como existen las variables, tambien existen los metodos, que pueden declararse como estaticos 
    publicos (public static) o estaticos privados (private static) dependiendo la necesidad, ademas de que igual se puede
    crear un metodo de caracter String, que devuelve un valor de cadena; un metodo int, que devuelve un valor entero;
    un metodo double, que devuelve un valor decimal, etc..., sin embargo, puedes usar void en caso de que no quieras 
    que te devuelva ningun valor, despues de decidir de que tipo es el metodo, se le coloca un nombre
    los metodos son subrutinas que manipulan los datos definidos por la clase y contiene una o mas declaraciones, sin 
    embargo, este solo puede realizar una tarea.*/
    
    //Ejemplos: 
     public static void metodoVoid() {
        //cuerpo del metodo
        
        /*no devuelve ningun valor*/
    } 
    
    //los metodos como String, double, int, etc..., si piden que necesariamente devuelvas un valor
    public static int metodoInt(int entero /*lo que va adentro de los parentesis se le llama parametros*/) {
        
        /*los metodos con parametros reciben variables de x tipos(String, double, int,etc...) desde el main
        un valor o una variable del mismo tipo del que se recibio*/
        
        //cuerpo del metodo
        
        return entero; //devuelve un valor
    }
    
    public static double areaCirculo(final double pi, int diametro) {
        double perimetro = pi * diametro;
        double radio = diametro / 2;
        double area = (pi * (radio * radio)) / 2;
        
        return area;  //devuelve el/los valores que decidas devolver
    }
    
    //Ejemplo con parametros
    public static void metodovoidParametros(String mensaje) { 
        /*lo que hace este metodo es recibir variables de diferentes tipos, para despues recibir un valor
        del mismo tipo ys una vez que el main corra el programa*/
        
        //se podrian declarar o no variables, segun sea necesario (en este caso no)
}
    //main (String[] args)
    //este metodo es especial en la clase ya que es aqui donde se ejecutan todos los metodos no solo de la clase, sino del proyecto
    public static void main(String[] args) { 
        metodovoidParametros("Hola Mundo"); 
        double areaCirculo = areaCirculo(3.141716, 5);
        System.out.println("Area del circulo = (pi * (radio* radio)) / 2 = " + areaCirculo );
        
        //entre mas limpio este el main, mejor
    }
}