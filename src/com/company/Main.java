package com.company;

import static com.company.Fire.directHit;
import static com.company.Fire.userFire;
import static com.company.Grid.changeGrid;
import static com.company.Grid.createGrid;
import static com.company.Grid.visibleGrid;
import static com.company.Pointer.goal;
import static com.company.Ships.createShip;

public class Main {

    public static void main(String[] args) {

        {
            int[][] grid = new int[5][5];
            createGrid(grid);
            int[][] ship = new int[2][2];
            createShip(ship);
            int[] pewPew = new int[2];

            int blasts = 0,
                    aHit = 0;

            System.out.println();

            do {

                visibleGrid(grid);
                userFire(pewPew);
                blasts++;

                if (directHit(pewPew, ship)) {
                    goal(pewPew, ship, blasts);
                    aHit++;
                } else /*(directHit(pewPew, ship))*/ {
                    goal(pewPew, ship, blasts);
                    changeGrid(pewPew, ship, grid);
                }
            }
                while (aHit != 3);{

                    System.out.println("\n\n\nBattleship Java game finished! You hit 3 ships in " + pewPew + " attempts");
                    visibleGrid(grid);
                }
            }

        }
    }


