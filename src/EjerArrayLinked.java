
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Las dos heredan de List (ArrayList y LinkedList) y List y Set de Collection
// Iterator y ListIterator hereda de ArrayList y de LinkedList (cualquiera de estas dos las podemos pasar a Iterator o ListIterator creando un objeto) )
//LinkedList se utiliza cuando queremos añadir cosas a la lista
//ListIterator por si necesitamo movernos con la lista
// ListIterator hereda los metodos de Iterator y de ListIterator
//Utilizar siempre un Iterator para recorrer
//


public class EjerArrayLinked {

    public static void main(String[] args) {

        ArrayList <Integer> al = new ArrayList <Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(1);

        imprimirCol(al,'a');
        System.out.println("\n\n");
        imprimirCol(al,'b');
        System.out.println("\n\n");

        LinkedList<Integer> ll = new LinkedList <Integer>();
        ll.add(2);
        ll.add(4);
        ll.add(88);
        ll.add(88);

        imprimirCol2(ll,'a');
        System.out.println("\n\n");
        imprimirCol2(ll,'b');


        System.out.println("Métodos de LinkedList");
        System.out.println(ll.getLast());
        System.out.println(ll.getFirst());

        System.out.println("Métodos de ArrayList");
        System.out.println(al.add(1));


    }

    public static void imprimirCol (ArrayList <Integer> al, char op) { //Tambien podemos poner ArrayList pero no podriamos utilizar Set
        if (al.isEmpty())
            System.out.println("Coleccion vacía");

        else
            if(op == 'a') {
                ListIterator <Integer> li = al.listIterator();
                do {
                    System.out.println(li.next());
                }while(li.hasNext());

             }else if(op == 'b') {
                ListIterator <Integer> li = al.listIterator(al.size());
                do {
                    System.out.println(li.previous());
                }while(li.hasPrevious());

        }

    }

    public static void imprimirCol2 (LinkedList <Integer> ll, char op) {
        if (ll.isEmpty())
            System.out.println("Coleccion vacía");
        else
        if(op == 'a') {
            ListIterator <Integer> li = ll.listIterator();
            do {
                System.out.println(li.next());
            }while(li.hasNext());

        }
        else
        //Imprimir un linkedlist al reves
        if(op == 'b') {
            ListIterator <Integer> li = ll.listIterator(ll.size());
            do {
                System.out.println(li.previous());
            }while(li.hasPrevious());

        }
    }
}
