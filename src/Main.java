import pl.javaZMarcinem.excersizes.CatchCarList;
import pl.javaZMarcinem.excersizes.GenerateCarList;
import pl.javaZMarcinem.excersizes.MethodChain;
import pl.javaZMarcinem.models.Car;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    /**
     * public static void main(String[] args) {
     * Person person = new Person("Piotr","Kociolek","Nowy sacz",20);
     * System.out.println(person);
     * <p>
     * <p>
     * Car ford = new Car("Ford ","2000ccm","pirreli",20);
     * Car fiat = new Car("Fiat ","1100ccm", "zxc",15);
     * Car kia = new Car("Kia ","1200","xyz",16);
     * <p>
     * System.out.println(ford);
     * //System.out.println(fiat);
     * //System.out.println(kia);
     * <p>
     * ford.setWheelSize(15);
     * System.out.println(ford);
     * <p>
     * boolean a = ford.isWheelSizeBiggerThan(kia);
     * System.out.println(a);
     * }
     */

    public static void main(String[] args) {
       /* Car[] garage = new Car[3];
        garage[0] = getNextCar();
        garage[1] = getNextCar();
        garage[2] = getNextCar();

        List<Car> garageList = new ArrayList<>();
        garageList.add(garage[0]);
        garageList.add(garage[1]);
        garageList.add(garage[2]);*/

        /*for (Car x : garageList) {
            System.out.println(x);
        }*/
       /* for (int i = 0; i < garage.length; i++) {
            Car value = garage[i];
            System.out.println(value);
        }*/
      /* int x = 0;
        while(x < garage.length)
        {
            Car var = garage[x];
            System.out.println(var);
            x++;
        }
        do{
            Car var = garage[x];
            System.out.println(var);
            x++;
        }while(x < garage.length);*/
        GenerateCarList list = new GenerateCarList();
        List<Car> cars = list.generateList();

        CatchCarList catchCarList = new CatchCarList();
        catchCarList.printCars(cars);

        Car[] cars1 = list.generateTable();
        catchCarList.printCars(cars1);

        System.out.println("=============================");
        Set<Car> carSet = list.generateSet();
        List<Car> sortedCarList = list.sortCarSet(carSet);
        catchCarList.printCars(sortedCarList);

        MethodChain methodChain = new MethodChain();
        String completeResult = methodChain
                .doSomething()
                .initialize()
                .printValues()
                .complete();

        System.out.println("==================================");
        catchCarList.printOneCar(cars);
    }


    public static Car getNextCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj marke ");
        String brand = scanner.next();
        System.out.println("podaj pojemnosc silnika");
        String engine = scanner.next();
        System.out.println("podaj opony");
        String tyre = scanner.next();
        System.out.println("podaj rozmiar opon");
        int wheelSize = scanner.nextInt();

        Car car = new Car(brand, engine, tyre, wheelSize);
        System.out.println(car);
        return car;
    }

}
