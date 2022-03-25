package com.salt.storygame.Mechanics.Battle;

import com.salt.storygame.Enemy.Enemy;
import com.salt.storygame.Player.Player;

import static com.salt.storygame.Printer.SysOut.*;

public class Battle {
    byte turn;
    Enemy enemy;

    public Battle() {

    }

    public void run() {
        if (Player.spd > enemy.spd) {
            turn = 0;
        } else {
            turn = 1;
        }
    }

    public void playerTurn(byte action) {
        switch(action) {
            case 0:
                attack();

            case 1:

        }
    }

    public void attack() {
        int modRoll = (int) (Math.random()*2) + Player.lvl;
        if (turn == 0) {
            enemy.hp -= Player.atk + modRoll;
        } else {
            Player.hp -= enemy.atk;
        }
    }

    public void heal() {}

    public void printHP() {
        println("Your HP: " + Player.hp + "/" + Player.max_hp);
        if (enemy.name != null) {
            println(enemy.name + " HP: " + enemy.hp + "/" + enemy.max_hp);
        } else {
            println(enemy.race + " HP: " + enemy.hp + "/" + enemy.max_hp);
        }
    }
}
