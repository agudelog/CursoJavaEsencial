package herenciaJava;

public class Nivel {

    public static void main(String[] args) {

        Personaje enemigo = new Personaje(10, 0);

        enemigo.emitirSonidoDolor();

        Protagonista protagonista = new Protagonista(0, 0, "Gio");

        protagonista.emitirSonidoDolor();

    }
}
