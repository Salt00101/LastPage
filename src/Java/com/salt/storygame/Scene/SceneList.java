package com.salt.storygame.Scene;

import com.salt.storygame.Item.IGearHandler;
import com.salt.storygame.Player.Player;
import com.salt.storygame.SaveManager.SaveManager;

import static com.salt.storygame.Printer.SysOut.*;
import static com.salt.storygame.StoryGame.*;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class SceneList {
    private static Scanner scan = new Scanner(System.in);
    private static String input;
    public static String sceneName = "Preface";

    public static void welcome() {
        println("Welcome to " + TITLE + "!");
        printf("Press enter to continue");
        scan.nextLine();
        File dir = new File("src/Resources/com/salt/storygame/Saves");
        File[] fileList = dir.listFiles((dir1, name) -> name.endsWith(".ser"));
        System.out.println("\n\n\n\n\n");
        if (fileList.length > 0) {
            println("Current save: ");
            println(Player.name);
            println("Chapter: " + chapter);
            println("Scene: " + sceneName);
            scan.nextLine();
        }
        System.out.println("\n\n\n\n\n");
    }

    // only run on first ... has input
    public static void preface() {
        printf("...");
        scan.nextLine();
        printf("...");
        scan.nextLine();
        printf("...");
        scan.nextLine();
        printf("...Hm?");
        scan.nextLine();
        printf("It seems we have a visitor");
        scan.nextLine();
        printf("What is your name");
        scan.nextLine();
        printfb("Please Enter your Name: ");
        input = scan.nextLine();
        Player.name = input;
        input = "";
        printf("Wow...");
        if (Player.name.equals("Salt") || Player.name.equals("Llama") || Player.name.equals("Llamaful") || Player.name.equals("Anant") || Player.name.equals("Rohil") || Player.name.equals("Lonan")) {
            printf("Hmm I see ... " + Player.name + " is a pretty great name");
        } else {
            printf("Hmm I see ... " + Player.name + " is a pretty bad name.");
        }
        scan.nextLine();

        printf("Alright then ... let's get you up to speed");
        scan.nextLine();
        printf("This world has gone through eons of war and turmoil...");
        scan.nextLine();
        printf("But 100 years ago a great warrior fell upon the land...");
        scan.nextLine();
        printf("");
        scan.nextLine();
        Player.gear = IGearHandler._init_();
    }

    public static void ChapterOne() {
        sceneName = "A new beginning";
        input = "";
        System.out.println("Blah");
        scan.nextLine();
        SaveManager.save();
    }

    public static void ChapterTwo() { return; }

    public static void ChapterThree() { return; }

    public static void ChapterFour() { return; }

    public static void ChapterFive() { return; }

    public static void ChapterSix() { return; }

    public static void ChapterSeven() { return; }
}
