//Program showing Consumer Functional Interface

import java.util.*;
import java.util.function.Consumer;

import java.io.*;
class FuncConsumer implements Consumer<String>{
    public void accept(String s){
        System.out.println(s);
    }
}
class FunctionDemo2 {
    public static void main(String[] args){
//        Consumer<String> s=new FuncConsumer();
//        s.accept("Hello");
        Consumer<String> str= (String s) -> System.out.println(s);
        str.accept("hello");
    }
}