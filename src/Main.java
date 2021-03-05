import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    /*
            3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an.Требуется переставить элементы так,
            чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
            элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
            повторяется. Написать алгоритм сортировки выбором.
	     */

        int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maxIndex = 0, temp;
        for (int i = 0; i < a.length / 2; i ++) {
            for (int j = i; j < a.length - i; j ++) {
                if (a[maxIndex] <= a[j]) maxIndex = j;
            }
            temp = a[i];
            a[i] = a[maxIndex];
            a[maxIndex] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
