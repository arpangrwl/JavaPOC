package Rough.rough;

import java.util.Random;

/**
 * Created by Arpan on 6/18/17.
 */
public class totalRough {

    public static void main(String[] args) {


        Random rand = new Random();
        for(int i =0 ; i < 10 ; i++)
        {
            System.out.println(rand.nextInt(100));
        }
    }
}
