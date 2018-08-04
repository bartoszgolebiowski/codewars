package ex19;

import java.util.stream.Collectors;

public class CountingDuplicates {
    public static long duplicateCount(String input) {
        final String string = input.toLowerCase();
        return string
                .chars()
                .boxed()
                .filter(o1 -> string.indexOf(o1) != string.lastIndexOf(o1))
                .collect(Collectors.toSet())
                .size();
    }
}