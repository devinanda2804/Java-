class Student{
    public int age;
    public String name;
    Student(int age,String name){
            this.age=age;
            this.name=name;
    }
}
class AR1 {
    public static void main(String[] args){
            Student[] arr=new Student[5];
            arr[0]=new Student(20,"Ram");
            arr[1]=new Student(20,"Raj");
            arr[2]=new Student(22,"Arjun");
            arr[3]=new Student(22,"Ajay");
            arr[4]=new Student(23,"Vijay");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i].age+arr[i].name);


            }
    }
}
