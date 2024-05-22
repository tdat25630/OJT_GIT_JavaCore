public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new EvenThread() );
        Thread thread2 = new Thread(new OddThread() );
        thread1.start();
        thread2.start();
    }
    static class EvenThread implements Runnable{

        @Override
        public void run() {
            for (int i = 2; i <= 50; i+=2) {
                System.out.println(i);
            }
        }
    }
    static class OddThread implements Runnable{

        @Override
        public void run() {
            for (int i = 1; i <= 50; i+=2) {
                System.out.println(i);
            }
        }
    }
//public static void main(String[] args) {
//    // Create the even number thread
//    Thread evenThread = new Thread(new EvenNumberPrinter());
//
//    // Create the odd number thread
//    Thread oddThread = new Thread(new OddNumberPrinter());
//
//    // Start both threads
//    evenThread.start();
//    oddThread.start();
//}
//
//    // Runnable implementation for printing even numbers
//    static class EvenNumberPrinter implements Runnable {
//        @Override
//        public void run() {
//            for (int i = 1; i <= 20; i++) {
//                if (i % 2 == 0) {
//                    System.out.println("Even: " + i);
//                }
//            }
//        }
//    }
//
//    // Runnable implementation for printing odd numbers
//    static class OddNumberPrinter implements Runnable {
//        @Override
//        public void run() {
//            for (int i = 1; i <= 20; i++) {
//                if (i % 2 != 0) {
//                    System.out.println("Odd: " + i);
//                }
//            }
//        }
//    }
}
