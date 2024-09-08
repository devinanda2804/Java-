import java.util.*;
import java.io.*;
class JA{
    /**
     * The main method initializes a jagged 2D array with different row columns for each row and
     * populates it with incrementing integers, and prints the values.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args){
        int jagged[][]=new int[2][];
        jagged[0]=new int[2];
        jagged[1]=new int[4];
        int count=0;
        for(int i=0;i<jagged.length;i++){
            for(int j=0;j<jagged[i].length;j++){
                jagged[i][j]=count;
                count++;
            }
        }
        /**
         * Printing the jagged array
         */
        for(int i=0;i<jagged.length;i++){
            for(int j=0;j<jagged[i].length;j++){
                System.out.print(jagged[i][j]+" ");
            }
            System.out.println();
        }
    }
}