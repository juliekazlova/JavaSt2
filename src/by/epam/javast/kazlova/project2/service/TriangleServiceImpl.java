package by.epam.javast.kazlova.project2.service;

import by.epam.javast.kazlova.project2.beans.Point;
import by.epam.javast.kazlova.project2.beans.PointLogic;
import by.epam.javast.kazlova.project2.beans.Triangle;
import by.epam.javast.kazlova.project2.validator.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TriangleServiceImpl implements TriangleService{

    //private static final Logger logger = LogManager.getLogger(TriangleServiceImpl.class);
    private Validator validator;

    public TriangleServiceImpl(Validator validator) {
        this.validator = validator;
    }

    @Override
    public List<Triangle> createTriangles() {
        List<Point> points =validator.makeValidData();
        List<Triangle> triangles=new ArrayList<>();
        for(int i=0; i<points.size(); i++){
           Triangle triangle=new Triangle(points.get(i), points.get(++i), points.get(++i));
           if(isTriangle(triangle)){
               triangles.add(triangle);
           }
        }
        return null;
    }

    @Override
    public boolean isTriangle(Triangle triangle) {
        double ab=PointLogic.countLength(triangle.getPointA(), triangle.getPointB());
        double ac=PointLogic.countLength(triangle.getPointA(), triangle.getPointC());
        double cb=PointLogic.countLength(triangle.getPointC(), triangle.getPointB());

        if(ab+ac>cb&&ab+cb>ac&&ac+cb>ab){
            return true;
        }
        else return false;
    }

    @Override
    public double triangleSquare(Triangle triangle) {
        double ab= PointLogic.countLength(triangle.getPointA(), triangle.getPointB());
        double ac=PointLogic.countLength(triangle.getPointA(), triangle.getPointC());
        double cb=PointLogic.countLength(triangle.getPointC(), triangle.getPointB());
        double p=(ab+ac+cb)*0.5;
        double sqare=Math.sqrt(p*(p-ab)*(p-ac)*(p-cb));
        return sqare;
    }

    @Override
    public double trianglePerimeter(Triangle triangle) {
        double ab=PointLogic.countLength(triangle.getPointA(), triangle.getPointB());
        double ac=PointLogic.countLength(triangle.getPointA(), triangle.getPointC());
        double cb=PointLogic.countLength(triangle.getPointC(), triangle.getPointB());

        return ab+ac+cb;
    }

    @Override
    public boolean isIsosceles(Triangle triangle) {
        double ab=PointLogic.countLength(triangle.getPointA(), triangle.getPointB());
        double ac=PointLogic.countLength(triangle.getPointA(), triangle.getPointC());
        double cb=PointLogic.countLength(triangle.getPointC(), triangle.getPointB());


        if(ab==ac|ab==cb|ac==cb){
            return true;
        }
        else return false;
    }

    @Override
    public boolean isEquilateral(Triangle triangle) {
        double ab=PointLogic.countLength(triangle.getPointA(), triangle.getPointB());
        double ac=PointLogic.countLength(triangle.getPointA(), triangle.getPointC());
        double cb=PointLogic.countLength(triangle.getPointC(), triangle.getPointB());


        if(ab==ac&&ab==cb){
            return true;
        }
        else return false;
    }

    @Override
    public boolean isRight(Triangle triangle) {
        double ab=PointLogic.countLength(triangle.getPointA(), triangle.getPointB());
        double ac=PointLogic.countLength(triangle.getPointA(), triangle.getPointC());
        double cb=PointLogic.countLength(triangle.getPointC(), triangle.getPointB());


        if(ab*ab+ac*ac==cb*cb|ab*ab+cb*cb==ac*ac|ac*ac+cb*cb==ab*ab){
            return true;
        }
        else return false;
    }
}
