package estructurasControl;

public class bucleFor {

    public static void main(String[] args) {

        int suma = 0;

        for(int i = 1, j = 100; i<j; i++, j-- ){

            System.out.println("Iteracion No: " + i + " sumando " + i + " y " + j);

            suma += i + j;
        }

        System.out.println("El resultado de sumar los numeros del 1 al 100: " + suma);
    }
}
