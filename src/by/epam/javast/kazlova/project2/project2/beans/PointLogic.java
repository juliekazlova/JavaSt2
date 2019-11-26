package by.epam.javast.kazlova.project2.beans;

public class PointLogic {
    public static double countLength(Point a, Point b){
        return Math.sqrt(Math.pow(a.getCordinateX()-b.getCordinateX(), 2)+Math.pow(a.getCordinateY()-b.getCordinateY(), 2));
    }
}
