package dem;

public class abh implements Runnable {
    public void run() {
        System.out.println("hello");
    }
}

class joinn {
    public static void main(String[] args) {
        abh sc = new abh();
        Thread t = new Thread(sc); // Associate the Thread with the abh instance
        t.start();
        System.out.println("main thread");
    }
}
