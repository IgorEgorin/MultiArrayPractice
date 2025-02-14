package orgis;

import java.util.Random;

import static orgis.Run.*;

public class MatrixUtils {
    static void fillAndShowMatrix() {
        Random random = new Random();
        System.out.println("Initial matrix is:\n");

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                arrColorInit[i][j] = random.nextInt(256);
            }

        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", arrColorInit[i][j]);
            }
            System.out.println();
        }
    }

    static void showMatrix() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", rotatedMatrix[i][j]);
            }
            System.out.println();
        }
    }

    static void rotate90Angle(){
        //System.out.println(messageUser[0]);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedMatrix[j][SIZE - 1 - i] = arrColorInit[i][j];
            }
        }
    }

    static void rotate180Angle(){
        // System.out.println(messageUser[1]);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedMatrix[SIZE - 1 - i][SIZE - 1 - j] = arrColorInit[i][j];
            }
        }
    }

    static void rotate270Angle(){
        // System.out.println(messageUser[2]);


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedMatrix[SIZE - 1 - j][i] = arrColorInit[i][j];

            }
        }
    }
}
