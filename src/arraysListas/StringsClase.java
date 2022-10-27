package arraysListas;

public class StringsClase {

    public static void main(String[] args) {

        /*String unString = new String("Soy un String");

        String otroString = new String(unString);

        String tercerString = "con cadena de caracteres";*/

        String miString = "javaDeveloper";

        char character;

        character = miString.charAt(4);

        System.out.println("El caracter en la posicion elegida es " + character);

        String resultadoConcat = miString.concat("ing");

        System.out.println("El resultado es " + resultadoConcat);
    }
}
