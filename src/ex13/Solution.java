package ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SumSquaredDivisors {


    public static String listSquared(long lowerLimit, long higherLimit) {
        List<Long> higherValue = new ArrayList<>();
        List<Long> lowerValue;

        lowerValue = Stream.
                iterate(lowerLimit, n -> n + 1).
                limit(higherLimit - lowerLimit - 1).
                filter(SumSquaredDivisors::magic).
                collect(Collectors.toList());

        for (Long lower : lowerValue) {
            higherValue.add(getSumSquaredDIvisors(lower));
        }

        return Arrays.
                deepToString(fillTwoDimensionalArray(lowerValue, higherValue));
    }

    private static long[][] fillTwoDimensionalArray(List<Long> lowerValue, List<Long> higherValue) {
        long[][] output = new long[lowerValue.size()][2];
        for (int i = 0; i < higherValue.size(); i++) {
            output[i][0] = lowerValue.get(i);
            output[i][1] = higherValue.get(i);
        }
        return output;
    }

    public static boolean magic(long number) {
        Long sumSquaredDivisors = getSumSquaredDIvisors(number);
        return (long) Math.sqrt(sumSquaredDivisors) * (long) Math.sqrt(sumSquaredDivisors) == sumSquaredDivisors;

    }

    private static Long getSumSquaredDIvisors(long number) {

        List<Integer> divisors = Stream.
                iterate(1, n -> n + 1).
                limit(number).
                filter(o1 -> number % o1 == 0).
                collect(Collectors.toList());

        return divisors.
                stream().
                mapToLong(o1 -> o1 * o1).
                sum();
    }

}