package claseObject;

public class Animal {

    private String especie;
    private int numeroPatas;

    public Animal(String especie, int numeroPatas){
        this.especie = especie;
        this.numeroPatas = numeroPatas;

    }

    public String obtenerEspecie(){
        return especie;
    }

    public int obtenerNumeroPatas(){
        return numeroPatas;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", numeroPatas=" + numeroPatas +
                '}';
    }
}
