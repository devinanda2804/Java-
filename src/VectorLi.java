import  java.util.*;
public class VectorLi{
    public static void main(String[] args){
        Vector<String> v=new Vector<String>(5);
        v.add("Ravi");
        v.addElement("Madhu");
        System.out.println(v.size());
        System.out.println(v.capacity());
        v.addElement("Raj");
        v.addElement("Ragu");
        v.addElement("Ajay");
        System.out.println(v.size());
        System.out.println(v.capacity());
        v.add("Lakshmi");
        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println("Hashcode:"+v.hashCode());
        Enumeration en= v.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}