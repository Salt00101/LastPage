package com.salt.storygame.Printer;

import java.util.concurrent.TimeUnit;

public class SysOut {
    public static void printf(String writeInput) {
        int writeSpeed = Math.max(30, 50/writeInput.length());
        int skipAmount = 1;

        for (int i = 0; i < writeInput.length()-skipAmount+1; i += skipAmount) {
            System.out.print(writeInput.substring(i, i+skipAmount));
            try {
                TimeUnit.MILLISECONDS.sleep(writeSpeed);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void printfi(String writeInput) {
        writeInput = "\033[1m" + writeInput + "\033[0m";
        int writeSpeed = Math.max(30, 50/writeInput.length());
        int skipAmount = 1;

        for (int i = 0; i < writeInput.length()-skipAmount+1; i += skipAmount) {
            System.out.print(writeInput.substring(i, i+skipAmount));
            try {
                TimeUnit.MILLISECONDS.sleep(writeSpeed);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void printfb(String writeInput) {
        writeInput = "\033[3m" + writeInput + "\033[0m";
        int writeSpeed = Math.max(30, 50/writeInput.length());
        int skipAmount = 1;

        for (int i = 0; i < writeInput.length()-skipAmount+1; i += skipAmount) {
            System.out.print(writeInput.substring(i, i+skipAmount));
            try {
                TimeUnit.MILLISECONDS.sleep(writeSpeed);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void println(String writeInput) {
        int writeSpeed = Math.max(30, 50/writeInput.length());
        int skipAmount = 1;

        for (int i = 0; i < writeInput.length()-skipAmount+1; i += skipAmount) {
            System.out.print(writeInput.substring(i, i+skipAmount));
            try {
                TimeUnit.MILLISECONDS.sleep(writeSpeed);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.print("\n");
    }

    public static void printlni(String writeInput) {
        writeInput = "\033[1m" + writeInput + "\033[0m";
        int writeSpeed = Math.max(30, 50/writeInput.length());
        int skipAmount = 1;

        for (int i = 0; i < writeInput.length()-skipAmount+1; i += skipAmount) {
            System.out.print(writeInput.substring(i, i+skipAmount));
            try {
                TimeUnit.MILLISECONDS.sleep(writeSpeed);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.print("\n");
    }

    public static void printlnb(String writeInput) {
        writeInput = "\033[3m" + writeInput + "\033[0m";
        int writeSpeed = Math.max(30, 50/writeInput.length());
        int skipAmount = 1;

        for (int i = 0; i < writeInput.length()-skipAmount+1; i += skipAmount) {
            System.out.print(writeInput.substring(i, i+skipAmount));
            try {
                TimeUnit.MILLISECONDS.sleep(writeSpeed);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.print("\n");
    }
}
