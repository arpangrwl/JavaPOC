package Rough.rough;

/**
 * Created by Arpan on 10/22/17.
 */
public class Rough1 {

    public static void main(String[] args) {

        int[] pr = {200, 500, 1000, 700, 30, 400, 900, 400, 50};
        int minma = Integer.MAX_VALUE, finalMin = 0, maxma = Integer.MIN_VALUE,  finalMax = 0, num = 0;

        for(int i=0 ; i < pr.length - 1; i++)
        {
            if(minma > pr[i])
                minma = pr[i];

            for(int j=i+1 ; j < pr.length ; j++)
            {
                if (pr[j] > maxma)
                {
                    maxma = pr[j];

                    if((maxma - minma) > num){
                        num = maxma - minma;
                        finalMin = minma;
                        finalMax = maxma;
                    }

                }

            }
            minma = Integer.MAX_VALUE;  maxma = Integer.MIN_VALUE;
        }

        System.out.println("final Min: -> " +finalMin);
        System.out.println("final Max: -> " +finalMax);
        System.out.println("final Difference: -> " +num);

    }
}
