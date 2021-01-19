package MultiThreadignExcercises;

public class Counter {
    //int count;
    volatile int count;

    /*public synchronized void increment() {
        count++;
    }*/
    public void increment() {
        count++;
    }
}


class SyncDemo {
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

        /*
        t1.start();
        t1.join();//main has to wait till t1 has finished

        t2.start();//t2 only starts after t1 is finished
        t2.join();// main has to wait till t2 finished count will be 2000
        */

        /*t1.start();
        t2.start();//t2 starts direclty after t1 has started now they interfere

        t1.join();//main has to wait till t1 has finished
       // System.out.println(counter.count);
        t2.join();// main has to wait till t2 finished count will be less than 2000
*/

        //work with synchronised
        t1.start();
        t2.start();
        t1.join();
        t2.join();//output always 2000 as the method is synchronized but with volatile
        // not always 2000 as it can be accessed at the same time by 2 different threads


        System.out.println(counter.count);
    }
}

