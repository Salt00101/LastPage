package com.salt.storygame.Render.RScene.Loader;

import com.salt.storygame.Render.GameObject.GameObjects.*;
import com.salt.storygame.Render.GameObject.Textures.Textures;
import com.salt.storygame.Render.IO.BufferedImageLoader;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;
import com.salt.storygame.Render.Utils.IGameObjectHandler;

import java.awt.image.BufferedImage;

public class Loads {
    static BufferedImageLoader bil = new BufferedImageLoader();
    public static void load(int i, IGameObjectHandler handler) {
        switch(i) {
            case -1:
                sample(handler);
                break;

            case 0:
                spawn(handler);
                break;
        }
    }

    private static void sample(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void spawn(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void northT(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void northWestC(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void forestVillage(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void forestEntrance(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void forest(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void northEastR(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void mountainVillage(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void mountainEntrance(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void mountain(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void eastC(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void eastR(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void volcanoVillage(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void volcanoEntrance(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void volcano(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void westC(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void desertVillage(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void desertEntrance(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void desert(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void villagePath(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void southC(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void southT(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void southEastC(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void beachVillage(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void beachEntrance(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void beachSand(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void beachOcean(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void southWestR(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void cavesVillage(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void cavesRouteOne(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void cavesEntrance(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }

    private static void caves(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        int c = 1;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, c));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, c));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, c));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, c));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, c));
                }
                c++;
            }
        }
    }
}
