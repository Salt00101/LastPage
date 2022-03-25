package com.salt.storygame.Scene;

import java.io.File;

import static com.salt.storygame.StoryGame.*;
import static com.salt.storygame.Scene.SceneList.*;

public class SceneManager {
    public static void load() {
        File dir = new File("src/Resources/com/salt/storygame/Saves");
        File[] fileList = dir.listFiles((dir1, name) -> name.endsWith(".ser"));
        if (fileList.length == 0) {
            SceneList.preface();
        }
        switch(chapter) {
            case 1:
                ChapterOne();
                break;

            case 2:
                ChapterTwo();
                break;

            case 3:
                ChapterThree();
                break;

            case 4:
                ChapterFour();
                break;

            case 5:
                ChapterFive();
                break;

            case 6:
                ChapterSix();
                break;

            case 7:
                ChapterSeven();
                break;
        }
    }
}
