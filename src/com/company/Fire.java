package com.company;

import java.util.Scanner;

/**
 * Created by Reco Jefferson on 4/1/17.
 */
public class Fire {

    public static int userFire() {
        Scanner input = new Scanner(System.in);

        int row, col;
        System.out.println("Select a row to fire in: ");
        row = input.nextInt();

        // Check for valid row
        while (row > 10 || row < 1) {
            System.out.println("Enter a valid row (between 1 and 10)");
            row = input.nextInt();
        }
        System.out.println("Select a column to fire in: ");
        col = input.nextInt();

        //Check for valid column
        while (col > 10 || col < 1) {
            System.out.println("Enter a valid column (between 1 and 10)");
            col = input.nextInt();
        }
        return userFire();
    }


        public static boolean directHit(int[] fire, int[][] ships){

        for(int battleShip=0 ; battleShip<ships.length ; battleShip++){
            if( fire[0]==ships[battleShip][0] && fire[1]==ships[battleShip][1]){
                System.out.printf("Your missile hit a ship located here (%d,%d)\n",fire[0]+1,fire[1]+1);
                return true;
            }
        }
        return false;
    }
    }



