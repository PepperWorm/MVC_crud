package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.Collections;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            count = 5;
            return carDao.getCars(count);
        } else if (count <= 0) {
            return Collections.emptyList();
        } else {
            return carDao.getCars(count);
        }
    }
}
