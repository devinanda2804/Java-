import java.util.*;
public class ArrayDeqli {
    public static void main(String[] args){
        ArrayDeque<String> arr=new ArrayDeque<>();
        arr.add("Apple");
        arr.add("Mango");
        arr.add("Pineapple");
        for(String s:arr){
            System.out.println(s);
        }
        arr.pollFirst();
        System.out.println(arr);
    }

}