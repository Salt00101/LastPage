package com.salt.storygame.Render.IO;

import com.salt.storygame.Render.Game;
import com.salt.storygame.Render.GameObject.GameObject;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;
import com.salt.storygame.Render.Utils.IGameObjectHandler;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    IGameObjectHandler handler;

    public KeyInput(IGameObjectHandler handler) {
        this.handler = handler;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        for (GameObject i : handler.gameObjects) {
            if (i.getId() == ID.Player) {
                // WASD input handler
                if (key == KeyEvent.VK_W) {
                    handler.setUp(true);
                }

                if (key == KeyEvent.VK_S) {
                    handler.setDown(true);
                }

                if (key == KeyEvent.VK_A) {
                    handler.setLeft(true);
                }

                if (key == KeyEvent.VK_D) {
                    handler.setRight(true);
                }


                // UDLR input handler

                if (key == KeyEvent.VK_UP) {
                    handler.setUp(true);
                }

                if (key == KeyEvent.VK_DOWN) {
                    handler.setDown(true);
                }

                if (key == KeyEvent.VK_LEFT) {
                    handler.setLeft(true);
                }

                if (key == KeyEvent.VK_RIGHT) {
                    handler.setRight(true);
                }

                if (key == KeyEvent.VK_ESCAPE) {
                    System.exit(0);
                }
            }
        }
    }



    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        for (GameObject i : handler.gameObjects) {
            if (i.getId() == ID.Player) {
                // WASD input handler
                if (key == KeyEvent.VK_W) {
                    handler.setUp(false);
                }

                if (key == KeyEvent.VK_S) {
                    handler.setDown(false);
                }

                if (key == KeyEvent.VK_A) {
                    handler.setLeft(false);
                }

                if (key == KeyEvent.VK_D) {
                    handler.setRight(false);
                }


                // UDLR input handler

                if (key == KeyEvent.VK_UP) {
                    handler.setUp(false);
                }

                if (key == KeyEvent.VK_DOWN) {
                    handler.setDown(false);
                }

                if (key == KeyEvent.VK_LEFT) {
                    handler.setLeft(false);
                }

                if (key == KeyEvent.VK_RIGHT) {
                    handler.setRight(false);
                }
            }
        }
    }
}
