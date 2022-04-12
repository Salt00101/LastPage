package com.salt.storygame.Render.IO;

import java.awt.image.BufferedImage;

public class SpriteSheet {
    private BufferedImage img;

    public SpriteSheet(BufferedImage img) {
        this.img = img;
    }

    public BufferedImage grab64(int c, int r, int w, int h) {
        BufferedImage ret = img.getSubimage((r*64) - 64, (c*64) - 64, w, h);
        return ret;
    }

    public BufferedImage grab32(int c, int r, int w, int h) {
        return img.getSubimage((c*32) - 32, (r*32) - 32, w, h);
    }
}
