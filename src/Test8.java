// Java Program to demonstratee Method Overloading

import java.io.*;
class Product {
    /*
     * @param a the first integer to be multiplied
     * @param b the second integer to be multiplied
     * @return the product of the two integers
     */
    public int multiply(int a, int b)
    {
        int prod = a * b;
        return prod;
    }

    /*
     * @param a the first integer to be multiplied
     * @param b the second integer to be multiplied
     * @param c the third integer to be multiplied
     * @return the product of the three integers
     */
    public int multiply(int a, int b, int c)
    {
        int prod = a * b * c;
        return prod;
    }
}
class Test8 {
    public static void main(String[] args)
    {
        Product obj = new Product();
        int res1 = obj.multiply(1, 2);
        System.out.println("Product of the two integer value :" + res1);
        int res2 = obj.multiply(1, 2, 3);
        System.out.println("Product of the three integer value :" + res2);
    }
}
