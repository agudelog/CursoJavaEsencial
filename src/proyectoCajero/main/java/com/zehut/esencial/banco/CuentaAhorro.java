package com.zehut.esencial.banco;

public class CuentaAhorro extends CuentaBancaria{

    private static final double COMISION = 0.12;

    public CuentaAhorro(String titular, TipoDeCuenta tipo, double saldo){
        super(titular, tipo, saldo);
    }

    public CuentaAhorro(String titular, double saldo){
        super(titular, saldo);
    }

    public  CuentaAhorro(){
        super();
    }

    @Override
    public void sacarDinero(double cantidad){
        if(cantidad < 0){
            return;
        }
        saldo -= cantidad;
        saldo -= COMISION;
    }


    @Override
    public void informarSobreCondicionesLegales() {
        System.out.println("Condiciones legales de la cuenta de ahorro ****");
        System.out.println("Segun el acuerdo firmado ****");
        System.out.println("La comision de retiro de dinero es de: " + COMISION + " Euros");
    }
}

