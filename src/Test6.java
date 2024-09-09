
//Program to show init block
class Test6
{
//    a block that must be executed first
    {
        System.out.println("init");
    }
    Test6()
    {
        System.out.println("new");
    }
    /*
    @param The first integer parameter
     */
    Test6(int x)
    {
        System.out.println(x);
    }
    //    a block that must be executed second
    {
        System.out.println("second init");
    }
    public static void main(String args[])
    {
        new Test6();
        new Test6(5);
    }
}
