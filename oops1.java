public class oops1
{
    public static void main(String[] args)
    {
        Student kunal = new Student(13,85.6f,"Kunal Kushwaha");
        Student rahul = new Student(14,90.0f,"Rahul");
        System.out.println(rahul.name);
        rahul.greetings();
    }
}
class Student
{
    int rno;
    float marks;
    String name;

    void greetings()
    {
        System.out.println("Hello My name is: " + name);
    }
    Student(int roll, float marks, String name)
    {
        this.rno = roll;
        this.marks = marks;
        this.name = name;
    }
}

