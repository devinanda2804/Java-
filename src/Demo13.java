import java.lang.reflect.Constructor;
//Program to show  creation of object using Constructor.newInstance() method
class Person5 {
    private String name;
    private int age;

    /**
     *
     *
     * @param name the name of the person
     * @param age the age of the person
     */
    public Person5(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /**
     *
     *
     * @return the name of the person
     */
    public String getName() {
        return name;
    }
    /**
     *
     *
     * @return the age of the person
     */
    public int getAge() {
        return age;
    }
    /**
            * @return a string in the format "Person[name=name, age=age]"
            */
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}
public class Demo13 {
    /**
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        try {

            Class obj = Class.forName("Person5");
            Constructor constructor = obj.getConstructor(String.class, int.class);
            Person5 person = (Person5) constructor.newInstance("Dev", 25);
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
