import java.util.*;
import java.io.*;
class GFG2{
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int r=sn.nextInt();
        System.out.println("Enter no of columns:");
        int c=sn.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter elements of the array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sn.nextInt();
            }
        }
        System.out.println("The array is:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
