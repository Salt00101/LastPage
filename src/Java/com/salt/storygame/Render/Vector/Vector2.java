package com.salt.storygame.Render.Vector;

import java.util.Objects;

public class Vector2 <T> {
    protected T x, y;

    public Vector2(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector2)) return false;
        Vector2<?> vector2 = (Vector2<?>) o;
        return getX().equals(vector2.getX()) && getY().equals(vector2.getY());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
