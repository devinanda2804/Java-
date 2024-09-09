
import java.io.*;

/*
Program to show inheritance
 */
class Employee {
    int salary = 6000;
}

/*Inherited  Class*/
class Engineer extends Employee {
    int benefits = 1000;
}


class Gfg {
    public static void main(String args[])
    {
        Engineer E1 = new Engineer();
        System.out.println("Salary : " + E1.salary
                + "\nBenefits : " + E1.benefits);
    }
}