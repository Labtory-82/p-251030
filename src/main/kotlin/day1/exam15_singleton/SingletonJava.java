package day1.exam15_singleton;

public class SingletonJava {
    private static final SingletonJava INSTANCE = new SingletonJava();

    private SingletonJava() {}

    public static SingletonJava getInstance() {
        return INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        SingletonJava.getInstance().showMessage();
    }
}