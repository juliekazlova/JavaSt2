package by.epam.javast.kazlova.project2.beans;

public class TriangleLogic {
    public double countSquare(Triangle triangle){
        double ab=PointLogic.countLength(triangle.getPointA(), triangle.getPointB());
        double ac=PointLogic.countLength(triangle.getPointA(), triangle.getPointC());
        double cb=PointLogic.countLength(triangle.getPointC(), triangle.getPointB());
        double p=(ab+ac+cb)*0.5;
        double sqare=Math.sqrt(p*(p-ab)*(p-ac)*(p-cb));
        return sqare;
    }

    public double countPerimeter(Triangle triangle){
       double ab=PointLogic.countLength(triangle.getPointA(), triangle.getPointB());
        double ac=PointLogic.countLength(triangle.getPointA(), triangle.getPointC());
        double cb=PointLogic.countLength(triangle.getPointC(), triangle.getPointB());

        return ab+ac+cb;
    }

    public boolean isTriangle(Triangle triangle){
        double ab=PointLogic.countLength(triangle.getPointA(), triangle.getPointB());
        double ac=PointLogic.countLength(triangle.getPointA(), triangle.getPointC());
        double cb=PointLogic.countLength(triangle.getPointC(), triangle.getPointB());

        if(ab+ac>cb&&ab+cb>ac&&ac+cb>ab){
            return true;
        }
        else return false;

    }

    public boolean isRight(Triangle triangle){
        double ab=PointLogic.countLength(triangle.getPointA(), triangle.getPointB());
        double ac=PointLogic.countLength(triangle.getPointA(), triangle.getPointC());
        double cb=PointLogic.countLength(triangle.getPointC(), triangle.getPointB());


        if(ab*ab+ac*ac==cb*cb|ab*ab+cb*cb==ac*ac|ac*ac+cb*cb==ab*ab){
            return true;
        }
        else return false;
    }

    public boolean isIsosceles(Triangle triangle){//равносторонний
        double ab=PointLogic.countLength(triangle.getPointA(), triangle.getPointB());
        double ac=PointLogic.countLength(triangle.getPointA(), triangle.getPointC());
        double cb=PointLogic.countLength(triangle.getPointC(), triangle.getPointB());


        if(ab==ac|ab==cb|ac==cb){
            return true;
        }
        else return false;
    }


    public boolean isEquilateral(Triangle triangle){
        double ab=PointLogic.countLength(triangle.getPointA(), triangle.getPointB());
        double ac=PointLogic.countLength(triangle.getPointA(), triangle.getPointC());
        double cb=PointLogic.countLength(triangle.getPointC(), triangle.getPointB());


        if(ab==ac&&ab==cb){
            return true;
        }
        else return false;
    }
}
