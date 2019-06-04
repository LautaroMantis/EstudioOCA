
public class Principal {

    // en args se reciben los argumentos pasados por consola al programa java
    public static void main(String ... args) {// tambien puede ser String [] args o String args[]

        // para este ejercicio nos limitamos a mostrarlos por consola
        System.out.println("Los argumentos pasados al programa son:");
        if (args.length == 0) {
            System.out.println(" <No se pasaron argumentos>");
        } else {
            for (String a : args) {
                System.out.println(a);
            }
        }

    }
}