package org.crotich;

public class Process {
    public static encode(String message, int key){
        return "";
    }
    public static decode(String message, int key){
        return "";
    }
    public String run(Data data){
        if(data.getProcess() == 1){
            return encode(data.getMessage(), data.getKey());
        }else if (data.getProcess() == 2){
            return decode(data.getMessage(), data.getKey());
        }else {
            return "";
        }

    }
}
