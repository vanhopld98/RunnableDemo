public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running ...");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR_Database");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-1-Send_Email");
        runnableDemo2.start();
    }
}