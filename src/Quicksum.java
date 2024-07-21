import java.util.HashMap;

public class Quicksum {

    private static final HashMap<Character, Integer> dict = new HashMap<>(26);

    public static int quicksum(String packet){
        char nChar = 65;
        for (int i = 1; i <= 26 ; i++) {
            dict.put((char) nChar, i);
            nChar++;
        }
        char[] chars = packet.toCharArray();
        int charPos = 0;
        int result = 0;
        for (char aChar : chars) {
            if (dict.containsKey(aChar) || (int) aChar == 32) {
                charPos++;
                result = charPos;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        quicksum("ABC");
    }
}