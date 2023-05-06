package Threading;

public class A extends Thread {
    @Override
    public void run()
    {
       for (int i=0;i<=4;i++)
       {
           System.out.println("Akash");
       }
    }

}
class B
{
    public static void main(String [] args) {


        A t = new A();
        t.start();
        for (int i=0;i<=4;i++)
        {
            System.out.println("Abhinash");
        }
    }



}
