
//Program to demonstrate method overriding
class Parent {
    public void display() {
        System.out.println("This is parent class");
    }
}
/**
 * The Child class extends the Parent class and overrides the `display` method.
 */
class Child extends Parent{
    public void display(){
        System.out.println("This is child class");
    }
}
public class Test7{
    /*
            * @param args the command line arguments
     */
        public static void main(String[] args){
            Parent obj1=new Parent();
            obj1.display();
            Parent obj2=new Parent();
            obj2.display();
        }
    }


