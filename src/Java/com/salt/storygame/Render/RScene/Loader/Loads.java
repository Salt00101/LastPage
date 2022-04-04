package com.salt.storygame.Render.RScene.Loader;

import com.salt.storygame.Render.GameObject.GameObjects.*;
import com.salt.storygame.Render.GameObject.Textures.Textures;
import com.salt.storygame.Render.IO.BufferedImageLoader;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;
import com.salt.storygame.Render.Utils.IGameObjectHandler;
import com.salt.storygame.Render.org.Chunk;

import java.awt.image.BufferedImage;

import static com.salt.storygame.Render.org.Chunk.*;

public class Loads {
    static BufferedImageLoader bil = new BufferedImageLoader();
    public static void load(int i, IGameObjectHandler handler) {
        switch (i) {
            case -1 -> sample(handler);
            case 1 -> spawn(handler);
            case 2 -> northT(handler);
            case 3 -> northWestCorridor(handler);
            case 4 -> forestVillage(handler);
            case 5 -> forestEntrance(handler);
            case 6 -> forest(handler);
            case 7 -> westCorridor(handler);
            case 8 -> westTurn(handler);
            case 9 -> volcanoVillage(handler);
            case 10 -> volcanoEntrance(handler);
            case 11 -> volcano(handler);
            case 12 -> eastCorridor(handler);
            case 13 -> desertVillage(handler);
            case 14 -> desertEntrance(handler);
            case 15 -> desert(handler);
            case 16 -> southCorridor(handler);
            case 17 -> southT(handler);
            case 18 -> southEastCorridor(handler);
            case 19 -> beachVillage(handler);
            case 20 -> connectingPath(handler);
            case 21 -> beachEntrance(handler);
            case 22 -> beachEdge(handler);
            case 23 -> beachOcean(handler);
            case 24 -> northEastTurn(handler);
            case 25 -> mountainVillage(handler);
            case 26 -> mountainEntrance(handler);
            case 27 -> mountain(handler);
            case 28 -> laboratory(handler);
            case 29 -> southWestTurn(handler);
            case 30 -> caveOpening(handler);
            case 31 -> caveEntrance1(handler);
            case 32 -> caveEntrance2(handler);
            case 33 -> caves(handler);
        }
    }

    private static void sample(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = bil.loadImage("/sampl.png").getWidth();
        int h = bil.loadImage("/sampl.png").getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = bil.loadImage("/sampl.png").getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void mountainVillage(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = MOUNTAIN_VILLAGE.getWidth();
        int h = MOUNTAIN_VILLAGE.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = MOUNTAIN_VILLAGE.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void mountainEntrance(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = MOUNTAIN_ENTRANCE.getWidth();
        int h = MOUNTAIN_ENTRANCE.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = MOUNTAIN_ENTRANCE.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void mountain(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = MOUNTAIN.getWidth();
        int h = MOUNTAIN.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = MOUNTAIN.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void forest(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = FOREST.getWidth();
        int h = FOREST.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = FOREST.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void forestEntrance(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = FOREST_ENTRANCE.getWidth();
        int h = FOREST_ENTRANCE.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = FOREST_ENTRANCE.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void forestVillage(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = FOREST_VILLAGE.getWidth();
        int h = FOREST_VILLAGE.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = FOREST_VILLAGE.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void northWestCorridor(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = NW_C.getWidth();
        int h = NW_C.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = NW_C.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void northT(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = N_T.getWidth();
        int h = N_T.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = N_T.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void northEastTurn(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = NE_R.getWidth();
        int h = NE_R.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = NE_R.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void westTurn(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = W_R.getWidth();
        int h = W_R.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = W_R.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void westCorridor(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = W_C.getWidth();
        int h = W_C.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = W_C.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void spawn(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = SPAWN.getWidth();
        int h = SPAWN.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = SPAWN.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void eastCorridor(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = E_C.getWidth();
        int h = E_C.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = E_C.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void desertVillage(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = DESERT_VILLAGE.getWidth();
        int h = DESERT_VILLAGE.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = DESERT_VILLAGE.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void desertEntrance(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = DESERT_ENTRANCE.getWidth();
        int h = DESERT_ENTRANCE.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = DESERT_ENTRANCE.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void desert(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = DESERT.getWidth();
        int h = DESERT.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = DESERT.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void volcano(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = VOLCANO.getWidth();
        int h = VOLCANO.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = VOLCANO.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void volcanoEntrance(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = VOLCANO_ENTRANCE.getWidth();
        int h = VOLCANO_ENTRANCE.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = VOLCANO_ENTRANCE.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void volcanoVillage(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = VOLCANO_VILLAGE.getWidth();
        int h = VOLCANO_VILLAGE.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = VOLCANO_VILLAGE.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void southCorridor(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = S_C.getWidth();
        int h = S_C.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = S_C.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void connectingPath(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = PATH_D_B.getWidth();
        int h = PATH_D_B.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = PATH_D_B.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void southWestTurn(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = SW_R.getWidth();
        int h = SW_R.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = SW_R.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void southT(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = S_T.getWidth();
        int h = S_T.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = S_T.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void southEastCorridor(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = SE_C.getWidth();
        int h = SE_C.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = SE_C.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void beachVillage(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = BEACH_VILLAGE.getWidth();
        int h = BEACH_VILLAGE.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = BEACH_VILLAGE.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void beachEntrance(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = BEACH_ENTRANCE.getWidth();
        int h = BEACH_ENTRANCE.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = BEACH_ENTRANCE.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void beachEdge(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = BEACH_EDGE.getWidth();
        int h = BEACH_EDGE.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = BEACH_EDGE.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void caves(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = CAVES.getWidth();
        int h = CAVES.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = CAVES.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void caveEntrance1(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = CAVES_ENTRANCE_1.getWidth();
        int h = CAVES_ENTRANCE_1.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = CAVES_ENTRANCE_1.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void caveEntrance2(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = CAVES_ENTRANCE_2.getWidth();
        int h = CAVES_ENTRANCE_2.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = CAVES_ENTRANCE_2.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void caveOpening(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = CAVES_OPENING.getWidth();
        int h = CAVES_OPENING.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = CAVES_OPENING.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void laboratory(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = LAB.getWidth();
        int h = LAB.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = LAB.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }

    private static void beachOcean(IGameObjectHandler handler) {
        handler.destroy();
        // Load level based on img
        int w = BEACH_OCEAN.getWidth();
        int h = BEACH_OCEAN.getHeight();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int pixel = BEACH_OCEAN.getRGB(i, j);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
                if (red == 255 && green == 0 && blue == 0) {
                    handler.add(new Border(i*32, j*32, 32, 32, ID.Border, Textures.border, ' '));
                } if (red == 255 && blue == 0 && green == 255) {
                    handler.add(new Block(i*32, j*32, 32, 32, ID.Block, Textures.wall1, ' '));
                } if (red == 0 && blue == 255 && green == 0) {
                    handler.add(new Player(i*32, j*32, 32, 32, ID.Player, handler, null, ' '));
                } if (red == 0 && green == 255 && blue == 0) {
                    handler.add(new Button(i*32, j*32, 32, 32, ID.Button, null, Textures.button_wall1, Textures.button_wall2, ' '));
                } if (red == 0 && green == 255 && blue == 255) {
                    handler.add(new Door(i*32, j*32, 32, 32, ID.Door, Textures.wall1, Textures.NULL, ' '));
                }
            }
        }
    }
}
