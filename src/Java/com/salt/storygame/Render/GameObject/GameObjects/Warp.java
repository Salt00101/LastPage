package com.salt.storygame.Render.GameObject.GameObjects;

import com.salt.storygame.Render.GameObject.GameObject;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;
import com.salt.storygame.Render.Utils.IGameObjectHandler;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Warp extends GameObject {

    BufferedImage tex;

    public Warp(int x, int y, int width, int height, ID id, BufferedImage tex, char tag) {
        super(x, y, width, height, id, tex, tag);

        this.tex = tex;
    }

    @Override
    public void tick() {
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(tex, x, y, width, height, null);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    @Override
    public void action() {
    }

    public void action(IGameObjectHandler handler) {
        Player player = null;

        for (GameObject obj : handler.gameObjects) {
            if (obj.getId() == ID.Player) { player = (Player) obj; }
        }

        if (tag == 'n') {

        } if (tag == 's') {

        } if (tag == 'w') {

        } if (tag == 'e') {

        }
    }
}
