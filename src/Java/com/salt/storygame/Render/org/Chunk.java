package com.salt.storygame.Render.org;

import com.salt.storygame.Render.IO.BufferedImageLoader;
import com.salt.storygame.Render.IO.SpriteSheet;

import java.awt.image.BufferedImage;

public class Chunk {
    public static BufferedImageLoader bil = new BufferedImageLoader();

    public static final BufferedImage mapImg = bil.loadImage("/map");
    public static final SpriteSheet mss = new SpriteSheet(mapImg);

    public static final BufferedImage n11 = mss.grab(1, 1, 64, 64); // 11
    public static final BufferedImage n12 = mss.grab(1, 2, 64, 64); // 12
    public static final BufferedImage n13 = mss.grab(1, 3, 64, 64); // 13
    public static final BufferedImage n14 = mss.grab(1, 4, 64, 64); // 14
    public static final BufferedImage n15 = mss.grab(1, 5, 64, 64); // 15
    public static final BufferedImage MOUNTAIN_VILLAGE = mss.grab(1, 6, 64, 64); // 16
    public static final BufferedImage MOUNTAIN_ENTRANCE = mss.grab(1, 7, 64, 64); // 17
    public static final BufferedImage MOUNT = mss.grab(1, 8, 64, 64); // 18
    public static final BufferedImage n19 = mss.grab(1, 9, 64, 64); // 19
    public static final BufferedImage FOREST = mss.grab(2, 1, 64, 64); // 21
    public static final BufferedImage FOREST_ENTRANCE = mss.grab(2, 2, 64, 64); // 22
    public static final BufferedImage FOREST_VILLAGE = mss.grab(2, 3, 64, 64); // 23
    public static final BufferedImage NW_C = mss.grab(2, 4, 64, 64); // 24
    public static final BufferedImage N_T = mss.grab(2, 5, 64, 64); // 25
    public static final BufferedImage NE_R = mss.grab(2, 6, 64, 64); // 26
    public static final BufferedImage n27 = mss.grab(2, 7, 64, 64); // 27
    public static final BufferedImage n28 = mss.grab(2, 8, 64, 64); // 28
    public static final BufferedImage n29 = mss.grab(2, 9, 64, 64); // 29
    public static final BufferedImage n31 = mss.grab(3, 1, 64, 64); // 31
    public static final BufferedImage n32 = mss.grab(3, 2, 64, 64); // 32
    public static final BufferedImage W_R = mss.grab(3, 3, 64, 64); // 33
    public static final BufferedImage W_C = mss.grab(3, 4, 64, 64); // 34
    public static final BufferedImage SPAWN = mss.grab(3, 5, 64, 64); // 35
    public static final BufferedImage E_C = mss.grab(3, 6, 64, 64); // 36
    public static final BufferedImage DESERT_VILLAGE = mss.grab(3, 7, 64, 64); // 37
    public static final BufferedImage DESERT_ENTRANCE = mss.grab(3, 8, 64, 64); // 38
    public static final BufferedImage DESERT = mss.grab(3, 9, 64, 64); // 39
    public static final BufferedImage VOLCANO = mss.grab(4, 1, 64, 64); // 41
    public static final BufferedImage VOLCANO_ENTRANCE = mss.grab(4, 2, 64, 64); // 42
    public static final BufferedImage VOLCANO_VILLAGE = mss.grab(4, 3, 64, 64); // 43
    public static final BufferedImage n44 = mss.grab(4, 4, 64, 64); // 44
    public static final BufferedImage S_C = mss.grab(4, 5, 64, 64); // 45
    public static final BufferedImage n46 = mss.grab(4, 6, 64, 64); // 46
    public static final BufferedImage PATH_D_B = mss.grab(4, 7, 64, 64); // 47
    public static final BufferedImage n48 = mss.grab(4, 8, 64, 64); // 48
    public static final BufferedImage n49 = mss.grab(4, 9, 64, 64); // 49
    public static final BufferedImage n51 = mss.grab(5, 1, 64, 64); // 51
    public static final BufferedImage n52 = mss.grab(5, 2, 64, 64); // 52
    public static final BufferedImage n53 = mss.grab(5, 3, 64, 64); // 53
    public static final BufferedImage SW_R = mss.grab(5, 4, 64, 64); // 54
    public static final BufferedImage S_T = mss.grab(5, 5, 64, 64); // 55
    public static final BufferedImage SE_C = mss.grab(5, 6, 64, 64); // 56
    public static final BufferedImage BEACH_VILLAGE = mss.grab(5, 7, 64, 64); // 57
    public static final BufferedImage BEACH_ENTRANCE = mss.grab(5, 8, 64, 64); // 58
    public static final BufferedImage BEACH_EDGE = mss.grab(5, 9, 64, 64); // 59
    public static final BufferedImage CAVES = mss.grab(6, 1, 64, 64); // 61
    public static final BufferedImage CAVES_ENTRANCE_2 = mss.grab(6, 2, 64, 64); // 62
    public static final BufferedImage CAVES_ENTRANCE_1 = mss.grab(6, 3, 64, 64); // 63
    public static final BufferedImage CAVES_OPENING = mss.grab(6, 4, 64, 64); // 64
    public static final BufferedImage LAB = mss.grab(6, 5, 64, 64); // 65
    public static final BufferedImage n66 = mss.grab(6, 6, 64, 64); // 66
    public static final BufferedImage n67 = mss.grab(6, 7, 64, 64); // 67
    public static final BufferedImage n68 = mss.grab(6, 8, 64, 64); // 68
    public static final BufferedImage BEACH_OCEAN = mss.grab(6, 9, 64, 64); // 69
}
