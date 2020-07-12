package Zadania_java_sda;

public class Zad3 {
    // Napisz funkcję, która dla zadanych dwóch parametrów X i Y obliczy sumę liczb od X do Y
    public static int sumOfArray(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++){
            sum += i;

        }
        return sum;
    }

    public static void main(String[] args) {
        int sumXY = sumOfArray(1,4);
        System.out.println(sumXY);

    }
}
