package pl.javaZMarcinem.excersizes;

import pl.javaZMarcinem.models.Car;

import java.util.List;

public class CatchCarList {
    public void printCars(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public void printCars(Car[] table) {
        for (Car car : table) {
            System.out.println(car);
        }
    }

    public void printOneCar(List<Car> cars) {
        printOneCar(cars, 0);
    }

    public void printOneCar(List<Car> cars, int index) {
        if (index >= cars.size()) return;

        Car car = cars.get(index);
        System.out.println(car);
        printOneCar(cars, ++index);
    }
}