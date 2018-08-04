package ex15;

class Persist {
    public static int persistence(int n) {
        int output = 0;
        while (n >= 10) {
            n = String.valueOf(n)
                    .chars()
                    .map(Character::getNumericValue)
                    .reduce(1, (acc, next) -> acc * next);
            output++;
        }
        return output;
    }
}