package com.company;

import static com.company.Fire.userFire;
import static com.company.Grid.createGrid;
import static com.company.Grid.visibleGrid;
import static com.company.Ships.createShip;

public class Main {

    public static void main(String[] args) {

        {
            int[][] grid = new int[10][10];
            createGrid(grid);
            int[][] ship = new int[5][5];
            createShip(ship);
            int[] fire = new int[2];

            int missiles = 20;
            int directHit = 0;
            while (missiles > 0 && directHit < 4) {
                visibleGrid(grid);
                directHit = userFire();
                missiles--;
            }
            execute(directHit, missiles);
        }
    }

        public static void execute(int connects, int missiles)
        {
            if(connects < 4)
                System.out.println("You didn't sink any battleships.");
            if(missiles < 1)
                System.out.println("You're out of missiles.");
            else
            if(connects >= 4)
            {
                System.out.println("You won!");
            }
            System.out.println("Congratulations!!!");
        }

    }

