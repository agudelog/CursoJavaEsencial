package herenciaJava;

public class Personaje {

    protected int puntosDeVida = 100;
    protected int posicionX = 0;
    protected int posicionY = 0;

    public Personaje(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public void recibirDano(int puntos){
        puntosDeVida = puntos;
    }

    public void moverDerecha(int unidades){
        posicionX += unidades;
    }

    public void moverIzquierda(int unidades){
        posicionY += unidades;
    }

    public void emitirSonidoDolor(){
        System.out.println("Uyy");
    }

}
