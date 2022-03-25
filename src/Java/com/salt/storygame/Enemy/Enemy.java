package com.salt.storygame.Enemy;

public class Enemy {
    public String race;
    public String name;
    public byte max_hp = 15;
    public byte hp = 15;
    public byte atk = 7;
    public byte def = 9;
    public byte spd = 3;

    public Enemy(String race, String name, byte hp, byte atk, byte def, byte spd) {
        this.race = race;
        this.name = name;
        this.max_hp = hp;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
    }

    public Enemy(String race, byte hp, byte atk, byte def, byte spd) {
        this.race = race;
        this.max_hp = hp;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
    }
}
