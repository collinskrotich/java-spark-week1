package org.crotich;

public class Process {
    public static String encode(String message, int key){
        return "encode";
    }
    public static String decode(String message, int key){
        return "decode";
    }
    public static String run(Data data){
        if(data.getProcess() == 1){
            return encode(data.getMessage(), data.getKey());
        }else if (data.getProcess() == 2){
            return decode(data.getMessage(), data.getKey());
        }else {
            return "";
        }

    }
}
