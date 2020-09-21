package bt;

public class NumberGenerator implements Runnable {
    private String name;
    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("The name is: "+ this.name +" Hash Code is "+ this.hashCode() + " "+ i);
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddThread extends Thread{
    private int num = 10;
    public OddThread(){}

    public void run() {
        for (int i = 1; i <= num; i++){
            if (i % 2 != 0) System.out.println("Odd Number: "+i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class EvenThread extends Thread{
    private int num = 10;
    public EvenThread(){}

    public void run() {
        for (int i = 1; i <= num; i++){
            if (i % 2 == 0) System.out.println("Even Number: "+i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Run{
    public static void main(String[] args) {
        NumberGenerator obj1= new NumberGenerator("One");
        NumberGenerator obj2= new NumberGenerator("Two");

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();


        System.out.println();

        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();
        odd.start();
        even.start();
    }
}
