package by.epam.javast.kazlova.project2.service;
import by.epam.javast.kazlova.project2.validator.Validator;

public class ServiceFactory {

    private static ServiceFactory instance = new ServiceFactory();

    private TriangleService triangleServiceImpl = new TriangleServiceImpl(new Validator());

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public TriangleService getOvalService() {
        return triangleServiceImpl;
    }
}
