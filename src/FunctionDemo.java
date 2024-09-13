//Program showing Function Functional Interface
import java.util.*;
import java.util.function.Function;

import java.io.*;
class FunctionImpl implements Function<String ,Integer>{
    public Integer apply(String s){
        return s.length();
    }
}
class FunctionDemo{
    public static void main(String[] args){
        Function<String,Integer> f1=(String s)->s.length();
        System.out.println(f1.apply("Manu"));
    }
}