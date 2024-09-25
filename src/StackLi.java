import java.util.*;
public class StackLi{
    public static void main(String[] args){
        Stack<Integer> s=new Stack<Integer>();
        System.out.println(s.empty());
        s.push(10);
        s.push(71);
        s.push(72);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        int n=s.peek();
        System.out.println(n);
        System.out.println(s.empty());
        s.push(60);
        s.push(100);
        System.out.println(s);
        int p=s.search(32);
        System.out.println(p);
        Iterator<Integer> it=s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(Integer x:s){
            System.out.println(x);
        }
        ListIterator<Integer> li=s.listIterator(s.size());
        while((li.hasPrevious())){
            System.out.println(li.previous());
        }
    }
}