
package repasolp1;

public class definirConstantes {
    
    public static void Constantes() {
        /*Esta clase sera muy breve debido a que son las mismas variables ya declaradas, sin embargo al volverse constante
        ya no podremos redifinirla en el codigo a futuro en donde se encuentra. Puede ser util o inutil dependiendo de la
        situacion en el que se encuentre, y esto se hace a traves de la palabra "final"
        */ //Ejemplo:
        
        /*Todos sabemos que para sacar el area y/o el perimetro se multiplica el valor pi por cierto numero dependiendo
        el caso de lo que se quiera calcular, en este caso, el ejemplo sera sacar el area del circulo*/
        final double pi = 3.141617;
        //ahora se declara el diametro con un x valor, en este caso utilizare el 9
        int diametro = 9;
        //y es ahi donde ya podemos hacer la formula de perimetro = pi * diametro
        double perimetro = pi * diametro;
        //para sacar el area sabemos que primero hay que dividir el diametro en dos, ya que el radio es dos veces el diametro
        //entonces:
        double radio = diametro / 2;
        //y finamlmente se saca el area
        double area = (pi * radio) / 2;
        //y se imprimen ambos valores
        System.out.println("Perimetro = " + perimetro);
        System.out.println("Area = "+ area);
        
        /*Este caso de constantes igual se pueden aplicar cuando el codigo habla de una sola persona en general, en este caso
        hablare por mi,
        */
        final String nombre = "Sebastian Eligio Rios Fuentes";
        int edad = 19;
        int semestreCarrera = 2;
        final String carrera = "Ingenieria en sistemas computacionales";
        /*si se observa, las variabless edad y semestre en carrera no son constantes ya que pueden ir cambiando.
        se imprime
        */
        System.out.println("Hola, soy" + nombre + ", tengo " + edad + "y voy en " + semestreCarrera + "de la carrera" + carrera);
    }
    
}