package by.epam.javast.kazlova.project2.service;

import by.epam.javast.kazlova.project2.beans.Point;
import by.epam.javast.kazlova.project2.beans.Triangle;

import java.util.List;

public interface TriangleService {
    List<Triangle> createTriangles();

    boolean isTriangle(Triangle triangle);

    double triangleSquare(Triangle triangle);

    double trianglePerimeter(Triangle triangle);

    boolean  isIsosceles(Triangle triangle);

    boolean isEquilateral(Triangle triangle);

    boolean isRight(Triangle triangle);

}
