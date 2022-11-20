import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListConClase {

    public static void main (String [] args) {
        ArrayList <Persona> aPer = new ArrayList <Persona> ();

        Persona p1 = new Persona("Javier",23);
        Persona p2 = new Persona("Daniel",22);
        Persona p3 = new Persona("Tomas",21);
        Persona p4 = new Persona("Javito",20);
        Persona p5 = new Persona("Javier",23);

        aPer.add(p1);
        aPer.add(p2);
        aPer.add(p3);
        aPer.add(p4);
        aPer.add(p5);


        System.out.println(aPer);
        imprimir2(aPer);

    }

    public static void imprimir2 (Collection col) {

        if(col.isEmpty())
            System.out.println("Collecion vació");

        else {
            Iterator li = col.iterator();

            do
                System.out.println(li.next());
            while(li.hasNext());
        }

    }
}

