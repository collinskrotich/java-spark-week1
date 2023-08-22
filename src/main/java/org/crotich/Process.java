package org.crotich;

public class Process {
    private static final String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String encode(String message, int key) {
        char[] chars = message.toCharArray();
        String output = "";

        for (char c : chars) {
            int pos = ALPHABETS.indexOf(Character.toUpperCase(c));
            if (pos == -1) {
                output = output + c; // For special characters
                return output;
            } else {
                int newPos = (pos + key) % 26; // modulo operator
                if (newPos < 0) {
                    newPos += 26; // negative values
                }
                char replacement = ALPHABETS.charAt(newPos);
                if (Character.isLowerCase(c)) {
                    replacement = Character.toLowerCase(replacement);
                }
                output = output + replacement;
            }

        }
        return output;
    }
    public static String decode(String message, int key){
        char[] chars = message.toCharArray();
        String output = "";

        for (char c : chars) {
            int pos = ALPHABETS.indexOf(Character.toUpperCase(c));
            if (pos == -1) {
                output = output + c; // For special characters
                return output;
            } else {
                int newPos = (pos - key) % 26; // modulo operator
                if (newPos < 0) {
                    newPos += 26; // negative values
                }
                char replacement = ALPHABETS.charAt(newPos);
                if (Character.isLowerCase(c)) {
                    replacement = Character.toLowerCase(replacement);
                }
                output = output + replacement;
            }

        }
        return output;
    }
    public static String run(Data data){
        if(data.getProcess() == 1){
            return encode(data.getMessage(), data.getKey());
        }else if (data.getProcess() == 2){
            return decode(data.getMessage(), data.getKey());
        }else {
            return "null";
        }

    }
}
