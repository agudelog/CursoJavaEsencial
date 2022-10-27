package com.zehut.esencial.banco;

import java.math.BigDecimal;
import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {

        System.out.println("Ingrese los euros para convertir: ");

        Scanner scaner = new Scanner(System.in);

        double euros = scaner.nextDouble();

        String eurosString = Double.toString(euros);
        BigDecimal eurosBigDecimal = new BigDecimal(eurosString);

        double tasaCambio = 1.09;

        String tasaCambioString = Double.toString(tasaCambio);
        BigDecimal tasaCambioBigDecimal = new BigDecimal(tasaCambioString);

        BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(tasaCambioBigDecimal);

        System.out.println(euros + " Euros equivalen a :" + dolaresBigDecimal.toString() + " Dolares");


    }
}
