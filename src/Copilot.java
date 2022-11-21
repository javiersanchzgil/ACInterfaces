import java.util.ArrayList;
import java.util.Scanner;

public class Copilot {

    public static void main(String[] args) {
        // TODO code application logic here

        //Pedir numeros por teclado hasta que diga que no
        //Guardarlos en un arraylist
        //Imprimir el arraylist
        //Imprimir el arraylist al reves

        //Listas
        ArrayList<Integer> array = new ArrayList<Integer>();
        int num = 0;
        int num2 = 0;
        int i = 0;
        String lado = "";
        String respuesta = "";
        Scanner sc = new Scanner(System.in,"UTF-8");

        do{
            System.out.println("Introduce dígitos por pantalla que contengan 4 dígitos");
            num = Integer.parseInt(sc.nextLine());
            num2 = Integer.parseInt(String.valueOf(Integer.toString(num).length()));

            //Introducimos numeros en el arraylist
            while(num2 == 4){
                array.add(i,num);
                i++;
                System.out.print("Introduce el siguiente dígito");
                num = Integer.parseInt(sc.nextLine());
                num2 = Integer.toString(num).length();

            }

            System.out.println("¿Desea introducir otro número? (S/N)");
            respuesta = sc.nextLine();

        }while(respuesta.equalsIgnoreCase("S"));

        //Imprimir lista desde el principio
        imprimir3(array,"principio");
        //Recorrer la lista desde el final
        imprimir3(array,"fin");


    }

    static void imprimir3 (ArrayList array, String lado){

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

}




