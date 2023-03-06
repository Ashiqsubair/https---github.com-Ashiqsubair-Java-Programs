package slot9;

public class Slot9_1 extends Thread {

    private String threadName;
    
    public Slot9_1(String name) {
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
        Slot9_1 t1 = new Slot9_1("Thread 1");
        Slot9_1 t2 = new Slot9_1("Thread 2");
        Slot9_1 t3 = new Slot9_1("Thread 3");
        
        t1.start();
        t2.start();
        t3.start();
    }
}
