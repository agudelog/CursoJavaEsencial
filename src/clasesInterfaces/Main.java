package clasesInterfaces;

public class Main {

    public static void main(String[] args) {

        ReproductorVideo reproductorVideo = new ReproductorVideo();

        reproductorVideo.reproducir();
        reproductorVideo.rebobinar(3);

        ReproductorMP3 reproductorMP3 = new ReproductorMP3();

        reproductorMP3.reproducir();
        reproductorMP3.parar();
    }
}
