package com.salt.storygame.Render.GameObject.GameObjects;

import com.salt.storygame.Item.Item;
import com.salt.storygame.Player.Player;
import com.salt.storygame.Render.GameObject.GameObject;
import com.salt.storygame.Render.IO.SpriteSheet;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Chest extends GameObject {
    private Item item;
    private String key;
    private boolean used = false;

    public Chest(int x, int y, int width, int height, ID id, Item item, String key, BufferedImage tex, int tag) {
        super(x, y, width, height, id, tex, tag);
        this.item = item;
        this.key = key;
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
        if (!used) {
            Player.addGear(key, item);
        }
    }
}
