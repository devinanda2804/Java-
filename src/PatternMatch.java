//Program for regex

import java.io.*;
import java.util.regex.*;
class PatternMatch{
    public static void main(String[] args){
        System.out.println(Pattern.matches("Hel*o","Hello"));
        System.out.println(Pattern.matches("H*e*llo","Helloo"));
        System.out.println(Pattern.matches("[a-z]","d"));
        System.out.println(Pattern.matches("[a-zA-Z]+", "GoodMorning"));
        System.out.println(Pattern.matches("\\d+", "1234"));
        System.out.println(Pattern.matches("\\D+", "str"));
    }

}
