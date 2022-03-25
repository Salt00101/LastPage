package com.salt.storygame.Render.GameObject;

import com.salt.storygame.Render.IO.SpriteSheet;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class GameObject {
    protected int x, y, height, width;
    protected float vx = 0.0f, vy = 0.0f;

    public boolean state = true;

    BufferedImage tex;

    protected ID id;

    public GameObject(int x, int y, int width, int height, ID id, BufferedImage tex) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.id = id;
        this.tex = tex;
    }

    public abstract void tick();

    public abstract void render(Graphics g);

    public abstract Rectangle getBounds();

    public abstract void action();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public float getVx() {
        return vx;
    }

    public void setVx(float vx) {
        this.vx = vx;
    }

    public float getVy() {
        return vy;
    }

    public void setVy(float vy) {
        this.vy = vy;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
