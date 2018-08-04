package ex003;
import java.util.ArrayList;
import java.util.List;

public class SumDigPower {

    public static List<Long> sumDigPow(long lowerLimit, long higherLimit) {
        List<Long> fulfillsDigits = new ArrayList<Long>();

        for(long index=lowerLimit;index<higherLimit;index++){
            long sum=calculatePow(index);
            if(sum==index) fulfillsDigits.add(index);
        }
        return fulfillsDigits;
    }

    private static long calculatePow(long digitToCalculate) {
        long sum = 0;
        String parsedIntToString = String.valueOf(digitToCalculate);
        for(int j=0;j<parsedIntToString.length();j++){
            Character charToInt = parsedIntToString.charAt(j);
            sum+=Math.pow(Integer.parseInt(charToInt.toString()),j+1);
        }
        return sum;
    }
}