package ru.skypro;

public class Main {

    public static void main(String[] args) {

        int[] array1 = new int[3];
        for (int i = 0; i < 3; i++) {
            array1[i] = i + 1;
            if (i < 2) {
                System.out.print(array1[i] + ",");
            } else
                System.out.print(array1[i]);
        }
        System.out.println();
        double[] array2 = {1.57, 7.654, 9.986};
        for (int k = 0; k < 3; k++) {
            if (k < 2) {
                System.out.print(array2[k] + ",");
            } else
                System.out.print(array2[k]);
        }
        System.out.println();
        int[] array3 = {5, 6, 8, 1, 5, 3, 2, 4};
        for (int l = 0; l < array3.length; l++) {
            if (l < array3.length - 1) {
                System.out.print(array3[l] + ",");
            } else
                System.out.print(array3[l]);


        }
        System.out.println("\n");
        for (int i = 2; i >= 0; i--) {
            if (i > 0) {
                System.out.print(array1[i] + ",");
            } else
                System.out.print(array1[i]);
        }
        System.out.println();
        for (int k = 2; k >= 0; k--) {
            if (k > 0) {
                System.out.print(array2[k] + ",");
            } else
                System.out.print(array2[k]);
        }
        System.out.println();
        for (int l = array3.length-1; l >= 0; l--) {
            if (l > 0) {
                System.out.print(array3[l] + ",");
            } else
                System.out.print(array3[l]);
        }
        System.out.println("\n");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i]+=1; //Почему здесь нельзя использовать инкремент ++?
            }
            if (i< array1.length-1) {
                System.out.print(array1[i] + ",");
            }else
                System.out.print(array1[i]);
        }
    }
}



