package ex09;

import java.util.Arrays;

public class FindOdd {

    public static int findIt(int[] input) {

        for (int target : input) {
            if (quantity(input, target)) return target;
        }
        return -1;
    }

    private static boolean quantity(int[] input, int target) {
        int quantity = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == target) quantity++;
        }
        return quantity % 2 == 0 ? false : true;
    }
}