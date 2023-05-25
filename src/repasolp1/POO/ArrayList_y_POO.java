package repasolp1.POO;

import repasolp1.POO.models.monedasConstructor;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_y_POO /*programa monedas*/{
    
    /*los arraylist a diferencia de los array, es que si se le agrega un limite de valores a la lista,
    no puede agregar mas valores de lo indicado, al menos que se le cambie el numero de valores a agregar,
    a diferencia de un arraylist que podemos seguir agregando y agregando y no solo agregar, sino que editar los valores
    ya existentes e incluso eliminarlos.*/
    
    /*comenzamos creando un nuevo package en  donde almacenaremos nuestras clases con distintos 
    Constructores y otras funciones como el getter() and setter() y el toString(), no mas sin antes
    eclarar varias variables a las que denominaremos como objetos*/
    
    /*ya para comenzar, con todo lo aprendido crearemos un programa en donde se pueda agregar, modificar y borrar objetos
    que han sido almacenados en al arraylist de este programa llamado monedas*/
    
    /*para declarar un arraylist empezamos por declarar que esta variable sera de tipo arraylist y que sera estatica,
    por consiguiente, dentro de los signos <> va el nombre de la clase en donde se almacenan los constructores y los
    otros atributos, luego se le denomina un programa, de ahi se le indica que crearemos un nuevo arraylist, volviendo
    a agregar los <> y agregando los ()*/
    
    static ArrayList<monedasConstructor> moneda = new java.util.ArrayList<>();
    
    /*como paso final importamos nuestros models, que es donde contiene la clase con constructores, y por ultimo, 
    la de ArrayList (java.util.ArrayList)*/
    
    
    /*al igual que con el ArrayList, como ya a partir de aqui estaremos usando el scanner de manera frecuente,
    lo declaramos como estatico*/
    
    static Scanner entradaDato = new Scanner(System.in);
    
    /*al igual que el ArrayList, importamos el scanner (java.util.Scanner)*/
    
    
    //para crear monedas manualmente
    
    public static void monedaLlenar() {
        
        /*en primer lugar empezamos nombrando nuestra variable de tipo ArrayList, seguido del atributo add,
        de ahi decimos que queremos agregar un nuevo objeto usamdo los constructores y es por eso que escribimos
        new monedasConstructor, ya que de ahi sale, de ahi, declaramos el valor de cada variable agregada al
        constructor. tranquilo que cada valor asignado se queda tal y como esta y nada se edita*/
        
        moneda.add(new monedasConstructor (1,"peso","$",1));
        moneda.add(new monedasConstructor (2,"dolar","$",19));
        moneda.add(new monedasConstructor (3,"euro","e",25));
        
        //para imprimir todas las monedas que se han agregado podemos recurrir al fore
        
        /*entonces*/ for (monedasConstructor monedas : moneda) {
            System.out.println(moneda.toString());
        }
    }
    
    //registrar o crear nueva moneda en el ArrayList
    
    public static void monedaAgregar(){
        System.out.println("Registre una nueva moneda ");
        
        //empezamos por registrar el ID que se le dara a la moneda con un tipo de entradaDato.nextInt()
        System.out.println("ID");
        int monedaID = entradaDato.nextInt();
        
        //seguido del nombre de la moneda con un tipo de entradaDato.next()
        System.out.println("Nombre");
        String monedanombre = entradaDato.next();
        
        //de ahi con el simbolo de la moneda que igual es .next()
        System.out.println("Símbolo");
        String monedasimbolo = entradaDato.next();
        
        //de ahi el valor de la moneda en pesos mexicanos, ese sera con un tipo de entradaDato.nextDouble()
        System.out.println("Valor en pesos mexicanos");
        int valorenpesos = entradaDato.nextInt();
        System.out.println(""); //el println vacio significa un espacio vacio
        
        //posterior a eso vamos añadiendo las variables en el nuevo objeto a crear
        moneda.add(new monedasConstructor (monedaID, monedanombre, monedasimbolo, valorenpesos));
        System.out.println("PROCESS FINISHED - ERRORS: 0");
    }
    
    //Actualizar datos de moneda
    public static void monedaActualizarDatos(){
        //se introduce el ID con la que fue registrada la moneda para obtener todos sus valores mediante una entrada de Scanner
        System.out.println("Ingrese el ID de la moneda a actualizar");
        int ID = entradaDato.nextInt(); 
        moneda.get(ID); //se obtienen sus valores mediante el atributo get
        
        //hora de cambiar los valores
        //se introduce el nuevo nombre mediante entrada de datos (el id no se puede modificar para no crear confusion con otros ID)
        System.out.print("Nombre: ");
        String monedanombre = entradaDato.next();
        
        //se ingresa un nuevo simbolo para la moneda
        System.out.print("Simbolo");
        String monedasimbolo = entradaDato.next();
        
        //se le añade un nuevo valor
        System.out.println("");
        double valorenpesos = entradaDato.nextDouble();
        
        //finalmente, mediante el ID se busca la moneda a actualizar y se reemplazan los datos antiguos con los nuevos mediante el atributo set
        moneda.get(ID).setNombre(monedanombre); //se agregan las variables como valor
        moneda.get(ID).setSimbolo(monedasimbolo);
        moneda.get(ID).setValorPesos(valorenpesos);
        System.out.println("PROCESS FINISHED - ERRORS: 0");   
        }
    
        //borrar moneda
        public static void monedaEliminar(){
            //de nueva cuenta, mediante el ID se busca la moneda a borrar
            System.out.println("Ingrese el ID del continente para eliminar");
            System.out.print("ID: ");
            int ID=entradaDato.nextInt();
            
            //Se le pide al usuario confirmar la eliminacion de la moneda escribiendo si si, o si no
            System.out.println("Seguro que deseas eliminar esta moneda de la lista");
            System.out.println("Escribe si, si si estas seguro, de lo contrario, escribe no");
            String confirmacion = entradaDato.next();
            
            //la confirmacion se lleva a cabo mediante un if
            if (confirmacion == "si"){ 
            moneda.remove(ID);
            System.out.println("PROCESS FINISHED - ERRORS: 0");
            } else {
                if (confirmacion == "no") {
                    System.out.println("Ok, la moneda no se eliminara");
                }
            }
        }
        
        //Crear menu de opciones para el programa
        
        /*primero, creamos un metodo en donde solo se impriman las opciones disponibles a elegir*/
        public static void menu() {
        System.out.println("Que desea hacer?");
        System.out.println("Ver lista de monedas- - - - - - - - - - - - - 1");
        System.out.println("Agregar nuevas monedas- - - - - - - - - - - - 2");
        System.out.println("Actualizar datos de moneda- - - - - - - - -- -3");
        System.out.println("Borrar moneda- - - - - - - - - - - - - - - - -4");
        System.out.println("Salir- - - - - - - - - - - - - - - - - - - - -9");  
        }
        
        //posterior viene la parte logica (a la cual llamaremos como opciones)
        public static void opciones(/*se añade un parametro de tipo int*/ int opcion) {
            //una vez aqui, desarrollamos un switch
            //el menu sera de tipo int, en donde las opciones son numeros enteros
            
            /*entonces*/ switch(opcion/*se le añade el parametro agregado anteriormente como fundamento del switch*/) {
                
                //se crean casos, en donde en cada uno se encuentran los metodos creados anteriormente*/
                case 1: monedaLlenar(); break;
                case 2: monedaAgregar(); break;
                case 3: monedaActualizarDatos(); break;
                case 4: monedaEliminar(); break;
                default: System.out.println("PROCESS FINISHED. GOOD BYE"); break;
            }
        }
        
        //una vez hecho todo esto, se fusiona el menu con opciones para concretar lo que seria el menu opciones
        public static void menuopciones(){
        int opcion; //se añade una variable de tipo entero que se usara con el parametro del metodo opciones
        
        do{ //se agrega un ciclo do while para que al finalizar cada metodo, nos vuelva a preguntar que deseamos hacer
            opcion = entradaDato.nextInt(); 
            opciones (opcion); //se agrega el metodo opciones con el valor de su parametro
            
        } while (opcion != 9); //el 9 indica el fin del do while
    }
        
    public static void main(String[] args) {
        menuopciones(); //ya para terminar el metodo, solo agregamos el menu opciones al main
        
        //recuerda: el main debe de estar lo mas limpio posible
    }
}