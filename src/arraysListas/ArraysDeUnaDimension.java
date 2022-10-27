package arraysListas;

public class ArraysDeUnaDimension {

    public static void main(String[] args) {

        String diasSemana [] = new String[7];

        diasSemana[0] = "Domingo";
        diasSemana[1] = "Lunes";
        diasSemana[2] = "Martes";
        diasSemana[3] = "Miercoles";
        diasSemana[4] = "Jueves";
        diasSemana[5] = "Viernes";
        diasSemana[6] = "Shabat";

        System.out.println("El mejor dia de la semana es: " + diasSemana[6]);

        int numeros [] = {4,3,2,76,9,-2};

        int minimo, maximo;

        minimo = maximo = numeros[0];

        for (int i = 0; i <= numeros.length - 1; i++){

            if(numeros[i] > maximo) maximo = numeros[i];
            if(numeros[i] < minimo) minimo = numeros[i];

        }

        System.out.println("el minimo es " + minimo + " el maximo es " + maximo);
    }
}
