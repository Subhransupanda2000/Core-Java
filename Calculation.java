package Inheritance;

    public class Calculation{
        int a,b,c;
        void Addition()
        {
            int a=2,b=3;
            c=a+b;
            System.out.println("Addition of two number is"+c);

        }
        void Substraction()
        {
            int a=8,b=6;
            c=a-b;
            System.out.println("Substraction of two number is"+c);
        }}
    class B extends Calculation
    {
        void Multiplication()
        {
            int a=2,b=2;
            c=a*b;
            System.out.println("Multiplication of two number"+c);
        }
        void Division()
        {
            int a=2,b=2;
            c=2/2;
            System.out.println("Division of two number"+c);

        }

    }
    class c extends B
    {
        void Remainder()
        {
            int a=2,b=2;
            c=a%b;
            System.out.println("Remainder of two number is"+c);
        }
    }
    class Test
    {
        public static void main (String [] args)
        {
            c obj=new c();
            obj.Addition();obj.Substraction();obj.Multiplication();obj.Division();obj.Remainder();
        }
    }



