package by.epam.javast.kazlova.project2.service;

import by.epam.javast.kazlova.project2.beans.Point;
import by.epam.javast.kazlova.project2.beans.Triangle;
import by.epam.javast.kazlova.project2.beans.TriangleLogic;
import by.epam.javast.kazlova.project2.dao.Validator;

import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TriangleServiceImpl implements TriangleService{

   // private static final Logger logger = LogManager.getLogger();
    private static final TriangleLogic triangleLogic=new TriangleLogic();
    private static final Validator validator=new Validator();

    @Override
    public List<Triangle> createTriangles() {
        List<Point> points =validator.makeValidData();
        for(Point cur: points){
            ///
        }
        return null;
    }

    @Override
    public boolean isTriangle(Triangle triangle) {
        return triangleLogic.isTriangle(triangle);
    }

    @Override
    public double triangleSquare(Triangle triangle) {
        return triangleLogic.countSquare(triangle);
    }

    @Override
    public double trianglePerimeter(Triangle triangle) {
        return triangleLogic.countPerimeter(triangle);
    }

    @Override
    public boolean isIsosceles(Triangle triangle) {
        return triangleLogic.isIsosceles(triangle);
    }

    @Override
    public boolean isEquilateral(Triangle triangle) {
        return triangleLogic.isEquilateral(triangle);
    }

    @Override
    public boolean isRight(Triangle triangle) {
        return triangleLogic.isRight(triangle);
    }
}
