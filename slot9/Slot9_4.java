package slot9;

class SharedResource {
    private int data;
    private boolean flag;

    public synchronized void setData(int data) {
        while (flag) {
            try {
                wait(); // Wait for other thread to consume the data
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        flag = true;
        notify(); // Notify other thread to consume the data
    }

    public synchronized int getData() {
        while (!flag) {
            try {
                wait(); // Wait for other thread to produce the data
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = false;
        notify(); // Notify other thread to produce the data
        return data;
    }
}

class Producer implements Runnable {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedResource.setData(i);
            System.out.println("Produced: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            int data = sharedResource.getData();
            System.out.println("Consumed: " + data);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Slot9_4 {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}
