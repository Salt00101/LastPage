package com.salt.storygame.SaveManager;

import com.salt.storygame.Item.Item;

import java.util.ArrayList;
import java.util.HashMap;

public class Save implements java.io.Serializable {
    public String name;
    public byte lvl;
    public int xp;
    public int threshold;
    public byte hp;
    public byte atk;
    public byte def;
    public byte spd;
    public byte chapter;
    public byte scene;
    public String sceneName;
    public ArrayList<Boolean> flags;
    public ArrayList<Integer> inventoryAmount;
    public HashMap<String, Item> gear;

    private Save(String name, byte lvl, int xp, int threshold, byte hp, byte atk, byte def, byte spd, byte chapter, byte scene, String sceneName, ArrayList<Boolean> flags, ArrayList<Integer> inventoryAmount, HashMap<String, Item> gear) {
        this.name = name;
        this.lvl = lvl;
        this.xp = xp;
        this.threshold = threshold;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
        this.chapter = chapter;
        this.scene = scene;
        this.sceneName = sceneName;
        this.flags = flags;
        this.inventoryAmount = inventoryAmount;
        this.gear = gear;
    }

    public static Save getSave(String name, byte lvl, int xp, int threshold, byte hp, byte atk, byte def, byte spd, byte chapter, byte scene, String sceneName, ArrayList<Boolean> flags, ArrayList<Integer> inventoryAmount, HashMap<String, Item> gear) {
        return new Save(name, lvl, xp, threshold, hp, atk, def, spd, chapter, scene, sceneName, flags, inventoryAmount, gear);
    }
}
