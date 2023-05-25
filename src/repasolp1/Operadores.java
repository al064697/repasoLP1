
package repasolp1;

public class Operadores {
    
    public static void operadoresAritmeticos(){ 
        /*Los operadores aritmeticos son suma, resta, multiplicacion y division*/
        
        //La suma se representa con +
        
        //Ejemplo
        /*Declaramos nuestras variables*/
        int num1, num2, num3;
        /*se le asigna un valor a las variables*/
        num1 = 2;
        num2=3;
        num3 = num1 + num2;
        /*entonces decimos que*/ System.out.println("2 + 3 = " + num3);
        
        
        //La resta se representa con -
        
        //Ejemplo: 
        //Como ya tenemos las variables declaradas, solo les damos un valor nuevo. Entonces:
        num1 = 10;
        num2 = 4;
        num3 = num1 - num2;
        /*entonces decimos que: */ System.out.println("10 - 4 = " + num3);
        
        
         //La multiplicación se representa con *
        
        //Ejemplo: 
        //Como ya tenemos las variables declaradas, solo les damos un valor nuevo. Entonces:
        num1 = 12;
        num2 = 12;
        num3 = num1 * num2;
        /*entonces decimos que: */ System.out.println("10 * 12 = " + num3);
        
        
         //La division se representa con /
        
        //Ejemplo: 
        //Como ya tenemos las variables declaradas, solo les damos un valor nuevo. Entonces:
        num1 = 20;
        num2 = 4;
        num3 = num1 / num2;
        /*entonces decimos que: */ System.out.println("20 / 4 = " + num3);
    }        
    
    public static void operadoresAsignacion() {
        /*Podemos decir que son los metodos con operadores aritmeticos pero en una minima expresion,
        ya que tan solo basta con poner el valor aritmetico de la operacion que se desee hacer +
        el igual
        */

        //Ejemplos:
        int numero = 8;
        /*Suma: */ numero += 6;
        /*Resta: */ numero -= 3;
        /*Multiplicacion: */ numero *= 8;
        /*Division: */ numero /= 4;
    }
    
    public static void operador_Incremento_Decremento() {
        /*Este tema es muy sencillo ya que solo basta con poner doble signo de suma(++) para incrementar una unidad
        al valor asignado, y doble signo de resta para decrementar una unidad al valor asignado*/
        
        //Ejemplo:
        int numero = 7;
        //y como dice en la explicacion de arriba
        
        //doble signo de suma(++) para incremento
        numero++;
        
        //doble signo de resta(--) para decremento
        numero--;
    }
    
    public static void operadoresCondicionales() {
        /*los operadores condicionales son aquellos que te plantean una condicion y se usa mucho en cuanto a if
        y en los do-while.
        
        los operadores condicionales son
        >=    mayor o igual que
        <=    menor o igual qie
        >     mayor que
        <     menor que
        ==    igual que
        !=    diferente que
        &&    AND logico: devuelve verdadero ambas condiciones solo si ambas son verdaderas
        ||    OR logico: devuelve verdadero si al menos una condicion es verdadera
        
        Ejemplos:
        a >= b      (a es mayor o igual que b)
        a <= b      (a es menor o igual que b)
        a > b       (a es mayor que b)
        a < b       (a es menor que b)
        a == b      (a es igual que b)
        a != b      (a es diferente que b)
        
       (a == b) && ( b==a)     a es igual que b y b es igual que a
       (a == b) || (b>=a)      a es igual que b y b es igual que a
        
        */
    }
}