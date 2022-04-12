package com.salt.storygame.Render.Scene.Renderer;

import com.salt.storygame.Render.GameObject.Textures.Textures;
import com.salt.storygame.Render.IO.BufferedImageLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

public class DrawBG {

    private static BufferedImageLoader bufferedImageLoader = new BufferedImageLoader();

    private static BufferedImage hmap = bufferedImageLoader.loadImage("/hmap.png");

    public static void bgLoader(int x, Graphics g) {
        switch (x) {
            case 1 -> forestBG(g);
            case 2 -> volcanoBG(g);
            case 3 -> desertBG(g);
            case 4 -> beachBG(g);
            case 5 -> mountainBG(g);
            case 6 -> caveBG(g);
        }
    }

    public static void forestBG(Graphics g) {
        for (int i = 0; i < 2048; i += 32) {
            for (int j = 0; j < 2048; j += 32) {
                int pixel = hmap.getRGB((i/32), (j/32));
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red <= 65 && blue <= 65 && green <= 85) {
                    g.drawImage(Textures.floor1, i, j, null);
                } else if (red <= 130 && blue <= 130 && green <= 130) {
                    g.drawImage(Textures.floor2, i, j, null);
                } else if (red <= 195 && blue <= 195 && green <= 195) {
                    g.drawImage(Textures.floor3, i, j, null);
                } else if (red <=255 && blue <= 255 && green <= 255) {
                    g.drawImage(Textures.floor4, i, j, null);
                }
            }
        }
    }

    public static void volcanoBG(Graphics g) {
        for (int i = 0; i < 2048; i += 32) {
            for (int j = 0; j < 2048; j += 32) {
                int pixel = hmap.getRGB(i/32, j/32);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red <= 65 && blue <= 65 && green <= 85) {
                    g.drawImage(Textures.floor13, i, j, null);
                } else if (red <= 130 && blue <= 130 && green <= 130) {
                    g.drawImage(Textures.floor14, i, j, null);
                } else if (red <= 195 && blue <= 195 && green <= 195) {
                    g.drawImage(Textures.floor15, i, j, null);
                } else if (red <=255 && blue <= 255 && green <= 255) {
                    g.drawImage(Textures.floor16, i, j, null);
                }
            }
        }
    }

    public static void desertBG(Graphics g) {
        for (int i = 0; i < 2048; i += 32) {
            for (int j = 0; j < 2048; j += 32) {
                int pixel = hmap.getRGB(i/32, j/32);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red <= 65 && blue <= 65 && green <= 85) {
                    g.drawImage(Textures.floor9, i, j, null);
                } else if (red <= 130 && blue <= 130 && green <= 130) {
                    g.drawImage(Textures.floor10, i, j, null);
                } else if (red <= 195 && blue <= 195 && green <= 195) {
                    g.drawImage(Textures.floor11, i, j, null);
                } else if (red <=255 && blue <= 255 && green <= 255) {
                    g.drawImage(Textures.floor12, i, j, null);
                }
            }
        }
    }

    public static void beachBG(Graphics g) {
        for (int i = 0; i < 2048; i += 32) {
            for (int j = 0; j < 2048; j += 32) {
                int pixel = hmap.getRGB(i/32, j/32);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red <= 65 && blue <= 65 && green <= 85) {
                    g.drawImage(Textures.floor9, i, j, null);
                } else if (red <= 130 && blue <= 130 && green <= 130) {
                    g.drawImage(Textures.floor10, i, j, null);
                } else if (red <= 195 && blue <= 195 && green <= 195) {
                    g.drawImage(Textures.floor11, i, j, null);
                } else if (red <=255 && blue <= 255 && green <= 255) {
                    g.drawImage(Textures.floor12, i, j, null);
                }
            }
        }
    }

    public static void mountainBG(Graphics g) {
        for (int i = 0; i < 2048; i += 32) {
            for (int j = 0; j < 2048; j += 32) {
                int pixel = hmap.getRGB(i/32, j/32);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red <= 65 && blue <= 65 && green <= 85) {
                    g.drawImage(Textures.floor5, i, j, null);
                } else if (red <= 130 && blue <= 130 && green <= 130) {
                    g.drawImage(Textures.floor6, i, j, null);
                } else if (red <= 195 && blue <= 195 && green <= 195) {
                    g.drawImage(Textures.floor7, i, j, null);
                } else if (red <=255 && blue <= 255 && green <= 255) {
                    g.drawImage(Textures.floor8, i, j, null);
                }
            }
        }
    }

    public static void caveBG(Graphics g) {
        for (int i = 0; i < 2048; i += 32) {
            for (int j = 0; j < 2048; j += 32) {
                int pixel = hmap.getRGB(i/32, j/32);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red <= 65 && blue <= 65 && green <= 85) {
                    g.drawImage(Textures.floor13, i, j, null);
                } else if (red <= 130 && blue <= 130 && green <= 130) {
                    g.drawImage(Textures.floor14, i, j, null);
                } else if (red <= 195 && blue <= 195 && green <= 195) {
                    g.drawImage(Textures.floor15, i, j, null);
                } else if (red <=255 && blue <= 255 && green <= 255) {
                    g.drawImage(Textures.floor16, i, j, null);
                }
            }
        }
    }
}
