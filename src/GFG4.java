public class GFG4{
    static String Student_name;
    static int Student_age;
    static void set(String name,int age){
        Student_name=name;
        Student_age=age;
    }
    static void get(){
        System.out.println("Student name is:"+Student_name);
        System.out.println("Student age is:"+Student_age);

    }

    public static void main(String[] args){
        GFG4.set("Ram",23);
        GFG4.get();
    }
}
