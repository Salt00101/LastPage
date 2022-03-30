package com.salt.storygame.Render.org;

import com.salt.storygame.Render.IO.BufferedImageLoader;
import com.salt.storygame.Render.IO.SpriteSheet;

import java.awt.image.BufferedImage;

public class Chunk {
    public static BufferedImageLoader bil = new BufferedImageLoader();

    public static final BufferedImage mapImg = bil.loadImage("/map");
    public static final SpriteSheet mss = new SpriteSheet(mapImg);

    public static BufferedImage[][] map = {
            { mss.grab(1, 1, 64, 64), mss.grab(2, 1, 64, 64), mss.grab(3, 1, 64, 64), mss.grab(4, 1, 64, 64), mss.grab(5, 1, 64, 64), mss.grab(6, 1, 64, 64), mss.grab(7, 1, 64, 64), mss.grab(8, 1, 64, 64), mss.grab(9, 1, 64, 64) },
            { mss.grab(1, 2, 64, 64), mss.grab(2, 2, 64, 64), mss.grab(3, 2, 64, 64), mss.grab(4, 2, 64, 64), mss.grab(5, 2, 64, 64), mss.grab(6, 2, 64, 64), mss.grab(7, 2, 64, 64), mss.grab(8, 2, 64, 64), mss.grab(9, 2, 64, 64) },
            { mss.grab(1, 3, 64, 64), mss.grab(2, 3, 64, 64), mss.grab(3, 3, 64, 64), mss.grab(4, 3, 64, 64), mss.grab(5, 3, 64, 64), mss.grab(6, 3, 64, 64), mss.grab(7, 3, 64, 64), mss.grab(8, 3, 64, 64), mss.grab(9, 3, 64, 64) },
            { mss.grab(1, 4, 64, 64), mss.grab(2, 4, 64, 64), mss.grab(3, 4, 64, 64), mss.grab(4, 4, 64, 64), mss.grab(5, 4, 64, 64), mss.grab(6, 4, 64, 64), mss.grab(7, 4, 64, 64), mss.grab(8, 4, 64, 64), mss.grab(9, 4, 64, 64) },
            { mss.grab(1, 5, 64, 64), mss.grab(2, 5, 64, 64), mss.grab(3, 5, 64, 64), mss.grab(4, 5, 64, 64), mss.grab(5, 5, 64, 64), mss.grab(6, 5, 64, 64), mss.grab(7, 5, 64, 64), mss.grab(8, 5, 64, 64), mss.grab(9, 5, 64, 64) },
            { mss.grab(1, 6, 64, 64), mss.grab(2, 6, 64, 64), mss.grab(3, 6, 64, 64), mss.grab(4, 6, 64, 64), mss.grab(5, 6, 64, 64), mss.grab(6, 6, 64, 64), mss.grab(7, 6, 64, 64), mss.grab(8, 6, 64, 64), mss.grab(9, 6, 64, 64) }
    };



    public static int dx = 4;
    public static int dy = 2;
}
