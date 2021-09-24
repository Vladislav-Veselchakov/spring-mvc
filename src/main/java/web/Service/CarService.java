package web.Service;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAll(int count);
}
