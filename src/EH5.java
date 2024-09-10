//Program showing built in exceptions

import java.util.*;
import java.io.*;
class EH5{
    public static void main(String[] args){
        try{
            int arr[]=new int[5];
            arr[7]=10;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
    }
}
