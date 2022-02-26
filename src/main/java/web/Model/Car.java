package web.Model;

import java.util.Objects;

public class Car {
    private String carModel;
    private int age;
    private int gosNumber;

    public Car(String carModel, int age, int gosNumber) {
        this.carModel = carModel;
        this.age = age;
        this.gosNumber = gosNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGosNumber() {
        return gosNumber;
    }

    public void setGosNumber(int gosNumber) {
        this.gosNumber = gosNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age && gosNumber == car.gosNumber && Objects.equals(carModel, car.carModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carModel, age, gosNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", age=" + age +
                ", gosNumber=" + gosNumber +
                '}';
    }
}
