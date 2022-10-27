package com.zehut.esencial.cajero;

import com.zehut.esencial.banco.CuentaAhorro;
import com.zehut.esencial.banco.CuentaBancaria;
import com.zehut.esencial.mock.GeneradorAleatorioMovimientos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {

    private CuentaBancaria cuentaBancariaActual;

    protected CajeroAutomatico(String identificador, String contrasena){

        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0, 50000);

        cuentaBancariaActual = new CuentaAhorro("Giovanny", cantidadAleatoria);
    }

    protected void mostrarSaldo(){
        System.out.println("Su saldo es " + cuentaBancariaActual.obtenerSaldo());
    }

    protected void ingresarDinero(){

        System.out.println("Cuanto dinero quiere ingresar?");
        Scanner scaner = new Scanner(System.in);
        double cantidad = scaner.nextDouble();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }

    protected void sacarDinero(){
        System.out.println("Cuanto dinero quiere sacar?");
        Scanner scaner = new Scanner(System.in);
        double cantidad = scaner.nextDouble();
        cuentaBancariaActual.sacarDinero(cantidad);
    }

    protected void consultarUltimosMovimientos(){

        GeneradorAleatorioMovimientos generadorAleatorioMovimientos = new GeneradorAleatorioMovimientos();
        System.out.println("Cuantos movimientos quiere consultar");

        Scanner scaner = new Scanner(System.in);
        int numeroMovimientos = scaner.nextInt();

        ArrayList<String> movimientos = generadorAleatorioMovimientos.obtenerMovimientos(numeroMovimientos,"Euros");
        mostrarMovimientos(movimientos);
    }

    private void mostrarMovimientos(ArrayList<String> movimientos){
        for (String movimiento: movimientos){
            System.out.println(movimiento);
        }
    }

    protected void mostrarCondicionesLegles(){
        cuentaBancariaActual.informarSobreCondicionesLegales();
    }

    protected void salir(){

        System.out.println("Muchas gracias por utilizar nuestros servicios");
    }
}
