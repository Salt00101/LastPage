package com.salt.storygame.Render.GameObject.GameObjects;

import com.salt.storygame.Render.GameObject.GameObject;
import com.salt.storygame.Render.IO.SpriteSheet;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;
import com.salt.storygame.Render.Utils.IGameObjectHandler;
import com.salt.storygame.Render.org.Chunk;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends GameObject {

    IGameObjectHandler handler;

    Rectangle b = new Rectangle();

    boolean canSwim = false;

    public Player(int x, int y, int height, int width, ID id, IGameObjectHandler handler, BufferedImage tex, int tag) {
        super(x, y, width, height, id, tex, tag);
        this.handler = handler;
    }

    @Override
    public void tick() {

        collision();

        x += vx;
        y += vy;

        collision();

        check();
    }

    public void check() {
        float _ac = 1.0f;
        if (handler.isUp()) { vy -= _ac; }
        else if (!handler.isDown()) { vy = 0; }

        if (handler.isDown()) { vy += _ac; }
        else if (!handler.isUp()) { vy = 0; }

        if (handler.isLeft()) { vx -= _ac; }
        else if (!handler.isRight()) { vx = 0; }

        if (handler.isRight()) { vx += _ac; }
        else if (!handler.isLeft()) { vx = 0; }

        vx = clamp(vx, -4, 4);
        vy = clamp(vy, -4, 4);
    }

    private void collision() {
        for (GameObject obj : handler.gameObjects) {
            if (obj.getId() == ID.Block || obj.getId() == ID.Border) {
                if (getBoundsH().intersects(obj.getBounds())) {
                    if (vx > 0) {
                        vx = 0;
                        x = obj.getX() - 32;
                    } if (vx < 0) {
                        vx = 0;
                        x = obj.getX() + 32;
                    }
                } if (getBoundsV().intersects(obj.getBounds())) {
                    if (vy > 0) {
                        vy = 0;
                        y = obj.getY() - 32;
                    } if (vy < 0) {
                        vy = 0;
                        y = obj.getY() + 32;
                    }
                }
            } else if (obj.getId() == ID.Door && !obj.state) {
                if (getBoundsH().intersects(obj.getBounds())) {
                    if (vx > 0) {
                        vx = 0;
                        x = obj.getX() - 32;
                    } if (vx < 0) {
                        vx = 0;
                        x = obj.getX() + 32;
                    }
                } if (getBoundsV().intersects(obj.getBounds())) {
                    if (vy > 0) {
                        vy = 0;
                        y = obj.getY() - 32;
                    } if (vy < 0) {
                        vy = 0;
                        y = obj.getY() + 32;
                    }
                }
            } else if (obj.getId() == ID.Button) {
                if (getBoundsH().intersects(obj.getBounds())) {
                    if (vx > 0) {
                        vx = 0;
                        x = obj.getX() - 32;
                    } if (vx < 0) {
                        vx = 0;
                        x = obj.getX() + 32;
                    }
                } if (getBoundsV().intersects(obj.getBounds())) {
                    if (vy > 0) {
                        vy = 0;
                        y = obj.getY() - 32;
                    } if (vy < 0) {
                        vy = 0;
                        y = obj.getY() + 32;
                    }
                }
            } else if (obj.getId() == ID.Liquid && !canSwim) {
                if (getBoundsH().intersects(obj.getBounds())) {
                    if (vx > 0) {
                        vx = 0;
                        x = obj.getX() - 32;
                    } if (vx < 0) {
                        vx = 0;
                        x = obj.getX() + 32;
                    }
                } if (getBoundsV().intersects(obj.getBounds())) {
                    if (vy > 0) {
                        vy = 0;
                        y = obj.getY() - 32;
                    } if (vy < 0) {
                        vy = 0;
                        y = obj.getY() + 32;
                    }
                }
            }
        }
    }

    public float clamp(float v, float min, float max) {
        if (v > max) { v = max; }
        if (v < min) {v = min; }

        return v;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(getBoundsH().x, getBoundsH().y, getBoundsH().width, getBoundsH().height);
        g.fillRect(getBoundsV().x, getBoundsV().y, getBoundsV().width, getBoundsV().height);
        g.setColor(Color.cyan);
        g.fillRect(x, y, width, height);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    public Rectangle getBoundsH() {
        float rx = x + vx, ry = y, rw = width + (vx/2), rh = height;
        return new Rectangle((int) rx, (int) ry, (int) rw, (int) rh);
    }

    public Rectangle getBoundsV() {
        float rx = x, ry = y + vy, rw = width, rh = height + (vy/2);
        return new Rectangle((int) rx, (int) ry, (int) rw, (int) rh);
    }

    @Override
    public void action() { }
}
