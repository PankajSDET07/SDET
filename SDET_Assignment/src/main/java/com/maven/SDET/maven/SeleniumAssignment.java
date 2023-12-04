package com.maven.SDET.maven;

import java.util.Arrays;
import java.util.Scanner;

public class SeleniumAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of entries (N): ");
        int n = scanner.nextInt();

        System.out.print("Enter " + n + " comma-separated numbers for the first array: ");
        int[] array1 = parseArray(scanner.next(), n);

        System.out.print("Enter " + n + " comma-separated numbers for the second array: ");
        int[] array2 = parseArray(scanner.next(), n);

        int[] array3 = multiplyArrays(array1, array2);
        int sum = calculateSum(array3);

        System.out.println("The sum of all entries in Array3: " + sum);
    }

    private static int[] parseArray(String input, int n) {
        String[] elements = input.split(",");
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        return array;
    }

    private static int[] multiplyArrays(int[] array1, int[] array2) {
        int n = array1.length;
        int[] array3 = new int[n];

        for (int i = 0; i < n; i++) {
            array3[i] = array1[i] * array2[i];
        }

        return array3;
    }

    private static int calculateSum(int[] array) {
        return Arrays.stream(array).sum();
	}

}
