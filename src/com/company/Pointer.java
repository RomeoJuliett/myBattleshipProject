package com.company;

/**
 * Created by Reco Jefferson on 4/2/17.
 */
public class Pointer {

    public static void goal(int[] pewPew, int[][] ship, int blast){
        int row=0,
                column=0;

        for(int line=0 ; line < ship.length ; line++){
            if(ship[line][0]==pewPew[0])
                row++;
            if(ship[line][1]==pewPew[1])
                column++;
        }

        System.out.printf("\nHint %d: \nRow %d -> %d ships\n" +
                "Column %d -> %d ships\n",blast,pewPew[0]+1,row,pewPew[1]+1,column);
    }
}
