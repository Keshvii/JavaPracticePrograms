package practicenew.java;

//class MyThread extends Thread {
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + ": " + i);
//            try {
//                Thread.sleep(1000); // Sleep for 1 second
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//        }
//    }
//}

public class threadprac {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//
//        t1.start(); // Start first thread
//        t2.start(); // Start second thread

        Runnable r = new Runnable() {

            public void run()
            {
                System.out.println("Child Thread");
            }
        };
        Thread t = new Thread(r);
        // Starting the thread using start() method
        // which invokes run() method automatically
        t.start();
        System.out.println("Main Thread");

    }
}
