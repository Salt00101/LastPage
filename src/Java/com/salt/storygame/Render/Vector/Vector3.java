package com.salt.storygame.Render.Vector;

import java.util.Objects;

public class Vector3 <T> {
    protected T x, y, z;

    public Vector3(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public T getZ() {
        return z;
    }

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    public void setZ(T z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector3)) return false;
        Vector3<?> vector3 = (Vector3<?>) o;
        return getX().equals(vector3.getX()) && getY().equals(vector3.getY()) && getZ().equals(vector3.getZ());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getZ());
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
}
