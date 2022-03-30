package com.salt.storygame.Render.IO;

import com.salt.storygame.Render.GameObject.Camera;
import com.salt.storygame.Render.GameObject.GameObject;
import com.salt.storygame.Render.GameObject.GameObjects.Player;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;
import com.salt.storygame.Render.Utils.IGameObjectHandler;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseInput extends MouseAdapter {

    Camera camera;
    IGameObjectHandler handler;

    public MouseInput(Camera camera, IGameObjectHandler handler) {
        this.camera = camera;
        this.handler = handler;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int mx = (int) (e.getX() + camera.getX());
        int my = (int) (e.getY() + camera.getY());

        Player player = null;

        for (GameObject obj : handler.gameObjects) {
            if (obj.getId() == ID.Player) {
                player = (Player) obj;
            }
        }

        for (GameObject obj : handler.gameObjects) {
            if (obj.getId() == ID.Button) {
                if (obj.getBounds().contains(mx, my) && (Math.abs(player.getX() - obj.getX()) <= 2) && (Math.abs(player.getY() - obj.getY()) <= 2)) {
                    obj.action();
                }
            }
        }
    }
}
