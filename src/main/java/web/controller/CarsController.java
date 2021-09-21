package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.Service.CarService;
import web.config.WebConfig;
import web.dao.CarDao;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    CarService service;

    @GetMapping(value = "/cars")
    public String printWelcomeCars(ModelMap model) {
        List<String> messages = new ArrayList<>();


        List<Car> lstCars = service.getCarsByCount(3);
//        messages.add(lstCars.get(0).getModel());
//        messages.add(lstCars.get(1).getModel());
//        messages.add("1.0 version by sep'21 ");
        model.addAttribute("cars", lstCars);
        return "cars";
    }


// url: http://localhost:8080/manager/html
//	Но перед этим пришлось в файле tomcat-users.xml вписать:
//<role rolename="manager-gui"/>
//<user username="tomcat" password="s3cret" roles="manager-gui"/>
// on site
// https://helpcontext.ru/questions/25999/intellij-tomcat-pokazyvaet-404-pri-zapuske

}