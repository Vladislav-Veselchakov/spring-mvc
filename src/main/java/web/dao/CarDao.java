package web.dao;

import model.Car;
import java.util.List;

public interface CarDao {
    List<Car> listCars();
    List<Car> listCarsByCount(int count);
    int getSize();
}
