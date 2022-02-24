package basiclearning;

public class ThreadSimple extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + " is running");
        }
    }

    public static void main(String args[]) {
        System.out.println("Start the program");

        ThreadSimple t1 = new ThreadSimple();
        t1.start();

        ThreadSimple t2 = new ThreadSimple();
        t2.start();

        System.out.println("End the program");
    }
}
