package exceptionHandlers;

public class LastChanceHandler implements Thread.UncaughtExceptionHandler {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new LastChanceHandler());
        TestedThread testedThread = new TestedThread(new LastChanceHandler());
        //first thread has been given the name Liliane
        Thread firstThread = new Thread(testedThread, "Liliane");
        //second thread doesn't have a specific name and just is called Thread-2
        Thread secondThread = new Thread(new TestedThread(new LastChanceHandler()));

        //set the threads to the lastChanceHandler
        firstThread.setUncaughtExceptionHandler(new LastChanceHandler());
        secondThread.setUncaughtExceptionHandler(new LastChanceHandler());
        firstThread.start();
        secondThread.start();

        firstThread.interrupt();
        secondThread.interrupt();

    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        //do something here - log to file and upload to server/close resources/ delete files...
        System.out.println(t.getName() + " " + e.getMessage());
    }

    public static class TestedThread extends Thread {
        public TestedThread(Thread.UncaughtExceptionHandler handler) {
            start();
        }

        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException("I'll handle it my way");
            }
        }
    }
}
