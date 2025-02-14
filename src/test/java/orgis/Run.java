package orgis;

import java.util.Random;
import java.util.Scanner;

import static orgis.MatrixUtils.*;

public class Run {

    //static String[] messageUser = new String[] {"1. Rotate to 90\n","2. Rotate to 180\n","3. Rotate to 270\n"};


    static int SIZE = 8;
    static int[][] arrColorInit = new int[SIZE][SIZE];
    static int[][] rotatedMatrix = new int[SIZE][SIZE];

    public static void main(String[] args) {
        fillAndShowMatrix();
        System.out.println(""" 
                1. Rotate to 90
                2. Rotate to 180
                3. Rotate to 270
                """);



        while (true){
          //  runMessageForUser();
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("end")){
                break;
            }
            int inputToInt = Integer.parseInt(input);
            switch (inputToInt){
                case 1 ->  {

                    System.out.println("Rotate to 90");
                    rotate90Angle();
                }
                case 2 -> {
                    System.out.println("Rotate to 180");
                    rotate180Angle();
                }
                case 3 ->  {
                    System.out.println("Rotate to 270");
                    rotate270Angle();
                }
                default -> System.out.println("Invalid number");
            }
            showMatrix();

        }

    }
//    private static void runMessageForUser() {
//        System.out.println("\nEnter number to rotate matrix: \n"
//                + messageUser[0]
//                + messageUser[1]
//                + messageUser[2]
//        );
//    }



}