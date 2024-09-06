class s{
    public static void main(String[] args){
        String s="Good Morning";
        System.out.println("The length of the string is:"+s.length());
        System.out.println("The character at 2nd position is:"+s.charAt(1));
        System.out.println("The substring from 5th position is:"+s.substring(4));
        System.out.println("The substring between 2 and 5 is:"+s.substring(2,6));
        String s1="Welcome";
        String s2="Back";
        System.out.println("Concatenated string:"+s1.concat(s2));
        System.out.println("Index of Morning:"+s.indexOf("Morning"));
        System.out.println("Index of 'o' starting from 5th index:"+s.indexOf("o",5));
        System.out.println("Last index of 'n':"+s.lastIndexOf("n"));
        Boolean out="Good".equals("good");
        System.out.println("Equality check:"+out);
        int out1=s1.compareTo(s2);
        System.out.println("Comparing 2 strings:"+out1);
        System.out.println("Uppercase of string:"+s.toUpperCase());
        System.out.println("Lowercase of string:"+s.toLowerCase());
        System.out.println("Replacing 'o' with 'a':"+s.replace("o","a"));

    }
}
