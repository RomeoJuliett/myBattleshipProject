package com.company;

import sun.security.ssl.Debug;

import static com.company.Fire.directHit;

/**
 * Created by Reco Jefferson on 4/1/17.
 */
public class Grid {

    public static void createGrid(int[][] grid) {

        for (int l = 0; l < grid.length; l++) {

            for (int w = 0; w < grid[0].length; w++) {

                grid[l][w] = -1;
            }
        }
    }


    public static void visibleGrid(int[][] grid) {
        // New tabs
        System.out.println("\t1 \t2 \t3 \t4 \t5");
        System.out.println();

        for (int l = 0; l < grid.length; l++) {

            for (int w = 0; w < grid[0].length; w++) {

                if (grid[l][w] == -1) {
                // ~ symbol for water
                    System.out.println("\t" + "~");
                // * direct hit
                } else if (grid[l][w] == 0) {
                    System.out.print("\t" + "*");
                // x you missed
                } else if (grid[l][w] == 1) {
                    System.out.print("\t"+"X");
                }
            }
            System.out.println();
        }
    }

    public static void changeGrid(int[] pewPew, int[][] ship, int[][] grid){
        if(directHit(pewPew,ship)) {
            grid[pewPew[0]][pewPew[1]] = 1;
        } else {
            grid[pewPew[0]][pewPew[1]] = 0;
        }
    }
}