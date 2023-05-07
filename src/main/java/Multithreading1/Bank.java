package Multithreading1;

public class Bank extends Thread {
    int balance = 5000;
    int withdraw;

    Bank(int Withdraw) {
        this.withdraw = Withdraw;
    }

    public synchronized void Withdraw() {
        String name = currentThread().getName();
        if (withdraw <= balance) {
            System.out.println(name + "Withdraw money");
            balance = balance - withdraw;
        } else {
            System.out.println("insufficient balance");

        }
    }
    public void run()
    {
        Withdraw();
    }

}

class Customer {
    public static void main(String[] arg) {
        Bank obj = new Bank(5000);
        Bank obj2=new Bank(5000);
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj2);
        Thread t4 = new Thread(obj2);
        t1.setName("Akash");
        t2.setName("Raju");
        t3.setName("shyam");
        t4.setName("ram");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
