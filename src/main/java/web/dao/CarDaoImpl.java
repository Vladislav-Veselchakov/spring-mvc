package web.dao;

import model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car("BMV", "for mother fuckers", 1111));
        carList.add(new Car("Mers", "fuckers", 2222));
        carList.add(new Car("UAZ", "workers", 3333));
        carList.add(new Car("Mazda", "women", 4444));
        carList.add(new Car("Aist", "children", 5555));
    }

    @Override
    public List<Car> getAll(int count) {
        return (count == -1) ? carList : carList.stream().limit(count).collect(Collectors.toList());
    }
}


