package com.salt.storygame.SaveManager;

import com.salt.storygame.Flag.Flags;
import com.salt.storygame.Player.Player;
import com.salt.storygame.Scene.SceneList;
import com.salt.storygame.StoryGame;

import java.io.*;

public class SaveManager {
    private static final String src = "src/Resources/com/salt/storygame/Saves/save.ser";

    public static void save() {
        Save save = Save.getSave(Player.name, Player.lvl, Player.xp, Player.threshold, Player.hp, Player.atk, Player.def, Player.spd, StoryGame.chapter, StoryGame.scene, SceneList.sceneName, Flags.flags, Player.inventoryAmount, Player.gear);
        try {
            FileOutputStream fileOut = new FileOutputStream(src);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(save);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void get() {
        Save save;
        try {
            FileInputStream fileIn = new FileInputStream(src);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            save = (Save) in.readObject();
            in.close();
            fileIn.close();
            Player.name = save.name;
            Player.lvl = save.lvl;
            Player.xp = save.xp;
            Player.threshold = save.threshold;
            Player.hp = save.hp;
            Player.atk = save.atk;
            Player.def = save.def;
            Player.spd = save.spd;
            StoryGame.chapter = save.chapter;
            StoryGame.scene = save.scene;
            SceneList.sceneName = save.sceneName;
            Flags.flags = save.flags;
            Player.inventoryAmount = save.inventoryAmount;
            Player.gear = save.gear;
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
    }
}
