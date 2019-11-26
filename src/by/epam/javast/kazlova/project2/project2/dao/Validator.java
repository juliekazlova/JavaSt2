package by.epam.javast.kazlova.project2.dao;

import by.epam.javast.kazlova.project2.beans.Point;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Validator {
    private static final String CUBE_SOURCE = "src\\main\\java\\by\\epam\\web\\unit2\\resourses\\data.txt";
   // static final Logger logger = LogManager.getLogger();
   static  Logger logger;

    public List<Point> makeValidData() {

        List<String> dataList = new ArrayList<>();
        List<Point> pointList = new ArrayList<Point>();
        String[] points;
        String[] koord;

        try {
            dataList = Files.readAllLines(Paths.get(CUBE_SOURCE));
        } catch (IOException e) {
            logger.info("Can't find file!");
        }

        for (String str : dataList) {

            points = str.split("; ");// x1 y1; x2 y2; x3 y3;
            if (points.length == 3) {
                for (int i = 0; i < points.length; i++) {
                    koord = points[i].split(" ");
                    if (koord.length == 2) {
                        int x = Integer.parseInt(koord[0]);
                        int y = Integer.parseInt(koord[1]);
                        pointList.add(new Point(x, y));

                    }

                }
            }
        }
        return pointList;
    }
}
