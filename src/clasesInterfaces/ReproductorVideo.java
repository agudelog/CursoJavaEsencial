package clasesInterfaces;

public class ReproductorVideo implements Reproductor{
    @Override
    public void reproducir() {
        System.out.println("Reproducir Video");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar Video");
    }

    @Override
    public void parar() {
        System.out.println("parar Video");
    }

    @Override
    public void rebobinar(int segundos) {
        System.out.println("Rebobinar Video " + segundos + " segundos");
    }

    @Override
    public void adelantar(int segundos) {
        System.out.println("Adelantar Video " + segundos + " segundos");
    }
}
