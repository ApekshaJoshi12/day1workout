class Student{
    Student(){
        System.out.println("Apeksha");
    }
    Student(double a){
        System.out.println("Float value:"+a);
    }
    Student(int a,int b){
        System.out.println("Int value:"+a+","+b);
    }
}
public class Overloading{
    public static void main(String[] args) {
        Student S1=new Student();
        Student S2=new Student(14.34);
        Student S3=new Student(48,78);
    }
    }
