package com.zehut.esencial.mock;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorAleatorioMovimientos {

    private static final String TRANSFERENCIA = "Transferencia de ";
    private static final String INGRESO = "ingreso de ";
    private static final String RETIRADA = "Retirada de ";
    private static final String PAGO_CON_TARJETA = "Pago con tarjeta de ";
    private static final String NOMINA = "Ingreso nomina de ";
    private static final String PAGO_RECIBO = "pago de recibo de ";

    public ArrayList<String> obtenerMovimientos(int numeroDeMovimientos, String moneda){

        ArrayList<String> movimientos = new ArrayList<>();

        for (int i = 0; i < numeroDeMovimientos; i++){

            int numeroDeMovimiento = obtenerIntAleatorio(1, 6);

            String tipoMovimiento;

            switch (numeroDeMovimiento){
                case 1:
                    tipoMovimiento = TRANSFERENCIA;
                    break;
                case 2:
                    tipoMovimiento = INGRESO;
                    break;
                case 3:
                    tipoMovimiento = RETIRADA;
                    break;
                case 4:
                    tipoMovimiento = PAGO_CON_TARJETA;
                    break;
                case 5:
                    tipoMovimiento = NOMINA;
                    break;
                default:
                    tipoMovimiento = PAGO_RECIBO;
            }

            double cantidadAleatoria = obtenerDoubleAleatorio(1.0, 3000.0);

            String movimiento = tipoMovimiento + String.format("%.2f", cantidadAleatoria) + " " + moneda;

            movimientos.add(movimiento);
        }

        return movimientos;
    }

    private int obtenerIntAleatorio(int minimo, int maximo){

        return ThreadLocalRandom.current().nextInt(minimo,maximo +1);
    }

    private double obtenerDoubleAleatorio(double minimo, double maximo){

        return ThreadLocalRandom.current().nextDouble(minimo, maximo + 1.0);
    }
}
