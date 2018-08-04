package ex005;
import java.util.Arrays;
import java.util.List;

public class Vowels {

    public static List<Character> vowels;

    static {
        vowels = Arrays.asList('a', 'e', 'u', 'i', 'o');
    }

    public static int getCount(String input) {
        int vowelsCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (vowels.contains(input.charAt(i))) vowelsCount++;
        }
        return vowelsCount;
    }

}