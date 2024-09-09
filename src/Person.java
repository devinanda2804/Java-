/**
 * The {@code Person} class represents a person with a name and age.
 * It shows the use of encapsulation by keeping the fields private
 * and providing public methods to access and modify them.
 */
public class Person {
    // Private fields (encapsulation)
    private String name;
    private int age;

    /**
     * @param name the name of the person
     * @param age  the age of the person
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the new name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age of the person
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the new age of the person
     */
    public void setAge(int age) {
        if (age > 0) { // Simple validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println(person);
        person.setName("Bob");
        person.setAge(35);
        System.out.println(person);
    }
}
