package ex10;

import java.util.Arrays;

public class Xbonacci {
    public double[] tribonacci(double[] input, int quantity) {

        double[] output = Arrays.copyOf(input,quantity);
        for (int i=2;i<quantity-1;i++){
            output[i+1]=output[i]+output[i-1]+output[i-2];
        }
        return output;
    }
}
