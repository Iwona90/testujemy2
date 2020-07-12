package Zadania_java_sda;
//Napisz funkcję tworzącą ciąg arytmetyczny o podanych: długości, pierwszym elemencie,
//        różnicy ciągu
public class Zad7 {
    public static int[] arrayAritmeticSeries(int lenght, int firstNumber, int gap){
        int[] array = new int[lenght];
        array[0] = firstNumber;
        for (int i = 1; i < lenght; i++){
            array[i] = array[i-1] + gap;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] result = arrayAritmeticSeries(4,1,2);
        Zad6.tablePrinter(result);
    }

}
