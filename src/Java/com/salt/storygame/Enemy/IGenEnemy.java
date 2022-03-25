package com.salt.storygame.Enemy;

public class IGenEnemy {
    public byte max_hp = 14;
    public byte hp = 14;
    public byte atk = 8;
    public byte def = 7;
    public byte spd = 3;

    private IGenEnemy(int lvl) {
        if (lvl < 50) {
            hp += 3 * (lvl - 1);
            atk += 2 * (lvl - 1);
            def += (lvl - 1);
        } else if (lvl >= 50 && lvl < 68) {
            hp += (lvl - 1);
            atk += (lvl - 1);
            def += (lvl - 1);
        } else if (lvl >= 68 && lvl < 98) {
            hp += 2 * (lvl - 1);
            atk += 2 * (lvl - 1);
            def += (lvl - 1);
        } else if (lvl >= 98) {
            hp += 3 * (lvl - 1);
            atk += 2 * (lvl - 1);
            def += 2 * (lvl - 1);
        }
        if (lvl % 10 == 0) {
            spd += 1 + ((int) (Math.random()*2));
        }
    }

    public static Enemy genEnemy(String race, int lvl) {
        IGenEnemy gen = new IGenEnemy(lvl);
        return new Enemy(race, gen.hp, gen.atk, gen.def, gen.spd);
    }

    public static Enemy genEnemy(String race, String name, int lvl) {
        IGenEnemy gen = new IGenEnemy(lvl);
        return new Enemy(race, name, gen.hp, gen.atk, gen.def, gen.spd);
    }

    public static Enemy genEnemy(String race, byte hp, byte atk, byte def, byte spd) {
        return new Enemy(race, hp, atk, def, spd);
    }

    public static Enemy genEnemy(String race, String name, byte hp, byte atk, byte def, byte spd) {
        return new Enemy(race, name, hp, atk, def, spd);
    }
}
