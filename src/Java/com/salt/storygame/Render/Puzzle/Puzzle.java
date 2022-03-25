package com.salt.storygame.Render.Puzzle;

import com.salt.storygame.Render.GameObject.GameObject;
import com.salt.storygame.Render.GameObject.GameObjects.Door;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;
import com.salt.storygame.Render.Utils.IGameObjectHandler;

public class Puzzle {
    public int count = 0;
    private int max;
    private boolean state = false;
    IGameObjectHandler handler;

    public Puzzle(int max, IGameObjectHandler handler) {
        this.max = max;
        this.handler = handler;
    }

    public void check() {
        if (count == max) {
            state = true;
        }

        if (state) {
            for (GameObject obj : handler.gameObjects) {
                if (obj.getId() == ID.Door) {
                    obj.state = false;
                }
            }
        }
    }
}
