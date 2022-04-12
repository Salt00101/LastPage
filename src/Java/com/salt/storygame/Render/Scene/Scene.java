package com.salt.storygame.Render.Scene;

import com.salt.storygame.Render.Scene.Loader.Loads;
import com.salt.storygame.Render.Scene.Renderer.DrawBG;
import com.salt.storygame.Render.Utils.IGameObjectHandler;

import java.awt.*;

public class Scene {

    IGameObjectHandler handler;

    public Scene(IGameObjectHandler handler) {
        this.handler = handler;

        Loads.load(1, handler);
    }

    public void Draw(Graphics g) {
        //Background
        DrawBG.bgLoader(1, g);

        //Object
        handler.render(g);

    }
}
