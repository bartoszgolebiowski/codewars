package ex25;

public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        if (v1 > v2) return null;
        double time = (double) g / ((double) v2 - (double) v1) * 3600;
        int timeH = (int) time / 3600;
        int timeM = ((int) time - timeH * 3600) / 60;
        int timeS = ((int) time - timeH * 3600 - timeM * 60);
        return new int[]{timeH, timeM, timeS};
    }
}