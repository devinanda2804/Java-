// Java Program to implement abstract keyword
abstract class gfg {
    abstract void printInfo();
}
/*
Class extends abstract class
 */
class employee extends gfg {
    void printInfo()
    {
        String name = "Madhu";
        int age = 20;
        int salary=10000;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

class base {
    public static void main(String args[])
    {
        gfg s = new employee();
        s.printInfo();
    }
}