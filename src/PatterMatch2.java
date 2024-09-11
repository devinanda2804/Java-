//Program for printing the numbers from an input
import java.util.Scanner;
import java.util.regex.*;
class PatternMatch2{
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        String str=sn.nextLine();
        Pattern p=Pattern.compile("[0-9]+");
        Matcher m=p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
