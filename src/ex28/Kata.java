package ex28;

public class Kata {

    public static String encrypt(final String text, final int n) {
        if (text == null) return null;
        String toEncrypt = text;

        for (int j = 0; j < n; j++) {
            StringBuilder stringBufferFirst = new StringBuilder();
            StringBuilder stringBufferSecond = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                if (i % 2 == 0) stringBufferFirst.append(toEncrypt.charAt(i));
                if (i % 2 == 1) stringBufferSecond.append(toEncrypt.charAt(i));
            }
            toEncrypt = new StringBuffer(stringBufferSecond.toString()).append(stringBufferFirst.toString()).toString();
        }
        return toEncrypt;
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null) return null;
        String toDecrypt = encryptedText;

        for (int j = 0; j < n; j++) {
            String stringFirst = new StringBuilder(toDecrypt.substring(0, toDecrypt.length() / 2)).toString();
            String stringSecond = new StringBuilder(toDecrypt.substring(toDecrypt.length() / 2, toDecrypt.length())).toString();
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < toDecrypt.length() / 2; i++) {
                stringBuilder.append(stringSecond.charAt(i));
                stringBuilder.append(stringFirst.charAt(i));
            }

            if (toDecrypt.length() % 2 == 1) stringBuilder.append(stringSecond.charAt(stringSecond.length() - 1));
            toDecrypt = stringBuilder.toString();
        }
        return toDecrypt;
    }

}