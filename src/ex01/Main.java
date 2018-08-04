package ex01;

public class Main {

    public static String Tickets(int[] peopleInLine) {

        int smallNote = 0;
        int medNote = 0;
        int bigNote = 0;

        for (int i = 0; i < peopleInLine.length; i++) {

            if (peopleInLine[i] == 25) {
                smallNote++;
                continue;
            }
            if (peopleInLine[i] == 50) {
                if (smallNote >= 1) {
                    smallNote--;
                    medNote++;
                    continue;
                }
            }
            if (peopleInLine[i] == 100) {
                if (medNote >= 1 && smallNote >= 1) {
                    medNote--;
                    smallNote--;
                    bigNote++;
                    continue;
                }
                if (smallNote >= 3) {
                    smallNote = smallNote - 3;
                    bigNote++;
                    continue;
                }

            }

            return "NO";

        }
        return "YES";
    }

}