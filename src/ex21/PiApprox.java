package ex21;

public class PiApprox {

    public static String iterPi2String(Double epsilon) {
        double pi = 4, iteration=1;;
        while (Math.abs(Math.PI - pi) >= epsilon) {
            if(iteration%2==0){
                pi+=4/(iteration*2+1);
            }
            if(iteration%2==1){
                pi-=4/(iteration*2+1);
            }
            iteration++;
        }
        return String.format("[%.0f, %.10f]", iteration, pi);
    }
}