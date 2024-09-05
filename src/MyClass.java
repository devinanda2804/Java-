import java.util.*;
class MyClass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println("The string is:" + str);

        String str2=scn.nextLine();
        System.out.println("The string is:"+str2);

        int n=scn.nextInt();
        System.out.println("The integer is:"+n);
    }
}