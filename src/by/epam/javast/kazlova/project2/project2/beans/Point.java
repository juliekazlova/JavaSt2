package by.epam.javast.kazlova.project2.beans;

import java.util.Objects;

public class Point {
    private int cordinateX;
    private int cordinateY;

    public Point(int cordinateX, int cordinateY) {
        this.cordinateX = cordinateX;
        this.cordinateY = cordinateY;
    }

    public int getCordinateX() {
        return cordinateX;
    }

    public void setCordinateX(int cordinateX) {
        this.cordinateX = cordinateX;
    }

    public int getCordinateY() {
        return cordinateY;
    }

    public void setCordinateY(int cordinateY) {
        this.cordinateY = cordinateY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return getCordinateX() == point.getCordinateX() &&
                getCordinateY() == point.getCordinateY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCordinateX(), getCordinateY());
    }

    @Override
    public String toString() {
        return "Point{" +
                "cordinateX=" + cordinateX +
                ", cordinateY=" + cordinateY +
                '}';
    }
}
