package ex24;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution
{
    public static int minimumNumber(int[] numbers)
    {
        int sum = Arrays
                .stream(numbers)
                .boxed()
                .reduce(0, (acc, next) -> acc + next);

        return Stream
                .iterate(sum, n -> n + 1)
                .filter(Solution::isPrime)
                .findFirst()
                .map(o1 -> o1 - sum)
                .get();
    }
    private static boolean isPrime(int o1){
        for(int i = 2; i <= o1/2; ++i) if(o1 % i == 0) return false;
        return true;
    }
}