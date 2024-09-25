import  java.util.*;
public class TreeMaplLi{
    public static void main(String[] args){
        NavigableMap<Integer,String> map=new TreeMap<>();
        map.put(1,"Apple");
        map.put(2,"Mango");
        map.put(3,"Pineapple");
        System.out.println(map.tailMap(2,false));
    }
}