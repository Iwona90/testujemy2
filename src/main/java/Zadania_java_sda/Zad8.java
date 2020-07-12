    package Zadania_java_sda;
    // Sprawdź, czy podany ciąg liczb jest ciągiem arytmetycznym
    public class Zad8 {
        public static boolean isAritmetic(int[] arrayAritmetic) {
            if (arrayAritmetic.length < 2) {
                return false;
            }
            boolean isCorrect = true;
            int gap = arrayAritmetic[1] - arrayAritmetic[0];
            for (int i = 2; i < arrayAritmetic.length; i++){
                int actualGap = arrayAritmetic[i] - arrayAritmetic[i-1];
                if (actualGap != gap) {
                    isCorrect = false;
                    break;
                }
            }

            return isCorrect;

        }

        public static void main(String[] args) {
            int[] arrayNotCorrect = {4, 52, 4, 7};
            int[] arrayCorrect = {1, 5, 13};
            Zad6.tablePrinter(arrayNotCorrect);
            boolean result = isAritmetic(arrayNotCorrect);
            System.out.println(result);
        }
    }