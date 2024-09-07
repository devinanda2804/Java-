import java.util.*;
import java.io.*;
class MAR1{
    public static void main(String[] args){
        int[] arr={10,14,12,30,23};
        Arrays.sort(arr);
        System.out.println("Sorted array:"+Arrays.toString(arr));
        int key=12;
        System.out.println("The element 12 is at index:"+Arrays.binarySearch(arr,key));
        int[] arr1={3,5,6,4};
        int[] arr2={7,8,9,13};

    }
}