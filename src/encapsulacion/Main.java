package encapsulacion;

public class Main {

    public static void main(String[] args) {

        Juego juego = new Juego(4);

        Juego.Contador contadorJuego = juego.new Contador();

        System.out.println("La puntuacion inicial es " + juego.obtenerPuntuacion());

        contadorJuego.incrementarPuntuacion(500);

        System.out.println("La puntuacion despues del incremento es " +juego.obtenerPuntuacion());
    }
}
