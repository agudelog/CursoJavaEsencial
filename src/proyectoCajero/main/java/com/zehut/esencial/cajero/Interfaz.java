package com.zehut.esencial.cajero;

import java.util.Scanner;

public class Interfaz {

    public static void main(String[] args) {

        System.out.println("Introduzca su numero de identificacion");
        Scanner scaner = new Scanner(System.in);
        String identificador = scaner.nextLine();

        System.out.println("Introduzca su contraseña");
        String pass = scaner.nextLine();

        CajeroAutomatico cajero = new CajeroAutomatico(identificador, pass);

        int opcionSeleccionada;

        do {

            System.out.println("Elija una de las siguientes opciones \n" +
                    "Escriba 1 para consultar su saldo\n" +
                    "Escriba 2 para ingresar Dinero\n" +
                    "Escriba 3 para para sacar Dinero\n" +
                    "Escriba 4 para consultar sus ultimos movimientos\n" +
                    "Escriba 5 para consultar condiciones legales\n" +
                    "Oprima a para salir");

            opcionSeleccionada = scaner.nextInt();

            switch (opcionSeleccionada){
                case 1:
                    cajero.mostrarSaldo();
                    break;
                case 2:
                    cajero.ingresarDinero();
                    break;
                case 3:
                    cajero.sacarDinero();
                    break;
                case 4:
                    cajero.consultarUltimosMovimientos();
                    break;
                case 5:
                    cajero.mostrarCondicionesLegles();
                    break;
                default:
                    cajero.salir();

            }

        }while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada == 4 || opcionSeleccionada == 5);
    }
}
