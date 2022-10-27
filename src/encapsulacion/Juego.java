package encapsulacion;

public class Juego {

    private int numeroDeJuegadores;
    private int puntuacion = 0;

    public Juego(int numeroDeJuegadores){
        this.numeroDeJuegadores = numeroDeJuegadores;
    }

    public int obtenerPuntuacion(){
        return puntuacion;
    }

    public class Contador{
        public void incrementarPuntuacion(int puntos){
            puntuacion += puntos;

        }
        public void decrementarPuntuacion(int puntos){
            puntuacion -= puntos;
        }
    }
}
