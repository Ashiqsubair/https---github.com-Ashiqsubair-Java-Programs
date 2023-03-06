package slot9;
public class Slot9_3 {

    public static void main(String[] args) {
        Message msg = new Message();
        Thread t1 = new Thread(new Producer(msg));
        Thread t2 = new Thread(new Consumer(msg));
        t1.start();
        t2.start();
    }

}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

class Producer implements Runnable {

    private Message msg;

    public Producer(Message msg) {
        this.msg = msg;
    }

    public void run() {
        String messages[] = {"message 1", "message 2", "message 3", "message 4"};

        for (String message : messages) {
            msg.write(message);
            System.out.println("Produced " + message);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        msg.write("Done");
    }
}

class Consumer implements Runnable {

    private Message msg;

    public Consumer(Message msg) {
        this.msg = msg;
    }

    public void run() {
        while (true) {
            String message = msg.read();
            if (message.equals("Done")) {
                break;
            }
            System.out.println("Consumed " + message);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}