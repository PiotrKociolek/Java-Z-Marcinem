package pl.javaZMarcinem.excersizes;

import pl.javaZMarcinem.models.Car;

import java.util.*;
import java.util.stream.Collectors;

public class GenerateCarList {
    private final Random rng;

    public GenerateCarList() {
        this.rng = new Random();
    }

    public List<Car> generateList() {
        List<Car> carList = new ArrayList<>();
        int random = rng.nextInt(10) + 1; //generuje >0
        for (int i = 0; i < random; i++) {
            Car var = new Car("brand ", "engine ", "tyre ", rng.nextInt(21));
            carList.add(var);
        }

        return carList;
    }

    public Set<Car> generateSet() {
        Set<Car> carList = new HashSet<>();
        int random = rng.nextInt(10) + 1; //generuje >0
        for (int i = 0; i < random; i++) {
            Car var = new Car("brand ", "engine ", "tyre ", rng.nextInt(21));
            carList.add(var);
        }

        return carList;
    }

    //streamy dla setów, list;
    public List<Car> sortCarSet(Set<Car> cars) {
        return cars.stream()
                .filter(car -> car.getWheelSize() > 5)
                .sorted((currentCar, nextCar) -> {
                    if (currentCar.getWheelSize() > nextCar.getWheelSize()) {
                        return 1;
                    } else if (currentCar.getWheelSize() == nextCar.getWheelSize()) {
                        return 0;
                    } else {
                        return -1;
                    }

                })
                .collect(Collectors.toList());
    }

    public Car[] generateTable() {
        int random = rng.nextInt(10) + 1; //generuje >0
        return generateTable(random);
    }

    public Car[] generateTable(int amount) {
        Car[] table = new Car[amount];
        for (int i = 0; i < amount; i++) {
            Car value = new Car("brand ", "engine ", "tyre ", rng.nextInt(21));
            table[i] = value;

        }
        return table;
    }
}
