package arraysListas;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Input_Output_Stream {

    public static void main(String[] args) {

        //Leer Archivo
        Path inputPath = Paths.get("D:\\zehut\\AlefTav\\ejemplo.txt");

        /*InputStream input;

        try {
            input = Files.newInputStream(inputPath, StandardOpenOption.READ);

            int i;

            while ((i = input.read()) != -1){
                System.out.print((char)i);
            }

            input.close();

        } catch (IOException e) {

            e.printStackTrace();
        }*/

        //Escribir Archivo
        Path outputPath = Paths.get("D:\\\\zehut\\\\AlefTav\\\\ejemplo2.txt");

        try{

            InputStream inputStream = Files.newInputStream(inputPath, StandardOpenOption.READ);

            Files.newOutputStream(outputPath, StandardOpenOption.CREATE);

            OutputStream outputStream = Files.newOutputStream(outputPath, StandardOpenOption.WRITE);

            int i;

            byte[] data = new byte[1024];

            while ((i = inputStream.read(data)) != -1){

                outputStream.write(data);
            }

            inputStream.close();
            outputStream.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
