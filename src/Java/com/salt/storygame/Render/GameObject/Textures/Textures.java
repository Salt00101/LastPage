package com.salt.storygame.Render.GameObject.Textures;

import com.salt.storygame.Render.IO.BufferedImageLoader;
import com.salt.storygame.Render.IO.SpriteSheet;

import java.awt.image.BufferedImage;

public class Textures {
    public static BufferedImageLoader loader = new BufferedImageLoader();
    public static final BufferedImage spriteSheet = loader.loadImage("/tile.png");
    public static final SpriteSheet ss = new SpriteSheet(spriteSheet);

    public static final BufferedImage NULL = ss.grab(1, 1, 32, 32);
    public static final BufferedImage border = ss.grab(1, 4, 32, 32);
    public static final BufferedImage barrier = ss.grab(1, 2, 32, 32);

    // Plains
    public static final BufferedImage floor1 = ss.grab(2, 1, 32, 32);
    public static final BufferedImage floor2 = ss.grab(3, 1, 32, 32);
    public static final BufferedImage floor3 = ss.grab(4, 1, 32, 32);
    public static final BufferedImage floor4 = ss.grab(5, 1, 32, 32);

    public static final BufferedImage water1 = ss.grab(6, 1, 32, 32);

    public static final BufferedImage wall1 = ss.grab(2, 3,32, 32);
    public static final BufferedImage button_wall1 = ss.grab(2, 4, 32, 32);
    public static final BufferedImage button_wall_down1 = ss.grab(7, 4, 32, 32);
    public static final BufferedImage dungeon_wall1 = ss.grab(2, 5, 32, 32);
    public static final BufferedImage dungeon_button_wall1 = ss.grab(2, 6, 32, 32);
    public static final BufferedImage dungeon_button_wall_down1 = ss.grab(7, 6, 32, 32);

    public static final BufferedImage dungeon_floor1 = ss.grab(2, 7, 32 ,32);
    public static final BufferedImage dungeon_floor2 = ss.grab(2, 8, 32, 32);

    // Mountains
    public static final BufferedImage floor5 = ss.grab(7, 1, 32, 32);
    public static final BufferedImage floor6 = ss.grab(8, 1, 32, 32);
    public static final BufferedImage floor7 = ss.grab(9, 1, 32, 32);
    public static final BufferedImage floor8 = ss.grab(10, 1, 32, 32);

    public static final BufferedImage water2 = ss.grab(11, 1, 32, 32);

    public static final BufferedImage wall2 = ss.grab(3, 3,32, 32);
    public static final BufferedImage button_wall2 = ss.grab(3, 4, 32, 32);
    public static final BufferedImage button_wall_down2 = ss.grab(8, 4, 32, 32);
    public static final BufferedImage dungeon_wall2 = ss.grab(3, 5, 32, 32);
    public static final BufferedImage dungeon_button_wall2 = ss.grab(3, 6, 32, 32);
    public static final BufferedImage dungeon_button_wall_down2 = ss.grab(8, 6, 32, 32);

    public static final BufferedImage dungeon_floor3 = ss.grab(3, 7, 32 ,32);
    public static final BufferedImage dungeon_floor4 = ss.grab(3, 8, 32, 32);

    // Desert
    public static final BufferedImage floor9 = ss.grab(12, 1, 32, 32);
    public static final BufferedImage floor10 = ss.grab(13, 1, 32, 32);
    public static final BufferedImage floor11 = ss.grab(14, 1, 32, 32);
    public static final BufferedImage floor12 = ss.grab(15, 1, 32, 32);

    public static final BufferedImage water3 = ss.grab(16, 1, 32, 32);

    public static final BufferedImage wall3 = ss.grab(4, 3,32, 32);
    public static final BufferedImage button_wall3 = ss.grab(4, 4, 32, 32);
    public static final BufferedImage button_wall_down3 = ss.grab(9, 4, 32, 32);
    public static final BufferedImage dungeon_wall3 = ss.grab(4, 5, 32, 32);
    public static final BufferedImage dungeon_button_wall3 = ss.grab(4, 6, 32, 32);
    public static final BufferedImage dungeon_button_wall_down3 = ss.grab(9, 6, 32, 32);

    public static final BufferedImage dungeon_floor5 = ss.grab(4, 7, 32 ,32);
    public static final BufferedImage dungeon_floor6 = ss.grab(4, 8, 32, 32);

    // Volcano
    public static final BufferedImage floor13 = ss.grab(2, 2, 32, 32);
    public static final BufferedImage floor14 = ss.grab(3, 2, 32, 32);
    public static final BufferedImage floor15 = ss.grab(4, 2, 32, 32);
    public static final BufferedImage floor16 = ss.grab(5, 2, 32, 32);

    public static final BufferedImage water4 = ss.grab(6, 2, 32, 32);

    public static final BufferedImage wall4 = ss.grab(5, 3,32, 32);
    public static final BufferedImage button_wall4 = ss.grab(5, 4, 32, 32);
    public static final BufferedImage button_wall_down4 = ss.grab(10, 4, 32, 32);
    public static final BufferedImage dungeon_wall4 = ss.grab(5, 5, 32, 32);
    public static final BufferedImage dungeon_button_wall4 = ss.grab(5, 6, 32, 32);
    public static final BufferedImage dungeon_button_wall_down4 = ss.grab(10, 6, 32, 32);

    public static final BufferedImage dungeon_floor7 = ss.grab(5, 7, 32 ,32);
    public static final BufferedImage dungeon_floor8 = ss.grab(5, 8, 32, 32);

    // Corruption
    public static final BufferedImage floor17 = ss.grab(7, 2, 32, 32);
    public static final BufferedImage floor18 = ss.grab(8, 2, 32, 32);
    public static final BufferedImage floor19 = ss.grab(9, 2, 32, 32);
    public static final BufferedImage floor20 = ss.grab(10, 2, 32, 32);

    public static final BufferedImage water5 = ss.grab(11, 1, 32, 32);

    public static final BufferedImage wall5 = ss.grab(6, 3,32, 32);
    public static final BufferedImage button_wall5 = ss.grab(6, 4, 32, 32);
    public static final BufferedImage button_wall_down5 = ss.grab(11, 4, 32, 32);
    public static final BufferedImage dungeon_wall5 = ss.grab(6, 5, 32, 32);
    public static final BufferedImage dungeon_button_wall5 = ss.grab(6, 6, 32, 32);
    public static final BufferedImage dungeon_button_wall_down5 = ss.grab(11, 6, 32, 32);

    public static final BufferedImage dungeon_floor9 = ss.grab(6, 7, 32 ,32);
    public static final BufferedImage dungeon_floor10 = ss.grab(6, 8, 32, 32);
}