package ex12;

import java.util.Arrays;
import java.util.Comparator;

public class DescendingOrder {
    public static int sortDesc(final int input) {
        String[] array = String.valueOf(input).split("");
        Arrays.sort(array,Comparator.reverseOrder());
        return Integer.valueOf(String.join("",array));
    }
}