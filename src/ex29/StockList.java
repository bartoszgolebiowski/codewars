package ex29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockList {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        List<String> list = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        boolean flag = true;

        for (String toCheck : lstOf1stLetter) {
            int sum = Arrays
                    .stream(lstOfArt)
                    .filter(o1 -> o1.charAt(0) == toCheck.charAt(0))
                    .map(o1 -> o1.replaceAll("\\D+", ""))
                    .mapToInt(o1 -> Integer.valueOf(o1))
                    .sum();

            list.add(new StringBuilder().append("(").append(toCheck).append(" : ").append(sum).append(")").toString());
            if (sum != 0) flag = false;
        }
        for (String temp : list) {
            output.append(temp).append(" - ");
        }
        String emptyString = "";
        if (flag == true) output = new StringBuilder();
        return output.length() != 0 ? output.delete(output.length() - 3, output.length()).toString() : emptyString;
    }

}
