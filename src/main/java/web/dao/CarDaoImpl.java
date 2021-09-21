package web.dao;

import model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{
    @Override
    @SuppressWarnings("unchecked")
    public List<Car> ListCars() {
        List<Car> lst = new ArrayList<>();
        Car car1 = new Car("BMV", "for mother fuckers", 1111);
        Car car2 = new Car("Mers", "fuckers", 2222);
        Car car3 = new Car("UAZ", "workers", 3333);
        Car car4 = new Car("zhiguli", "normal peoples", 4444);
        Car car5 = new Car("Mazda", "women", 5555);
        Car car6 = new Car("gay", "homosec", 6666);
        Car car7 = new Car("Aist", "childeren", 7777);
        lst.add(car1);
        lst.add(car2);
        lst.add(car3);
        lst.add(car4);
        lst.add(car5);
        lst.add(car6);
        lst.add(car7);
        return lst;

    }
}
