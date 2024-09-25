import java.util.*;
public class LinkedHashLi {
    public static void main(String[] args){
        LinkedHashSet<Integer> li=new LinkedHashSet<>();
        li.add(10);
        li.add(11);
        li.add(12);
        li.add(13);
        for(Integer x:li){
            System.out.println(x);
        }
    }
}