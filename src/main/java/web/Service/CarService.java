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

    public List<Car> getCarsByCount(int count) {
        return (List<Car>) carDao.ListCars().subList(0, count);
    }
}
