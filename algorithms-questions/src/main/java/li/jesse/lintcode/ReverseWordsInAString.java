package li.jesse.lintcode;

/**
 * https://www.lintcode.com/problem/reverse-words-in-a-string/description
 */
public class ReverseWordsInAString {

    public static String reverseWordsInAString(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {
            if (!array[i].equals("")) {
                sb.append(array[i]).append(" ");
            }
        }

        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }
}
