import java.io.*;
class FileHandle1{
    public static void main(String[] args){
        if(args.length>0) {
            String s = args[0];
            File fname = new File(s);
            System.out.println("Name of file:" + fname.getName());
            System.out.println("Path of file:" + fname.getPath());
            System.out.println("Parent:" + fname.getParent());
            System.out.println("Absolute Path:" + fname.getAbsolutePath());
            System.out.println("File exists:" + fname.exists());
            if(fname.exists()){
                System.out.println("Is readable:"+fname.canRead());
                System.out.println("Is writeable:"+fname.canWrite());
            }

        }
        else{
            System.out.println("Not");
        }
    }
}