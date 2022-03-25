package com.salt.storygame.Render.IO;

import com.salt.storygame.Render.GameObject.Camera;
import com.salt.storygame.Render.GameObject.GameObject;
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
    }
}
