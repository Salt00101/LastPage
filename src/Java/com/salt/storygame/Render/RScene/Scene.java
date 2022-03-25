package com.salt.storygame.Render.RScene;

import com.salt.storygame.Render.GameObject.GameObjects.*;
import com.salt.storygame.Render.GameObject.GameObjects.Button;
import com.salt.storygame.Render.GameObject.Textures.Textures;
import com.salt.storygame.Render.IO.BufferedImageLoader;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;
import com.salt.storygame.Render.Utils.IGameObjectHandler;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Scene {

    private BufferedImageLoader loader = new BufferedImageLoader();

    private BufferedImage lvl;
    private BufferedImage hmap;
    private BufferedImage bmap;

    String biome;

    IGameObjectHandler handler;

    public Scene(IGameObjectHandler handler, BufferedImage lvl, BufferedImage hmap, BufferedImage bmap, String biome) {
        this.handler = handler;
        this.lvl = lvl;
        this.hmap = hmap;
        this.bmap = bmap;

        this.biome = biome;

        loadLevel(this.lvl);
    }

    public void Draw(Graphics g) {
        //Background
        if (biome.equals("Plains")) {
            for (int i = 0; i < 2400; i += 32) {
                for (int j = 0; j < 2400; j += 32) {
                    int pixel = hmap.getRGB(i/32, j/32);
                    int red = (pixel >> 16) & 0xff;
                    int green = (pixel >> 8) & 0xff;
                    int blue = (pixel) & 0xff;
                    if (red <= 85 && blue <= 85 && green <= 85) {
                        g.drawImage(Textures.floor1, i, j, null);
                    } else if (red <= 170 && blue <= 170 && green <= 170) {
                        g.drawImage(Textures.floor2, i, j, null);
                    }
                }
            }
        } if (biome.equals("Volcano")) {
            for (int i = 0; i < 2400; i += 32) {
                for (int j = 0; j < 2400; j += 32) {
                    g.drawImage(Textures.floor1, i, j, null);
                }
            }
        }

        //Scene

    }

    private void loadLevel(BufferedImage img) {
        handler.destroy();
        // Load level based on img
        int w = img.getWidth();
        int h = img.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = img.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL));
                } if (red == 255 && blue == 255 && green == 0) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1));
                }
            }
        }
    }
}
