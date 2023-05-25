
package repasolp1.POO.models;

public class monedasConstructor {
    
    /*como se menciono anteriormente, se crea una clase que solo servira para guardar constructores y complementos
    y los objetos a registrar. para esta ocasion se utilizaran monedas y tipo de monedas*/
    
    //declaramos las variables de tipo privadas (private) y ya dependiendo la clase a la que estas pertenezcan
    
    private int ID;
    private String Nombre;
    private String Simbolo;
    private double valorPesos;
    
    
    /*una vez hecho esto, damos click derecho sobre el espacio de codigo y buscamos una opcion llamada "insert code"
    (o presionen las teclas alt + insert). una vez presionada les saldra diversas opciones, de las cuales,
    el constructor, el getter and setter y el toString son de nuestra total importancia*/
    
    /*empezamos agregando dos constructores (uno vacio y uno completo, es decir, a la segunda vez que coloquemos un
    constructor activaremos todos los cuadros de seleccion que nos muestra el cuadro de dialogo)*/
    
    
    //primer constructor
    
    public monedasConstructor() {
    }
    
    
    //segundo constructor
    
    public monedasConstructor(int ID, String Nombre, String Simbolo, double valorPesos) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Simbolo = Simbolo;
        this.valorPesos = valorPesos;
    }
    
    
    //Getter and Setter (con todos los cuadros de seleccion activados)
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSimbolo() {
        return Simbolo;
    }

    public void setSimbolo(String Simbolo) {
        this.Simbolo = Simbolo;
    }

    public double getValorPesos() {
        return valorPesos;
    }

    public void setValorPesos(double valorPesos) {
        this.valorPesos = valorPesos;
    }
    
    
    //toString() (con todos los cuadros de seleccion activos

    @Override
    public String toString() {
        return "monedasConstructor{" + "ID=" + ID + ", Nombre=" + Nombre + ", Simbolo=" + Simbolo + ", valorPesos=" + valorPesos + '}';
    }
    
    /*una vez ya hecho todo esto, nos vamos a nuestra clase principal a seguir con el trabajo*/
    
    /*
    Notas:
    1. todo este codigo si se memoriza tambien se puede hacer a mano y no necesariamente usar el insert code
    2. para evitar estar clickeando los cuadros de seleccion, puede dar click en el boton select all
    */
}