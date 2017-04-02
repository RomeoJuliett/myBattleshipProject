package com.company;

import java.awt.*;
import java.util.Random;

/**
 * Created by Reco Jefferson on 4/1/17.
 */
public class Ships {

    public static void createShip(int[][] battleShips)
    {
        Random random = new Random();

        for(int ship=0 ; ship < 3 ; ship++){
            battleShips[ship][0]=random.nextInt(5);
            battleShips[ship][1]=random.nextInt(5);

            for(int last=0 ; last < ship ; last++){
                if( (battleShips[ship][0] == battleShips[last][0])&&(battleShips[ship][1] == battleShips[last][1]) )
                    do{
                        battleShips[ship][0]=random.nextInt(5);
                        battleShips[ship][1]=random.nextInt(5);
                    }while( (battleShips[ship][0] == battleShips[last][0])&&(battleShips[ship][1] == battleShips[last][1]) );
            }

        }
    }
}
