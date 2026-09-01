class MyFirstThread extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }
}

public class CreateThread {

    public static void main(String[] args) {

        MyFirstThread t = new MyFirstThread();

        t.start();
    }
}
