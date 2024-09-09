import java.util.*;
import java.io.*;
import java.lang.*;
class Test12{
    public static void main(String[] args){

        /**
         * Inside the main method character operations like checking if a character is a letter, digit,
         * whitespace, uppercase, or lowercase, and also converting characters to string, uppercase, and lowercase.
         *
         * @param args command-line arguments (not used in this program)
         */

        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isDigit(9));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toString('B'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
