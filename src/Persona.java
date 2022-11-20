public class Persona {// Para TreeSet necesito implements Comparable <Persona>
    private String nombre;
    private int edad;


    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public String toString() {
        return nombre + "" + edad;
    }

    public boolean equals(Object obj) {  //Al ser 2 argumentos el metodo hastset no es capaz de compararlos, entonces aquí vemos si son iguales o no y luego el método hashCode te los compara paara ver si son iguales (solo para HashSt y LinkedHashSet)
        //if(obj instanceof Persona) { esto
        Persona p = (Persona) obj; // CASTING
        if (edad == p.edad && nombre.equals(p.nombre))
            return true;

        else
            return false;

    }


    public int hashCode() {  // el metodo hashCODE LO QUE HACE ES CREAR EL STRING EN UN NÚMERO Y LO SUMA AL INT Y DE AHÍ COMPARA SI SON IGUALESD ALGUNO
        return nombre.hashCode() + edad * 1000;
        //return Objects.hash(nombre.edad); otra forma de retorno, es mas recomendable
    }

}
