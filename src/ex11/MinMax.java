package ex11;

import java.util.Arrays;

class MinMax {
    public static int[] minMax(int[] input) {
        Arrays.sort(input);
        return new int[]{input[0],input[input.length-1]};
    }
}