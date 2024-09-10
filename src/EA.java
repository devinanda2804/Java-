//Program with get() and set() methods demonstrating encapsulation for private

class Person1{
    private String name;
    private int age;
    /*
            * @param name the name of the person
     */
    public void set(String name){
        this.name=name;
    }
    /*
     * @param age the age of the person
     */
    public void setAge(int age){
        this.age=age;
    }
    /* @return the name of the person
     */
    public String get(){
        return name;
    }
    /* @return the age of the person
     */
    public int getAge(){
        return age;
    }

}
class EA{
    /*
            * @param args command-line arguments (not used)
     */
    public static void main(String[] args){
        Person1 obj=new Person1();
        obj.set("Dev");
        obj.setAge(20);
        System.out.println("Name:"+obj.get());
        System.out.println("Age:"+obj.getAge());
    }
}