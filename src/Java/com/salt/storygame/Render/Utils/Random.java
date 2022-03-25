package com.salt.storygame.Render.Utils;

public class Random{
    public static boolean ten() {
        int rand = (int) (Math.random()*10) + 1;
        return rand != 1 && rand != 2 && rand != 3 && rand != 4 && rand != 5 && rand != 6 && rand != 7 && rand != 8 && rand != 9;
    }
}
