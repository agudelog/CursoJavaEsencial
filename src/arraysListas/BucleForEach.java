package arraysListas;

public class BucleForEach {

    public static void main(String[] args) {

        int[] numeros = {4,8,45,13,-2,7,27,77};

        int minimo, maximo;
        minimo = maximo = numeros[0];

        for (int i = 0; i <= numeros.length -1; i++){

            System.out.println("El valor de i vale " + numeros[i]);

            if (numeros[i] > maximo) maximo = numeros[i];
            if (numeros[i] < minimo) minimo = numeros[i];
        }

        System.out.println("El numero minimo es: " + minimo + "\n" +
                "El numero maximo es: " + maximo);

        minimo = maximo = numeros[0];

        for (int entero:numeros) {

            System.out.println("entero vale: " + entero);

            if (entero > maximo) maximo = entero;
            if (entero < minimo) minimo = entero;
        }

        System.out.println("ForEach minimo es: " + minimo + "\n" +
                "ForEach maximo es: " + maximo);
    }
}
