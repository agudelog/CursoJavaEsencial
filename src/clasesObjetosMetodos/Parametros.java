package clasesObjetosMetodos;

public class Parametros {

    double calcularAreaCircunferencia(double radio){

        return Math.PI * radio * radio;
    }

    double calcularVolumenPrismaRectangular(double altura, double anchura, double profundidad){

        return altura*anchura*profundidad;
    }

    double calcularMedia(double ... numeros){

        if(numeros.length == 0){

            return 0.0;
        }

        double suma = 0.0;

        for (int i = 0; i < numeros.length; i++){

            suma += numeros[i];
        }

        return suma / numeros.length;
    }

    public static void main(String[] args) {

        Parametros calculadora = new Parametros();

        double radio = 4.0;

        double area = calculadora.calcularAreaCircunferencia(radio);

        System.out.println("El AREA del circulo es " + area );

        System.out.println("-");

        System.out.println("el volumen de un prisma de 5*4*8 es igual: " + calculadora.calcularVolumenPrismaRectangular(5,4,8));

        System.out.println("-");

        double resultado = calculadora.calcularMedia(2.6, 2, 5.9, 8);
        System.out.println("La media es " + resultado);
    }
}


