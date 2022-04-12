package com.salt.storygame.Render.GameObject.GameObjects;

import com.salt.storygame.Render.Colors.ColorManager;
import com.salt.storygame.Render.GameObject.GameObject;
import com.salt.storygame.Render.IO.SpriteSheet;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Block extends GameObject {

    BufferedImage block1;

    public Block(int x, int y, int width, int height, ID id, BufferedImage tex, char tag) {
        super(x, y, width, height, id, tex, tag);

        block1 = tex;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(block1, x, y, null);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    @Override
    public void action() {
    }
}
