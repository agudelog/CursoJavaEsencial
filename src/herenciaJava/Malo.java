package herenciaJava;

import com.sun.org.apache.bcel.internal.generic.RET;

public class Malo extends Enemigo{

    private static final int PUNTOS_DE_DANO = 80;

    public Malo(int posicionX, int posicionY){
        super(posicionX,posicionY);
    }

    @Override
    public int obtenerPuntosDeDano() {
        return PUNTOS_DE_DANO;
    }
}
