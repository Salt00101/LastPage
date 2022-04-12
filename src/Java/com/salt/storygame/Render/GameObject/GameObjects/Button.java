package com.salt.storygame.Render.GameObject.GameObjects;

import com.salt.storygame.Render.Colors.ColorManager;
import com.salt.storygame.Render.GameObject.GameObject;
import com.salt.storygame.Render.IO.SpriteSheet;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;
import com.salt.storygame.Render.Puzzle.Puzzle;
import com.salt.storygame.Render.Utils.IGameObjectHandler;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Button extends GameObject {

    private Puzzle puzzle;

    private BufferedImage s1;
    private BufferedImage s2;

    public Button(int x, int y, int width, int height, ID id, Puzzle puzzle, BufferedImage tex1, BufferedImage tex2, char tag) {
        super(x, y, width, height, id, tex1, tag);
        this.puzzle = puzzle;

        s1 = tex1;
        s2 = tex2;
    }

    @Override
    public void tick() {
        puzzle.check();
    }

    @Override
    public void render(Graphics g) {
        if (!state) {
            g.drawImage(s1, x, y, null);
        } else {
            g.drawImage(s2, x, y, null);
        }
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    @Override
    public void action() {
        System.out.println("ButtonPressed");
        state = true;
    }
}
