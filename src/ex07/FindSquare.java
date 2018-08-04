package ex07;

public class FindSquare {
    public static long findNextSquare(long input) {
        return (long)(Math.sqrt(input))*(long)(Math.sqrt(input))==input ? (long)(Math.sqrt(input)+1)*(long)(Math.sqrt(input)+1) : -1;
    }

}
