package pl.javaZMarcinem.models;

public class Car {
    private final String brand;
    private String engine;
    private String tyre;
    private int wheelSize;

    public Car(String brand, String engine, String tyre, int wheelSize) {
        this.brand = brand;
        this.engine = engine;
        this.tyre = tyre;
        this.wheelSize = wheelSize;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine='" + engine + '\'' +
                ", tyre='" + tyre + '\'' +
                ", wheelSize=" + wheelSize +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }
    public boolean isWheelSizeBiggerThan(Car source){
        return this.wheelSize > source.getWheelSize();
    }
}
