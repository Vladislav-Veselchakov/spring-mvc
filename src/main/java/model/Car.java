package model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String TypeOfOwner;
    private Integer cost;

    public Car() {
    }

    public Car(String model, String typeOfOwner, Integer cost) {
        this.model = model;
        TypeOfOwner = typeOfOwner;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeOfOwner() {
        return TypeOfOwner;
    }

    public void setTypeOfOwner(String typeOfOwner) {
        TypeOfOwner = typeOfOwner;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
