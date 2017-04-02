package com.company;

/**
 * Created by Reco Jefferson on 4/1/17.
 */
public class Ships {

    public static void createShip(int[][] ship,int size)
    {
        if(Math.random() < 0.5)
        {
            int col = (int)(Math.random()*6);
            int row = (int)(Math.random()*8);
            for(int i = 0; i<size; i++)
            {
                ship[row][col+i] = 1;
            }
        }
        else
        {
            int col = (int)(Math.random()*8);
            int row = (int)(Math.random()*6);
            for(int i = 0; i<size; i++)
            {
                ship[row+i][col] = 2;
            }
        }
    }
}
