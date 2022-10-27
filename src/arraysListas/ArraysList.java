package arraysListas;

import java.util.ArrayList;

public class ArraysList {

    public static void main(String[] args) {

        ArrayList<String> miListaCompra = new ArrayList<String>();

        miListaCompra.add("Java");
        miListaCompra.add("JavaScript");
        miListaCompra.add("Python");
        miListaCompra.add("HTML");

        System.out.println("Mi Curriculum tiene " + miListaCompra);

        ArrayList<String> miListaInicial = new ArrayList<>(miListaCompra);

        miListaInicial.add("NodeJS");

        System.out.println("Lista Compra " + miListaCompra + " mi lista inicial " +miListaInicial);

        System.out.println("El Tamaño de la lista es: " + miListaInicial.size());
        System.out.println("El primer elemento lista Compra: " + miListaCompra.get(0));
    }

}
