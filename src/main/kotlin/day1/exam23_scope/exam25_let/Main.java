package day1.exam23_scope.exam25_let;

public class Main {
    public static void main(String[] args) {
        String name = null;

        if (name != null) {
            int length = name.length();
            System.out.println("Length: " + length);
        }
    }
}