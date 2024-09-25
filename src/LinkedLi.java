import java.util.*;
public class LinkedLi {
    public static void main(String[] args){
        LinkedList<Integer> li=new LinkedList<Integer>();
        li.add(23);
        li.add(34);
        li.add(26);
        li.add(1,22);
        System.out.println(li);
        LinkedList<Integer> li1=new LinkedList<>();
        li1.add(45);
        li.addAll(1,li1);
        System.out.println(li);
        li.addFirst(11);
        System.out.println(li.get(0));
        Iterator<Integer> i= li.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        String[] arr={"Java","Python","C++"};
        System.out.println("Array:"+Arrays.toString(arr));
        List<String> list=new ArrayList<String>();
        for(String x:arr){
            list.add(x);
        }
        System.out.println("List"+list);
    }
}