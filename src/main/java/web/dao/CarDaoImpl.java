package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Vedrover", "parketnik", 2023));
        cars.add(new Car("Auto Zak", "mobile jail", 2022));
        cars.add(new Car("Smazda", "liftback", 2007));
        cars.add(new Car("Bukhanka", "minivan", 1970));
        cars.add(new Car("Lada 99", "transformer supercar", 5087));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
