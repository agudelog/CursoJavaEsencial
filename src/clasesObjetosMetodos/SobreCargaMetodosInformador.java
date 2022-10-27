package clasesObjetosMetodos;

public class SobreCargaMetodosInformador {

    public static final String COLOR_POR_DEFECTO = "\u001B[0m";
    public static final String COLOR_NEGRO = "\u001B[30m";
    public static final String COLOR_ROJO = "\u001B[31m";
    public static final String COLOR_VERDE = "\u001B[32m";
    public static final String COLOR_AMARILLO = "\u001B[33m";
    public static final String COLOR_AZUL = "\u001B[34m";


    void mostrarPorPantalla(int entero){

        System.out.println("Mostrando el entero " + entero);
    }

    void mostrarPorPantalla(double decimal){

        System.out.println("Mostrando el decimal " + decimal);
    }

    void mostrarPorPantalla(String palabra){

        System.out.println("Mostrando la palabra " + palabra);
    }

    void mostrarPorPantalla(String palabra, String color){

        System.out.println("Mostrando la palabra con color " + palabra + COLOR_POR_DEFECTO);
    }

    public static void main(String[] args) {

        SobreCargaMetodosInformador informador = new SobreCargaMetodosInformador();

        informador.mostrarPorPantalla(3);

        byte unByte = 2;

        informador.mostrarPorPantalla(unByte);

        informador.mostrarPorPantalla(3.5);

        informador.mostrarPorPantalla("Hola Ing", SobreCargaMetodosInformador.COLOR_AMARILLO);
        informador.mostrarPorPantalla("JAVA");


    }
}
