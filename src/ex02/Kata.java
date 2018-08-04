package ex02;
import java.util.*;

public class Kata {

    public static String high(String input) {

        Map<String, Integer> wordsAndPoints = new HashMap<>();
        calculateValueOfStrings(input, wordsAndPoints);
        return getKeyWithHighestValue(wordsAndPoints);
    }

    private static String getKeyWithHighestValue(Map<String, Integer> wordsAndPoints) {
        int highestValue = 0;
        String returnKey = "";
        for (String key : wordsAndPoints.keySet()) {
            if (wordsAndPoints.get(key) > highestValue) {
                highestValue = wordsAndPoints.get(key);
                returnKey = key;
            }
        }
        return returnKey;
    }

    private static void calculateValueOfStrings(String input, Map<String, Integer> wordsAndPoints) {
        for (String atom : input.split(" ")) {
            wordsAndPoints.put(atom, getSum(atom));
        }
    }

    private static int getSum(String atom) {
        int sum = 0;
        for (int i = 0; i < atom.length(); i++) {
            sum += Character.getNumericValue(atom.charAt(i)) - 9;
        }
        return sum;
    }


}