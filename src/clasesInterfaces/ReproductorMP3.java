package clasesInterfaces;

public class ReproductorMP3 implements Reproductor{


    @Override
    public void reproducir() {
        System.out.println("Reproducir audio");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar audio");
    }

    @Override
    public void parar() {
        System.out.println("Parar audio");
    }

    @Override
    public void rebobinar(int segundos) {
        System.out.println("Rebobinar audio " + segundos + " segundos");
    }

    @Override
    public void adelantar(int segundos) {
        System.out.println("Adelantar audio " + segundos + " segundos");
    }
}
