package clasesObjetosMetodos;

public class variablesdeReferencia {

    public static void main(String[] args) {

        int variable1 = 23;
        int variable2 = variable1;

        System.out.println("El valor variable1 " + variable1);
        System.out.println("El valor variable2 " + variable2);

        System.out.println("-");

        variable2 = 78;

        System.out.println("-");

        System.out.println("El valor variable1 " + variable1);
        System.out.println("El valor variable2 " + variable2);

        System.out.println("VARIABLES REFERENCIADAS");

        /*proyectoCajero.CuentaBancaria cuentaJuan = new proyectoCajero.CuentaBancaria();

        cuentaJuan.saldo = 23_570;

        proyectoCajero.CuentaBancaria cuentaAna = cuentaJuan;
        cuentaAna.saldo = 10_000;

        System.out.println("El saldo de Juan es " + cuentaJuan.saldo);
        System.out.println("El saldo de Ana es " + cuentaAna.saldo);*/
    }
}
