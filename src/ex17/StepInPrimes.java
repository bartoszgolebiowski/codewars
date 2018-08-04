package ex17;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class StepInPrimes {

    public static long[] step(int step, long start, long end) {
        long[] output = new long[2];
        List<Integer> primeNumbers = IntStream
                .iterate((int) start, i -> i + 1)
                .limit(end - start + 1)
                .filter(StepInPrimes::isPrime)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < primeNumbers.size() - 1; i++) {
            for (int j = i; j < primeNumbers.size(); j++) {
                if (checkFinalCondition(step, output, primeNumbers, i, j)) return output;
                if (checkFinalCondition(step, output, primeNumbers, j-1, i)) return output;
            }
        }
        return null;
    }

    private static boolean checkFinalCondition(int step, long[] output, List<Integer> primeNumbers, int i, int j) {
        if (primeNumbers.get(i + 1) - primeNumbers.get(j) == step ) {
            output[0] = primeNumbers.get(j);
            output[1] = primeNumbers.get(i + 1);
            return true;
        }
        return false;
    }



    public static boolean isPrime(int check) {
        BigInteger bigInt = BigInteger.valueOf(check);
        return bigInt.isProbablePrime(50);
    }
}