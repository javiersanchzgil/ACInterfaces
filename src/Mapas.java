import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mapas {

    public static void main (String [] args) {

       // HashMap <Integer,String> hm = new HashMap <Integer,String> ();  //Si lo creas con Hashmap te lo odrdena por el codigo hash y si lo haces con un LinkedHashMap te lo imprime en el orden que hayas introducido
        LinkedHashMap <Integer,String> hm = new LinkedHashMap <Integer,String> ();//Tanto la clave y el valor puede ser de cualquier tipo
        hm.put(1,"Pepe");
        hm.put(3,"Juanito");
        hm.put(2,"Javier");

        imprimir(hm);
    }


    public static void imprimir (Map mapa) {
        if(mapa.isEmpty())
            System.out.println("Mapa vació");
        else {

            System.out.println(mapa.toString());//Muestras todo el contenido

            for(Object ob : mapa.values() ) {//Con este forEach muestras los valores por linea
                System.out.println(ob);
            }
        }
			/*	Iterator <String> it = mapa.values().iterator();
				while (it.hasNext())
					System.out.println(it.next());*/ //Tambien lo podemos imprimir creando un iterator con los valores del mapa
    }
}