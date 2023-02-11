public class Singleton {

    private Singleton() {}

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();

        static {
            System.out.println("Creating new instance");
        }
    }

    public static Singleton getInstance() {
        System.out.println("Returning instance");
        return SingletonHelper.INSTANCE;
    }
}
