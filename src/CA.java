//This program used to create objects and constructors

class CA{
    public String name;
    public String age;

    /**
     * Constructor to initialize the CA object with a name and age.
     *
     * @param name The name of the person
     * @param age The age of the person
     */
    public CA(String name,String age){
        this.name=name;
        this.age=age;
    }
    /** @param args Command-line arguments
     */
    public static void main(String[] args){
        CA obj=new CA("Arun","30");
        System.out.println("Hi I'm "+obj.name+" and my age is "+obj.age);
    }
}
