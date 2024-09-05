import java.util.*;
class ScannerDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int num=sc.nextInt();
        char str=sc.next().charAt(0);
        System.out.println("Name="+name);
        System.out.println("Age="+num);
        System.out.println("Gender="+str);

    }

}