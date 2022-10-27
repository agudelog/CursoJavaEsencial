package herenciaJava;

public class Orco extends Enemigo{

    public Orco(int posicionX, int posicionY){
        super(posicionX,posicionY);
    }

    @Override
    public void emitirSonidoDolor() {
        System.out.println("Que dolor!!");
    }
}
