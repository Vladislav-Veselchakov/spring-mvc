package web.dao;

import model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> carList;
    private final int size;
    {
        carList = new ArrayList<>();
        carList.add(new Car("BMV", "for mother fuckers", 1111));
        carList.add(new Car("Mers", "fuckers", 2222));
        carList.add(new Car("UAZ", "workers", 3333));
        carList.add(new Car("Mazda", "women", 4444));
        carList.add(new Car("Aist", "children", 5555));
        size = carList.size();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Car> listCars() {
        return carList;
    }

    @Override
    public List<Car> listCarsByCount(int count) {
        return carList.subList(0, count);
    }

    @Override
    public int getSize() {
        return size;
    }
}


