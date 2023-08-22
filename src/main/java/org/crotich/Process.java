package org.crotich;

public class Process {
    private static final String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String encode(String message, int key){
        char[] chars = message.toCharArray();
        String output = "";

        for(char c: chars){
            int pos = ALPHABETS.indexOf(Character.toUpperCase(c));
            int newPos = (pos + key) % 26;
            char replacement = ALPHABETS.charAt(newPos);
            output = output + replacement;
        }
        return output;
    }
    public static String decode(String message, int key){
        char[] chars = message.toCharArray();
        String output = "";

        for(char c: chars){
            int pos = ALPHABETS.indexOf(c);
            int newPos = pos - key;
            char replacement = ALPHABETS.charAt(newPos);
            output = output + replacement;
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
