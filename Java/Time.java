class student{
    int id;
    String name;
    void display(){
        System.out.println(id+ "" +name);
    }
}
public class Time{
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student();
        s1.id=100;
        s2.id=101;
        s1.name="Apeksha";
        s2.name="Bhavana";
        s1.display();
        s2.display();
    }
}
