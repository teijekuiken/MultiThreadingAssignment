
public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here

        MainCounter HoofdTeller = new HoofdTeller();

        Runnable r1 = new MyRunnable(HoofdTeller);
        Runnable r2 = new MyRunnable(HoofdTeller);
        Runnable r3 = new MyRunnable(HoofdTeller);
        Runnable r4 = new MyRunnable(HoofdTeller);
        Runnable r5 = new MyRunnable(HoofdTeller);

        Thread t1 = new Thread(r1);
        t1.setName("Thread 1");
        Thread t2 = new Thread(r2);
        t2.setName("Thread 2");
        Thread t3 = new Thread(r3);
        t3.setName("Thread 3");
        Thread t4 = new Thread(r4);
        t4.setName("Thread 4");
        Thread t5 = new Thread(r5);
        t5.setName("Thread 5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();


        System.out.println("De totale som van alles threads is: " + HoofdTeller.getTotal());



    }
}
