import java.util.*;
public class TreeLi{
    public static void main(String[] args){
        TreeSet<Integer> set=new TreeSet<>();
        set.add(12);
        set.add(13);
        set.add(14);
        Iterator<Integer> i=set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        Iterator<Integer> n=set.descendingIterator();
        while(n.hasNext()){
            System.out.println(n.next());
        }
        System.out.println(set.headSet(13,true));
        System.out.println(set.tailSet(
                13,false
        ));
    }
}