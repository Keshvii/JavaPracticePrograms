/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thread_practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassImplementingRunnable {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed-size thread pool
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit tasks to the ExecutorService
        executor.submit(new Task("Task 1"));
        executor.submit(new Task("Task 2"));
        executor.submit(new Task("Task 3"));

        // Shutdown the ExecutorService
        executor.shutdown();
    }

    static class Task implements Runnable {
        private String name;

        Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" Executing " + name);
            // Task logic goes here
        }
    }
}





//
//
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
//
//public class ClassImplementingRunnable {
//    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//
//        t1.start(); // Start the first thread
//        t2.start(); // Start the second thread
//    }
//}
//
//// Define a class that implements the Runnable interface
//class MyRunnable implements Runnable {
//    public void run() {
//        // Code inside this method will be executed when the thread starts
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Thread using Runnable: " + i);
//            try {
//                Thread.sleep(1000); // Sleep for 1 second
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Create an instance of MyRunnable
//       // MyRunnable myRunnable = 
//        
//        // Create a Thread using the MyRunnable instance
//        Thread thread = new Thread(new MyRunnable(),"name");
//        
//        // Start the thread
//        thread.start();
//    }
//}
//
//


//
////sir example
//class mythread implements Runnable {
//    Thread t;
//    
//    mythread() {
//        t = new Thread(this, "First thread");
//        System.out.println("Current thread a: " + Thread.currentThread().getName());
//    }
//    
//    public void run() {
//        System.out.println("Thread is running!");
//        System.out.println("Current thread b : " + Thread.currentThread().getName());
//    }
//}
//
//public class ClassImplementingRunnable {
//    public static void main(String[] args) {
//        System.out.println("Current thread c: " + Thread.currentThread().getName());
//        mythread mt = new mythread();
//        System.out.println("Current thread d: " + Thread.currentThread().getName());
//        mt.t.start();
//        System.out.println("Current thread e: " + Thread.currentThread().getName());
//        System.out.println("Hello World!");
//    }
//}

