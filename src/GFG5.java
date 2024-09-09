interface people{
    void display();
}
class GFG5 implements people{
    @Override
    public void display() {
        System.out.println("Welcome all");

    }
    public static void main(String[] args){
        GFG5 obj=new GFG5();
        obj.display();

    }
}
