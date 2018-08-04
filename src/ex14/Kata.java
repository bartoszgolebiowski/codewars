package ex14;

import java.util.Arrays;
        import java.util.List;
        import java.util.stream.Collectors;


public class Kata {
    public static int findEvenIndex(int[] arr) {
        List<Integer> order = Arrays.stream(arr).boxed().collect(Collectors.toList());
        if (order.stream().reduce(0, Integer::sum) == 0) return 0;
        for (int i = 0; i < arr.length; i++) {
            int sumFromLeftToRight = order.stream().limit(i+1).reduce(0, Integer::sum);
            int sumFromRightToLeft = order.stream().skip(i).reduce(0, Integer::sum);
            if (sumFromLeftToRight == sumFromRightToLeft) return i;
        }
        return -1;
    }
}