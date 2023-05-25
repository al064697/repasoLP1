
package repasolp1;

import java.util.Scanner;

public class Condicionales {
    
    static Scanner entradaDato = new Scanner(System.in); 
    /*cuando un stanner lo vamos a usar mas de una vez, se pone antes o despues de algun metodo y se declara de tipo 
    estatico (static)
    */
    
    public static void condicionalIfElse() {
        //If / else
        /*Hace una comparativa y una condicion entre variables dentro de ella y pueden ser de caracter
        String, int, double, boolean, chart, etc. Aqui implementaremos los operadores condicionales o de condicion
        que son >=, <=, >, <, ==, != */
        
        /*En este ejemplo se planteara la problematica escolar en donde si la calificacion es mayor o igual a 7,
        el alumno esta aprobado, sin embargo, si es menor a 7, esta reprobado*/
        
        //Se empieza declarando la variable
        
        /*Supongamos que el alumno tiene una nota de 6.9*/ double calificacion = 6.9;
        
        //se construye el if de siguiente manera
        
        if(calificacion >=/*mayor o igual que*/ 7) {  
        //"si" if ((nombre de la variable) (operador de condicion) (valor o variable a considerar)) {
            
            System.out.println("El alumno esta aprobado"); //accion a realizar en caso de que se cumpla la condicion
            
        } else { //"pero", opcion para plantear otra condicion en caso de que la primera no se cumpla
            
            /*se plantea otro if*/ if (calificacion <=/*menor o igual que*/ 6.99) {
                
                /*se plantea otra accion de condicion*/ System.out.println("El alumno esta reprobado");
            }
            
            //esto que se acaba de hacer (que haya otro if dentro de uno) se le conoce como condicional anidado
        }
        
        /*ahora digamos que el alumno tiene 8.6*/ calificacion = 8.6;
        
       /*ahora, este if sera diferente porque la comparativa ya no se haran con valores sino con variables (en este caso una)*/
       int calificacionAprobatoria = 7;
       
       //construimos el if
       if (calificacion >= calificacionAprobatoria) {
           System.out.println("El alumno esta aprobado");
       } else {
           if (calificacion < calificacionAprobatoria) {
               System.out.println("El alumno esta reprobado");
           }
       }
       //consejo: asegurate que todas las llaves que abras "{", las cierres despues del meetodo "}"
       
       //Ahora intentemos con un if de verificacion de nombre
       
       /*declaramos la variable*/ String nombre = "Sebastian";
       
       //Construimos el else
       if (nombre !=/*diferente que*/ "Sebastian") {
           System.out.println("Intruso");
       } else {
           if (nombre == /*igual que*/ "Sebastian") {
               System.out.println("Bienvenido de nuevo" + nombre);
           }
       }
    }
    
    public static void condicionalSwitchCase() {
    /*El switch en mi caso, se me resulta mucho mas facil que el if, ya que consiste en una lista de casos (cases) enlistados
        del valor de una variable. Es muy popular entre la elaboracion de menus
        En este caso haremos un switch de dias de la semana con una variable de tipo Scannner*/
    
    
    int diaSemana = entradaDato.nextInt(); //recordando de que .nextInt() aplica para variables de tipo enteros (int)
    
    //construimos el switch
    switch (diaSemana /*dependiendo del valor que le arroje la variable sera el caso que tome*/) {
        
        case 1: System.out.println("lunes"); //al igual que ocn el if, puedes agregar cualquier accion a los cases
        /*el numero de casos pueden ser del orden deseado, siempre y cuando coincidan con el valor de la variable*/
      
        break; //asegurate de terminar (romper) el case para que el switch no corra por si solo y respete el valor ingresado
        
        case 2: System.out.println("martes"); break;
        case 3: System.out.println("miercoles"); break; 
        case 4: System.out.println("jueves"); break;
        case 5: System.out.println("viernes"); break;
        case 6: System.out.println("sabado"); break;
        case 7: System.out.println("domingo"); break;
        default: /*terminara inmediatamente con el proceso*/ System.out.println("No esiste este dia"); 
        break; //pese a que ya asi se corta el switch, por precaucion se le pone un break al final de este
    }
    
    //podriamos hacer basicamente lo mismo solo que con texto, por ejemplo:
    String opcion = entradaDato.next();
    switch(opcion) {
        case "acceso": /*note que en vez de un valor de tipo entero se coloco uno de tipo String*/
            System.out.println("Usted selecciono el acceso"); break;
        case "configuracion": System.out.println("usted selecciono la configuracion"); break;
        case "ayuda": System.out.println("usted selecciono la ayuda"); break;
        default: System.out.println("opcion no valida"); break;
    }
    }
}