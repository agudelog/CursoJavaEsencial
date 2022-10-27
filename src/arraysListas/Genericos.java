package arraysListas;

public class Genericos<T> {

    T elemento;

    Genericos(T elemento){
        this.elemento = elemento;
    }

    T obtenerObjeto(){
        return elemento;
    }

    <V> boolean esIgualMismaClase(V otroObjeto){
        return elemento.getClass() == otroObjeto.getClass();
    }

    public static void main(String[] args) {

        Genericos<String> caja1 = new Genericos<>("Java");

        Integer numero = 5;

        Genericos<Integer> caja2 = new Genericos<>(numero);

        String miObjeto = "Ingeniero";

        System.out.println("la caja1 tiene objetos de la misma clase? " + caja1.esIgualMismaClase(miObjeto));
        System.out.println("la caja2 tiene objetos de la misma clase? " + caja2.esIgualMismaClase(miObjeto));
    }

}
