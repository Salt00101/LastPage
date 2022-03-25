package com.salt.storygame.Player;

import com.salt.storygame.Item.IGearHandler;
import com.salt.storygame.Item.Item;

import java.util.ArrayList;
import java.util.HashMap;

import static com.salt.storygame.Item.ItemList.*;
import static com.salt.storygame.Printer.SysOut.*;

public class Player {
    public static String name = "";
    public static byte max_hp = 15;
    public static byte hp = 15;
    public static byte atk = 7;
    public static byte def = 9;
    public static byte spd = 5;
    public static int xp = 0;
    public static int threshold;
    public static byte lvl = 1;
    public static final ArrayList<Item> INVENTORY = new ArrayList<>();
    public static ArrayList<Integer> inventoryAmount;
    public static HashMap<String, Item> gear = IGearHandler._init_();

    public static void addItem(int index) {
        if (index <= 50) {
            inventoryAmount.set(index, inventoryAmount.get(index) + 1);
        } else {
            ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
            e.printStackTrace();
        }
    }

    public static void switchGear(String key, int index) {
        if (gear.get(key) != null) {
            max_hp -= gear.get(key).hp;
            hp -= gear.get(key).hp;
            atk -= gear.get(key).atk;
            def -= gear.get(key).def;
            spd -= gear.get(key).spd;
        }
        gear.put(key, INVENTORY.get(index));
        max_hp += INVENTORY.get(index).hp;
        hp += INVENTORY.get(index).hp;
        atk += INVENTORY.get(index).atk;
        def += INVENTORY.get(index).def;
        spd += INVENTORY.get(index).spd;
    }

    public static void addGear(String key, Item item) {
        gear.put(key, item);
        max_hp += item.hp;
        hp += item.hp;
        atk += item.atk;
        def += item.def;
        spd += item.spd;
    }

    public static void addXp(int xpAdd) {
        xp += xpAdd;
        while (xp + xpAdd >= threshold) {
            xp -= threshold;
            addLvl();
        }
    }

    public static void changeThreshold() {
        if (lvl < 50) {
            threshold = (((int) Math.pow((lvl + 1), 3)) * (100 - (lvl + 1)))/50;
        } else if (lvl >= 50 && lvl < 69) {
            threshold = (((int) Math.pow((lvl + 1), 3)) * (150 - (lvl + 1)))/100;
        } else if (lvl >= 69 && lvl < 98) {
            threshold = (((int) Math.pow((lvl + 1), 3)) * ((int) Math.floor((1911.0 - (10.0*(lvl + 1)))/3)))/500;
        } else if (lvl >= 98) {
            threshold = (((int) Math.pow((lvl + 1), 3)) * (160 - (lvl + 1)))/100;
        }
    }

    public static void addLvl() {
        if (lvl <= 100) {
            lvl++;
            changeThreshold();
            changeStats();
            printf("Level UP! ");
            printfi(lvl - 1 + " to " + lvl);
        }
    }

    public static void changeStats() {
        if (lvl < 50) {
            hp += 3;
            atk += 2;
            def += 2;
        } else if (lvl >= 50 && lvl < 68) {
            hp += 2;
            atk += 1;
            def += 1;
        } else if (lvl >= 68 && lvl < 98) {
            hp += 3;
            atk += 2;
            def += 2;
        } else if (lvl >= 98) {
            hp += 4;
            atk += 3;
            def += 3;
        }
        if (lvl % 5 == 0) {
            spd += 1 + ((int) (Math.random()*2));
        }
    }

    public static void printStats() {
        println("hp: " + hp + "/" + max_hp);
        println("atl: " + atk);
        println("def: " + def);
        printf("spd: " + spd);
    }

    public static void printLvl() {
        println("level: " + lvl);
        printf("xp to next level" + xp + "/" + threshold);
    }
}
