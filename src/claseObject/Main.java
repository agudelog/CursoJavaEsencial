package claseObject;

public class Main {
    public static void main(String[] args) {

        Animal perro = new Animal("Golden", 4);

        Animal gato = new Animal("felino", 4);

        Animal mono = new Animal("mono", 2);

        System.out.println("es igual el perro al gato " + perro.equals(gato));

        System.out.println("HASHCODE de perro  " + perro.hashCode());
        System.out.println("HASHCODE de gato " + gato.hashCode());
        System.out.println("HASHCODE de mono " + mono.hashCode());

        System.out.println("ToString de perro " + perro.toString());


    }
}
