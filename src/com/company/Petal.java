package com.company;

public class Petal {

    private Color color;

    public Petal() {
    }

    public Petal(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Petal petal = (Petal) o;

        return color == petal.color;
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Petal{" +
                "color=" + color +
                '}';
    }
}
