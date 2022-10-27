package estructurasControl;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class bucleWhile {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        System.out.println("Introduzca el numero de la raiz cuadrada");

        double numero = scaner.nextInt();

        double candicatoRaizCuadrada = 0.0;

        while (candicatoRaizCuadrada * candicatoRaizCuadrada <= numero){

            candicatoRaizCuadrada += 0.01;

            System.out.println("Sera el numero " + candicatoRaizCuadrada + " ? " + " su cuadrado es " + candicatoRaizCuadrada * candicatoRaizCuadrada);


        }
            candicatoRaizCuadrada -= 0.01;
        System.out.println("La raiz cuadrada calculada es " + candicatoRaizCuadrada);
        System.out.println("La raiz cuadrada real es: " + Math.sqrt(numero));
    }


}
