import java.io.*;
import java.util.*;
class Test1{
    public static void main(String[] args){
        for(int i=0;i<5;i++){

            if(i==2)
                continue;
            if(i==4)
                break;
            System.out.print(" " +i);
        }
    }
}