package ex23;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//public class Ball {
//    public static int maxBall(double v) {
//        double t = 0, g = 9.81, hPrevious = 0, hCurrent = 0;
//        v=v/3.6;
//        int index=0;
//        do{
//            hPrevious = hCurrent;
//            t=t+0.1;
//            hCurrent = v * t - 0.5 * g * t * t;
//            index++;
//        }while (hCurrent - hPrevious > 0);
//
//        return index-1;
//    }
//}
public class Ball {
    public static int maxBall(double v) {
        final double g = 9.81;
        List<Double> collect = Stream
                .iterate(0, n -> n + 1)
                .mapToDouble(o1 -> v/3.6 * o1 / 10 - 0.5 * g * o1 / 10 * o1 / 10)
                .limit(100)
                .boxed()
                .collect(Collectors.toList());

        double MaxValue = collect
                .stream()
                .max(Comparator.naturalOrder())
                .get();

        return collect
                .indexOf(MaxValue);
    }
}