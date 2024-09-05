import java.util.*;
import java.io.*;
class DecDemo3{
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter a number between 1 and 4:");
        int num=sn.nextInt();
        switch(num){
            case 1:System.out.println("Number is 1");
            break;
            case 2:System.out.println("Number is 2");
                break;
            case 3:System.out.println("Number is 3");
                break;
            case 4:System.out.println("Number is 4");
                break;
            default:System.out.println("Invalid");
        }
    }

}