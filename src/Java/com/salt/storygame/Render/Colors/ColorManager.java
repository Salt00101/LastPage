package com.salt.storygame.Render.Colors;

import java.awt.*;
import java.awt.color.ColorSpace;

public class ColorManager extends Color {
    public static final Color white         = new Color(255, 255, 255);
    public static final Color WHITE = white;
    public static final Color lightGray     = new Color(192, 192, 192);
    public static final Color LIGHT_GRAY = lightGray;
    public static final Color gray          = new Color(128, 128, 128);
    public static final Color GRAY = gray;
    public static final Color darkGray      = new Color(64, 64, 64);
    public static final Color DARK_GRAY = darkGray;
    public static final Color black         = new Color(0, 0, 0);
    public static final Color BLACK = black;
    public static final Color red           = new Color(255, 0, 0);
    public static final Color RED = red;
    public static final Color maroon        = new Color(123, 0, 0);
    public static final Color MAROON = maroon;
    public static final Color pink          = new Color(255, 196, 196);
    public static final Color PINK = pink;
    public static final Color orange        = new Color(255, 162, 0);
    public static final Color ORANGE = orange;
    public static final Color darkOrange=   new Color(255, 81, 0);
    public static final Color DARK_ORANGE = darkOrange;
    public static final Color yellow        = new Color(255, 255, 0);
    public static final Color YELLOW = yellow;
    public static final Color green         = new Color(0, 255, 0);
    public static final Color GREEN = green;
    public static final Color darkGreen     = new Color(0, 100, 0);
    public static final Color DARK_GREEN = darkGreen;
    public static final Color magenta       = new Color(255, 0, 255);
    public static final Color MAGENTA = magenta;
    public static final Color purple        = new Color(150, 0, 255);
    public static final Color PURPLE = purple;
    public static final Color blue          = new Color(0, 0, 255);
    public static final Color BLUE = blue;
    public static final Color cyan          = new Color(0, 255, 255);
    public static final Color CYAN = cyan;
    public static final Color ocean         = new Color(87, 129, 252);
    public static final Color OCEAN = ocean;

    public ColorManager(int r, int g, int b) {
        super(r, g, b);
    }

    public ColorManager(int r, int g, int b, int a) {
        super(r, g, b, a);
    }

    public ColorManager(int rgb) {
        super(rgb);
    }

    public ColorManager(int rgba, boolean hasalpha) {
        super(rgba, hasalpha);
    }

    public ColorManager(float r, float g, float b) {
        super(r, g, b);
    }

    public ColorManager(float r, float g, float b, float a) {
        super(r, g, b, a);
    }

    public ColorManager(ColorSpace cspace, float[] components, float alpha) {
        super(cspace, components, alpha);
    }
}
