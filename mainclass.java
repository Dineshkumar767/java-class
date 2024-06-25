// Implementing "Runnable" interface

class threadclass implements Runnable {
    int x;
    String name;

    public threadclass(String n) {
        name = n;
    }

    public void run() {
        for (x = 0; x < 10; x++) {
            System.out.println(name);
        }
    }

}

public class mainclass {
    public static void main(String[] args) {
        threadclass tc1 = new threadclass("Hello....");
        threadclass tc2 = new threadclass("Hi...");

        Thread t1 = new Thread(tc1);
        Thread t2 = new Thread(tc2);

        t1.start();
        t2.start();
    }
}
