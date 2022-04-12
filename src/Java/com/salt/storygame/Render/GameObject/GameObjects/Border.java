package com.salt.storygame.Render.GameObject.GameObjects;

import com.salt.storygame.Render.Colors.ColorManager;
import com.salt.storygame.Render.GameObject.GameObject;
import com.salt.storygame.Render.IO.SpriteSheet;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Border extends GameObject {

    BufferedImage block;

    public Border(int x, int y, int width, int height, ID id, BufferedImage tex, char tag) {
        super(x, y, width, height, id, tex, tag);

        block = tex;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(block, x, y, null);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    @Override
    public void action() {
    }
}
