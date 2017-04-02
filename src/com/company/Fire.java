package com.company;

import java.util.Scanner;

/**
 * Created by Reco Jefferson on 4/1/17.
 */
public class Fire {

    public static void userFire(int[] shoot) {
        Scanner input = new Scanner(System.in);


        System.out.print("Select a row to fire in: ");
        shoot[0] = input.nextInt();
        shoot[0]--;

        //checking for valid row

//        while (shoot[0] > 5 || shoot[0] < 5) {
//            System.out.println("Enter a valid row (between 1 and 10)");
//        }



        System.out.print("Select a column to fire in: ");
        shoot[1] = input.nextInt();
        shoot[1]--;

        //checking for valid column


//        while (shoot[1] > 5 || shoot[1] < 5) {
//            System.out.println("Enter a valid column (between 1 and 10)");
//        }
    }




    public static boolean directHit(int[] fire, int[][] ships) {

        for (int vessel = 0; vessel < ships.length; vessel++) {
            if (fire[0] == ships[vessel][0] && fire[1] == ships[vessel][1]) {
                System.out.printf("Your missile hit a vessel located here (%d,%d)\n", fire[0] + 1, fire[1] + 1);
                return true;
            }
        }
        return false;
    }
}




