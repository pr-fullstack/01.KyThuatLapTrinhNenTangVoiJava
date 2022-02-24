package basiclearning;

public class ThreadSimple extends Thread {
    static StringBuilder str = new StringBuilder();
//    static StringBuffer str = new StringBuffer();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            append(this.getName() + " is running");
        }
        System.out.println(this.getName() + " Kết quả: "+ str);
    }

    static synchronized void append(String target) {
        str.append(target);
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
