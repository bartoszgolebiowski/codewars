package ex20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static int[] DataReverse(int[] data) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < data.length / 8; i++) {
            list.add(Arrays.stream(data).skip(i*8).limit(8).toArray());
        }

        Collections.reverse(list);
        return list.stream().flatMapToInt(o1-> Arrays.stream(o1)).toArray();
    }
}