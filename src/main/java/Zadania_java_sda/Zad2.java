package Zadania_java_sda;

public class Zad2 {
    public static void main(String[] args) {
        System.out.println(prime(10));
    }
    public static boolean prime(int number) {
        boolean result = true;
        if (number > 1) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
