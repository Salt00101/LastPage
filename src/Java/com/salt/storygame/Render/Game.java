package com.salt.storygame.Render;

import com.salt.storygame.Render.GameObject.Camera;
import com.salt.storygame.Render.GameObject.GameObject;
import com.salt.storygame.Render.GameObject.GameObjects.*;
import com.salt.storygame.Render.GameObject.GameObjects.Button;
import com.salt.storygame.Render.GameObject.Textures.Textures;
import com.salt.storygame.Render.IO.BufferedImageLoader;
import com.salt.storygame.Render.IO.KeyInput;
import com.salt.storygame.Render.IO.MouseInput;
import com.salt.storygame.Render.IO.SpriteSheet;
import com.salt.storygame.Render.ObjList.IEnumerableID.ID;
import com.salt.storygame.Render.Puzzle.Puzzle;
import com.salt.storygame.Render.Utils.IGameObjectHandler;
import com.salt.storygame.Render.org.Chunk;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game extends Canvas implements Runnable {

    private static final long serialVersionUID = 1L;

    private boolean isRunning = false;
    private Thread thread;

    private IGameObjectHandler handler;

    private Camera camera;

    Puzzle puzzle;

    private BufferedImage level;
    private BufferedImage spriteSheet;

    public Game() {
        // Creation of window
        new Window(1000,563,"Last Page", this);

        // Creation of handler and camera
        handler = new IGameObjectHandler();
        camera = new Camera(0f, 0f);

        // Initialize Listeners
        this.addKeyListener(new KeyInput(handler));
        this.addMouseListener(new MouseInput(camera, handler));

        // Start game
        start();
    }

    private void start() {
        // Start new thread and initialize instance vars
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }

    private void kill() {
        // Kill thread
        isRunning = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        // get delta time and fps counters using 60 ticks
        this.requestFocus();

        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        int updates = 0;
        while (isRunning) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                tick();
                updates++;
                delta--;
            }
            render();
            frames++;
            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.printf("FPS: %d, TPS: %d%n", frames, updates);
                frames = 0;
                updates = 0;
            }
        }
        kill();
    }

    public void tick() {
        // Camera change tick
        for (GameObject obj : handler.gameObjects) {
            if (obj.getId() == ID.Player) {
                camera.tick(obj);
            }
        }

        // Object change tick
        handler.tick();
    }

    public void render() {
        // Start render and use buffer strategy
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }

        // Draw graphics and convert to 2D
        Graphics g = bs.getDrawGraphics();
        Graphics2D g2D = (Graphics2D) g;

        //////////////////////////////// Draw Space Start

        g2D.translate(-camera.getX(), -camera.getY());

        //insert loader here

        g2D.translate(camera.getX(), camera.getY());

        //////////////////////////////// Draw Space End

        // Render all loaded buffers
        g.dispose();
        bs.show();
    }

    public static void main(String[] args) {
        new Game();
    }
}
