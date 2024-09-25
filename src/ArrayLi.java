import java.util.*;
public class ArrayLi {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(11);
        arr.add(19);
        arr.add(18);
        arr.add(14);
        System.out.println(arr);
        for(Integer i:arr){
            System.out.println(i);
        }
        arr.set(1,12);
        Iterator<Integer> it=arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        boolean n=arr.contains(12);
        System.out.println(n);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.isEmpty());
        System.out.println(arr.size());
        System.out.println(arr.get(2));
    }
}
