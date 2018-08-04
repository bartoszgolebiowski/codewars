package ex08;

import java.util.function.Function;

public class Kata {

    public static Function<String, String> odd = o1 -> Character.toString(o1.charAt(o1.length() / 2));
    public static Function<String, String> even = o1 -> o1.substring(o1.length() / 2 - 1, o1.length() / 2 + 1);

    public static String getMiddle(String input) {
        return input.length() % 2 == 1 ? odd.apply(input) : even.apply(input);
    }
}
