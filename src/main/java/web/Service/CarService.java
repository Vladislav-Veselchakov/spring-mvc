package web.Service;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    @Autowired
    CarDao carDao;

    public List<Car> listCars() {
        return carDao.listCars();
    }

    public List<Car> listCarsByCount(int count) {
        return carDao.listCarsByCount(count);
    }

    public int getSize() {
        return carDao.getSize();
    }
}
