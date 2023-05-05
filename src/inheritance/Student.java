package inheritance;

public class Student {
    int roll,marks;
    String name;
    void input()
    {
        System.out.println("Enter roll name and marks: ");
    }
}
class ankit extends Student
{
   void disp()
   {
       roll=1;name="ankit";marks=89;
       System.out.println(roll+" "+name+" "+marks);
   }
   public static void main (String [] args)
   {
       ankit r=new ankit();
       r.input();
       r.disp();
   }
}

