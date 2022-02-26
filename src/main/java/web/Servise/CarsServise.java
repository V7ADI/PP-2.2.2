package web.Servise;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsServise {

    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car("Toyota Supra", 1993, 102332));
        carsList.add(new Car("Mitsubishi Lancer Evolution", 2017, 239441));
        carsList.add(new Car("Toyota Mark II Tourer V", 1995, 432343));
        carsList.add(new Car("Mitsubishi Eclipse", 2003, 231344));
        carsList.add(new Car("Nissan Skyline GT-R R34", 1998, 855952));
    }

    public List<Car> getAllCars() {
        return carsList;
    }

    public List<Car> getCarsNumber(int count) {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
