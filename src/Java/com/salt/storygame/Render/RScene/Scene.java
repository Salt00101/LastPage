package com.salt.storygame.Render.RScene;

import com.salt.storygame.Render.GameObject.GameObjects.*;
import com.salt.storygame.Render.GameObject.GameObjects.Button;
import com.salt.storygame.Render.GameObject.Textures.Textures;
import com.salt.storygame.Render.IO.BufferedImageLoader;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;
import com.salt.storygame.Render.Puzzle.Puzzle;
import com.salt.storygame.Render.RScene.Loader.Loads;
import com.salt.storygame.Render.Utils.IGameObjectHandler;
import org.w3c.dom.Text;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Scene {

    IGameObjectHandler handler;

    public Scene(IGameObjectHandler handler) {
        this.handler = handler;

        Loads.load(-1, handler);
    }

    public void Draw(Graphics g) {
        //Background

        handler.render(g);

    }
}
