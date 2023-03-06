package slot9;

public class Slot9_2 implements Runnable {

    private String threadName;
    
    public Slot9_2(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }
    
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new Slot9_2("Thread 1"));
        Thread t2 = new Thread(new Slot9_2("Thread 2"));
        Thread t3 = new Thread(new Slot9_2("Thread 3"));
        
        t1.start();
        t2.start();
        t3.start();
    }
}
