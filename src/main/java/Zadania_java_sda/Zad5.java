    package Zadania_java_sda;

    public class Zad5 {
    //    Dla zadanej tablicy intów wyświetl najmniejszą oraz największą liczbę z tablicy
        public static void getMinAndMaxValue9(int[] numbers) {
            if (numbers.length > 0) {
                int min = numbers[0];
                int max = numbers[0];
                for (int number:numbers) {
                    if (number > max) {
                        max = number;
                    }
                    if (number < min) min = number;
                }
                System.out.println("min: " + min);
                System.out.println("max: " + max);
            }
                    }

        public static void main(String[] args) {
            int[] numbers = {5, -1, 0, 56};
            getMinAndMaxValue9(numbers);

        }
    }
