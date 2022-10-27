package herenciaJava;

public class Protagonista extends Personaje{

    private String nombre;
    private static final int UNIDADES_SALTO = 10;

    Protagonista(int posicionX, int posicionY, String nombre){
        super(posicionX, posicionY);
        this.nombre = nombre;
    }

    public void recibirCura(int puntos){
        puntosDeVida += puntos;
    }

    public void saltar(){
        posicionY += UNIDADES_SALTO;
    }

    @Override
    public void emitirSonidoDolor() {
        //super.emitirSonidoDolor();
        System.out.println("UUUYYYYUUUYYY");
    }
}
