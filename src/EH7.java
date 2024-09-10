/* Program illustrating user defined exception */

import java.io.*;
import java.util.*;
class MyException extends Exception{
    MyException(){}
    MyException(String text){
        super(text);
    }
    public static void main(String[] args){
        int age=14;
        try{
            if(age<18){
                MyException obj=new MyException("Age is less than 18");
                throw obj;
            }
        }
        catch(MyException e){
            e.printStackTrace();
        }

    }

}