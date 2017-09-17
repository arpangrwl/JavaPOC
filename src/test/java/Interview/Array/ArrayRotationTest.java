package Interview.Array;

import org.junit.Assert;
import org.junit.Test;

//import static org.junit.Assert.assertEquals;

/**
 * Created by Arpan on 9/6/17.
 */
public class ArrayRotationTest {

    @Test
    public void testTesults(){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int sol[] = {3,4,5,6,7,8,9,1,2};
        int temp[] = new int[arr.length];

        ArrayRotation ar = new ArrayRotation();
        temp = ar.rotationByADigit(arr, 2);
        Assert.assertArrayEquals(temp, sol);

    }
}
