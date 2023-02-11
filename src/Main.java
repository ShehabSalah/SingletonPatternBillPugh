public class Main {
    public static void main(String[] args) {
        // wait 3 seconds
        try {
            System.out.println("Application started: Waiting 3 seconds");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // get Singleton instance
        Singleton singleton = Singleton.getInstance();
        // create another singleton instance
        Singleton singleton2 = Singleton.getInstance();
        // and another
        Singleton singleton3 = Singleton.getInstance();
        // and one more
        Singleton singleton4 = Singleton.getInstance();
    }
}