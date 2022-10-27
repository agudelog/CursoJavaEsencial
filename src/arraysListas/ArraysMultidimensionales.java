package arraysListas;

public class ArraysMultidimensionales {

    public static void main(String[] args) {

        int myArrayDeUnaDimension[] = new int [20];

        int myArrayDeDosDimensiones[][] = new int [10][20];

        int myArrayDeTresDimensiones[][][] = new int [5][15][8];

        int tablaDeMultiplicacion[][] = new int[10][10];

        for (int i=0; i<10; i++){

            for (int j=0; j<10; j++){

                tablaDeMultiplicacion[i][j] = i * j;
            }
        }

        System.out.println("El resultado de multiplicar 4x5 esta en la posicion [4][5]= " + tablaDeMultiplicacion[4][5]);
    }
}
