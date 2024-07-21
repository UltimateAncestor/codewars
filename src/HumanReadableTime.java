/* Kata link https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java */

/* Write a function, which takes a non-negative integer (seconds) as input and returns
the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)  */

public class HumanReadableTime {
    //Option 1
    public static String makeReadable(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }

    //Option 2
    public static String makeReadable2(int seconds) {
        int hours = seconds/3600;
        int minutes = seconds % 3600 / 60;
        int sec = seconds % 60;
        StringBuilder result = new StringBuilder("");

        if (hours < 10){
            result.append(0).append(hours).append(":");
        } else result.append(hours).append(":");

        if (minutes < 10){
            result.append(0).append(minutes).append(":");
        } else result.append(minutes).append(":");

        if (sec < 10){
            result.append(0).append(sec);
        } else result.append(sec);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(359999));
    }
}
