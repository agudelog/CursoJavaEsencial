package estructurasControl;

import java.util.Scanner;

public class bucleDoWhile {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        double numero;

        do{

            System.out.println("Ingrese un numero para ver la raiz cuadrada\n" +
                    "para salir introduzca el Numero 0");

            numero = scaner.nextDouble();

            if(numero == 0){
                System.out.println("Hasta la vista");
            }else{
                System.out.println("La raiz cuadrada de " + numero + " es " + Math.sqrt(numero));
            }
        }while (numero != 0);
    }
}
