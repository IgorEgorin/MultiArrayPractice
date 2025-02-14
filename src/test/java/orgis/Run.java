package orgis;

import java.util.Random;
import java.util.Scanner;

public class Run {

    static String[] messageUser = new String[] {"1. Rotate to 90\n","2. Rotate to 180\n","3. Rotate to 270\n"};


    static int SIZE = 8;
    static int[][] arrColorInit = new int[SIZE][SIZE];
    static int[][] rotatedMatrix = new int[SIZE][SIZE];

    public static void main(String[] args) {
        fillAndShowMatrix();

        while (true){
            runMessageForUser();
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("end")){
                break;
            }
            int inputToInt = Integer.parseInt(input);
            switch (inputToInt){
                case 1 -> rotate90Angle();
                case 2 -> rotate180Angle();
                case 3 -> rotate270Angle();
                default -> System.out.println("Invalid number");
            }
            showMatrix();

        }

    }
    private static void runMessageForUser() {
        System.out.println("\nEnter number to rotate matrix: \n"
                + messageUser[0]
                + messageUser[1]
                + messageUser[2]
        );
    }

    private static void fillAndShowMatrix() {
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

    private static void showMatrix() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", rotatedMatrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void rotate90Angle(){
        System.out.println(messageUser[0]);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedMatrix[j][SIZE - 1 - i] = arrColorInit[i][j];
            }
        }
    }

    private static void rotate180Angle(){
        System.out.println(messageUser[1]);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedMatrix[SIZE - 1 - i][SIZE - 1 - j] = arrColorInit[i][j];
            }
        }
    }

    private static void rotate270Angle(){
        System.out.println(messageUser[2]);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedMatrix[SIZE - 1 - j][i] = arrColorInit[i][j];

            }
        }
    }

}