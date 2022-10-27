package com.zehut.esencial.banco;

public class CuentaNomina extends CuentaBancaria{

    private static final double COMISION = 0.12;

    public CuentaNomina(String titular, TipoDeCuenta tipo, double saldo){
        super(titular, tipo, saldo);
    }

    public CuentaNomina(String titular, double saldo){
        super(titular, saldo);
    }

    public  CuentaNomina(){
        super();
    }

    @Override
    public void informarSobreCondicionesLegales() {
        System.out.println("Condiciones legales de la cuenta de ahorro ****");
        System.out.println("Segun el acuerdo firmado ****");
        System.out.println("La comision de retiro de dinero es de: " + COMISION + " Euros");
    }
}
