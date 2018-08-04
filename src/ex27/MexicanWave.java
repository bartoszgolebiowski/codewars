package ex27;

import java.util.ArrayList;

import java.util.List;


public class MexicanWave {
    public static String[] wave(String hello) {
        List<String> output = new ArrayList<>();
        int[] intArray;
        for (int i = 0; i < hello.length(); i++) {
            intArray= hello.chars().toArray();
            if (intArray[i] != 32) {
                intArray[i] = intArray[i] - 32;
                output.add(String.valueOf(fun(intArray)));
            }

        }
        return hello.length() != 0 ? output.stream().toArray(String[]::new) : new String[] { };
    }

    private static char[] fun(int[] intArray) {
        char[] output = new char[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            output[i] = (char)intArray[i];
        }
        return output;
    }
}
