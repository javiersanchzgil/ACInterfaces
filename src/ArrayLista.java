
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;


public class ArrayLista {
    static final int MAX = 4;
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in,"UTF-8");

        //Listas
        ArrayList<Integer> array = new ArrayList<Integer>();
        int num = 0;
        int num2 = 0;
        int i = 0;
        String lado = "";


        System.out.println("Introduce dígitos por pantalla que contengan 4 dígitos");
        num = Integer.parseInt(sc.nextLine());
        num2 = Integer.parseInt(String.valueOf(Integer.toString(num).length()));

        //Introducimos numeros en el arraylist
        while(num2 == MAX){
            array.add(i,num);
            i++;
            System.out.print("Introduce el siguiente dígito");
            num = Integer.parseInt(sc.nextLine());
            num2 = Integer.toString(num).length();

        }

        //Imprimir lista desde el principio
        imprimir(array,"principio");
        //Recorrer la lista desde el final
        imprimir(array,"fin");



    }


    static void imprimir (ArrayList array, String lado){

        int tam = array.size();
        int x =0;
        if (lado.equalsIgnoreCase("principio")) {
            for (x = 0; x < tam; x++)
                System.out.print(" " + array.get(x));
        }
        else
        if (lado.equalsIgnoreCase("fin")) {
            for (x = tam-1; x >= 0; x--)
                System.out.print(" " + array.get(x));
        }
    }

    static void imprimir2 (ArrayList<Integer> array, String lado){

        ListIterator <Integer> obj = array.listIterator();

        if(lado.equalsIgnoreCase("Principio")) {
            while (obj.hasNext()) {
                System.out.println(obj.next());

            }
        }
        else
        if(lado.equalsIgnoreCase("fin")) {
            obj = array.listIterator(array.size());
            while (obj.hasPrevious()) {
                System.out.println(obj.previous());
            }
        }
        else
            System.out.println("No hay nada");
    }
}
