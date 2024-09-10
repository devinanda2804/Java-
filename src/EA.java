class Person1{
    private String name;
    private int age;
    public void set(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String get(){
        return name;
    }
    public int getAge(){
        return age;
    }

}
class EA{
    public static void main(String[] args){
        Person1 obj=new Person1();
        obj.set("Dev");
        obj.setAge(20);
        System.out.println("Name:"+obj.get());
        System.out.println("Age:"+obj.getAge());
    }
}