public class Constructer02 {
    int x, y;

    Constructer02(int a, int b) {

        x = a;
        y = b;

    }

    Constructer02(Constructer02 ref) {
        System.out.println("done");

    }

    void display() {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        Constructer02 c = new Constructer02(23, 32);
        c.display();
        Constructer02 d = new Constructer02(c);


    }
}
