import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;

//HashSet solo cuando no queramos duplicados

public class Set {

    public static void main(String[] args) {

        HashSet <String> hs = new HashSet <String>(); //HashSet para no tener duplicados

        hs.add("hola");
        hs.add("adios");
        hs.add("hola");

        HashSet <Integer> hss = new HashSet <Integer>();

        hss.add(1);
        hss.add(2);
        hss.add(1); //Solo imprime el uno y el dos


        HashSet <Persona> p1 = new HashSet <Persona>(); // Hashset de una clase
        // no salen duplicados por ser de la clase Set y tener el metodo hashCode y equals en la clase persona
        p1.add(new Persona("Javier",15));
        p1.add(new Persona("Daniel",16));
        p1.add(new Persona("Javier",15));
        p1.add(new Persona("Javier",16));


        LinkedHashSet <Persona> p2 = new LinkedHashSet <Persona>(); // Es igual que HashSet pero mantiene el orden de introduccion de los objetos
        //Respesta el orden, no salen duplicados por ser de la clase Set y tener el metodo hashCode y equals en la clase persona
        p2.add(new Persona("Javi",15));
        p2.add(new Persona("Dani",16));
        p2.add(new Persona("Javi",15));
        p2.add(new Persona("Javi",16));


        TreeSet <String> p3 = new TreeSet <String>(); // TreeSet hereda de SortedSet y este de Set y tiene otro metodos

        p3.add("hola");
        p3.add("Adios"); // Pone primero el adios porque tiene una mayuscula
        p3.add("hola");



        imprimirCol(hs);

        imprimirCol(hss);

        imprimirCol(p1);

        imprimirCol(p2);

        imprimirCol(p3);

    }
    public static void imprimirCol (Collection col) { //Tambien podemos poner ArrayList pero no podriamos utilizar Set, con collection te coge todo
        if (col.isEmpty())
            System.out.println("Coleccion vacía");
        else {
            Iterator  li = col.iterator();
            do {
                System.out.println(li.next());
            }while(li.hasNext());

        }
    }


}
