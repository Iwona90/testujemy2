package Zadania_java_sda;

public class Zad1 {

            public static void multiplicationTable(int number1) {
            int result = 0;
            for (int i = 1; i <= 4; i++) {
                result = number1 * i;
                System.out.println(result);
            }
        }
        public static void main(String[] args) {
            multiplicationTable(5);
        }
    }