package com.salt.storygame.Render.Utils;

import com.salt.storygame.Render.GameObject.GameObject;

import java.awt.*;
import java.util.ArrayList;

public class IGameObjectHandler {
    public ArrayList<GameObject> gameObjects = new ArrayList<>();

    private boolean up = false, down = false, left = false, right = false;

    public void tick() {
        for (GameObject o : gameObjects) {
            o.tick();
        }
    }

    public void render(Graphics g) {
        for (GameObject o : gameObjects) {
            o.render(g);
        }
    }

    public void add(GameObject g) {
        gameObjects.add(g);
    }

    public void remove(GameObject g) {
        gameObjects.remove(g);
    }

    public void destroy() {
        gameObjects.clear();
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }
}
