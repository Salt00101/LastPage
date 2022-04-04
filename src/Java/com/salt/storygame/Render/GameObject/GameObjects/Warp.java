package com.salt.storygame.Render.GameObject.GameObjects;

import com.salt.storygame.Render.GameObject.GameObject;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Warp extends GameObject {
    public Warp(int x, int y, int width, int height, ID id, BufferedImage tex, char tag) {
        super(x, y, width, height, id, tex, tag);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {

    }

    @Override
    public Rectangle getBounds() {
        return null;
    }

    @Override
    public void action() {

    }
}
