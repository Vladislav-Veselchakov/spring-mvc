package web.dao;

import model.Car;
import java.util.List;

public interface CarDao {
    List<Car> getAll(int count);
}
