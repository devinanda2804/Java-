import java.util.*;
import java.io.*;

/**
 * Program to show Final arrays
 */
class FA{
    /**
    * @param args Command-line arguments (not used in this program).*/

    public static void main(String[] args){
        final int arr[]={1,2,3,4};
        int arr1[]={5,6,7,8};

        arr1=arr;
        System.out.println(arr1);
        System.out.println(arr);
        arr[0]=9;
        System.out.println(Arrays.toString(arr));
    }

}