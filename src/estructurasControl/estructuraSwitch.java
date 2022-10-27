package estructurasControl;

import java.util.Scanner;

public class estructuraSwitch {

    public static void main(String[] args) {

    Scanner scaner = new Scanner(System.in);
    String dias;

        System.out.println("Introduzca un dia para la validacion de citas");

        dias = scaner.nextLine();

        switch (dias){
            case "lunes":
                System.out.println("Se atiende de 8am hasta las 3pm");
                break;
            case "martes":
                System.out.println("Se atiende de 8:30am hasta las 3:30pm");
                break;
            case "miercoles":
                System.out.println("Se atiende de 7am hasta las 5pm");
                break;
            case "jueves":
                System.out.println("Se atiende de 7:30am hasta las 4:30pm");
                break;
            case "vienes":
                System.out.println("Se atiende de 9am hasta las 4pm");
                break;
            case "sabado":
                System.out.println("No se trabaja en SHABAT");
                break;
            case "domingo":
                System.out.println("Se atiende de 1pm hasta las 2pm");
                break;
            default:
                System.out.println("los datos ingresados son incorrectos");

        }

    }

}
