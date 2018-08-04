package ex16;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Opstrings1 {

    public static String rot(String strng) {
        String[] split = strng.split("\n");
        Stream<String> stringStream = Arrays
                .stream(split)
                .map(o1 -> new StringBuffer(o1).toString());

        String collect = stringStream
                .map(o1 -> new StringBuilder(o1).append("\n").toString())
                .collect(Collectors.joining());

        return new StringBuilder(collect).reverse().deleteCharAt(0).toString();
    }

    public static String selfieAndRot(String strng) {
        String[] split = strng.split("\n");
        char[] dots = new char[split[0].length()];
        Arrays.fill(dots, '.');
        String firstPart = Arrays
                .stream(split)
                .map(o1 -> new StringBuilder(o1).append(dots).append("\n").toString())
                .collect(Collectors.joining());

        String rotated = rot(strng);
        String[] split2 = rotated.split("\n");
        String secondPart = Arrays
                .stream(split2)
                .map(o1 -> new StringBuilder(String.valueOf(dots)).append(o1).append("\n").toString())
                .collect(Collectors.joining());

        String output = new StringBuilder(firstPart).append(secondPart).toString();
        return new StringBuilder(output).deleteCharAt(output.length()-1).toString();
    }

    public static String oper(Function<String, String> fun, String s) {
        return fun.apply(s);
    }
}