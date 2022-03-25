package com.salt.storygame.Item;

public class Item implements java.io.Serializable {
    public int type;
    public String name;
    public String description;
    public int hp;
    public int atk;
    public int def;
    public int spd;

    public Item(int type, String name, String description, int hp, int atk, int def, int spd) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
    }

    public Item() {
        this.type = -2;
        this.name = "null";
        this.description = "null, a secret item meant only to be used by the great 'developer', 100hp | 100atk | 100def | 100spd";
        this.hp = 100;
        this.atk = 100;
        this.def = 100;
        this.spd = 100;
    }
}
