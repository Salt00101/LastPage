package com.salt.storygame.Render.GameObject.GameObjects;

import com.salt.storygame.Render.Colors.ColorManager;
import com.salt.storygame.Render.GameObject.GameObject;
import com.salt.storygame.Render.IO.SpriteSheet;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Door extends GameObject {
    // 12 x 3 (close) 15 x 3 (open)

    BufferedImage open;
    BufferedImage close;

    public Door(int x, int y, int width, int height, ID id, BufferedImage tex1, BufferedImage tex2) {
        super(x, y, width, height, id, tex1);

        open = tex1;
        close = tex2;
    }

    @Override
    public void tick() {
    }

    @Override
    public void render(Graphics g) {
        if (this.state) {
            g.drawImage(open, x, y, null);
        } else {
            g.drawImage(close, x, y, null);
        }
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    @Override
    public void action() { }
}
