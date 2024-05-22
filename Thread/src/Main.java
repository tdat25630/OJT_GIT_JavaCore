public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new HelloThread());
        thread.start();

    }
    public static class HelloThread implements Runnable{
        @Override
        public void run() {
            System.out.println("Hello world!");
        }
    }
}