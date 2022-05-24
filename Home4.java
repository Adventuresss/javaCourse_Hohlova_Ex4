package homework4;

import java.util.Scanner;

public class Home4 {
    public static void main(String[] args) {
        int[][] array = new int[4][3];
        Scanner scanner = new Scanner(System.in);
        //идем по строкам-столбцам
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            // идем по элементам в массиве
            for (int j = 0; j < array[j].length; j++) {
                System.out.print("Введите число:");
                array[i][j] = scanner.nextInt();
                sum = sum + array[i][j];
            }
            System.out.printf("Line %d: %d\n", i + 1, sum);
        }
        for (int j = 0; j < array[j].length; j++) {
            int sum = 0;
            // идем по элементам в массиве
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i][j];
            }
            System.out.printf("Column %d: %d\n", j + 1, sum);
        }
        showArray(array);

        for (int i = 0; i < array.length; i++) {
            int middle = 0;
            // идем по элементам в массиве
            for (int j = 0; j < array[j].length; j++) {
                middle = middle + array[i][j];
            }
            middle=middle/array[i].length;
            System.out.printf("Line middle %d: %d\n", i + 1, middle);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[j].length; j++) {
                if (array[i][j] % 2 == 0){
                    array[i][j]=0;
                }else{
                    array[i][j]=1;
                }

            }
        }
        System.out.println();
        showArray(array);

       /* for (int i = 0; i < array.length; i++) {
            int middle = 0;
            // идем по элементам в массиве
            for (int j = 0; j < array[j].length; j++) {
                middle = middle + array[i][j];
            }
            middle=middle/array.length;
            System.out.printf("Line %d: %d\n", i + 1, middle);
        }*/


    }

    private static void showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            // идем по элементам в массиве
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
