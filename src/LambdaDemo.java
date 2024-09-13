interface Addition9{
    abstract void add(int a ,int b);
}
class LambdaDemo{
    public static void main(String[] args){
        Addition9 obj1=(a,b)->System.out.println(a+b);
        obj1.add(5,10);
    }
}

