package org.crotich;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Scanner scanner = new Scanner(System.in);
        System.out.print("This is Caesar cipher program that shifts a message(s) by the key provided \n");
        System.out.print("**************************************** \n");

        System.out.print("Enter process(1 for encoding; 2 for decoding): ");
        int process = scanner.nextInt();

        System.out.print("Enter message: ");
        String message = scanner.next();

        System.out.print("Enter key: ");
        int key = scanner.nextInt();

        data.setMessage(message);
        data.setKey(key);
        data.setProcess(process);

        String output = Process.run(data);
        System.out.println(output);
    }
}