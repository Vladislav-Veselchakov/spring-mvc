package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String printWelcomeCars(@RequestParam(name = "count", required = false) Integer count, ModelMap model) {
        List<Car> lstCars = null;
        if(count == null) {
            lstCars = service.listCars();
        } else if(count >= service.getSize() || count < 0) {
            lstCars = service.listCars();
        } else {
            lstCars = service.listCarsByCount(count);
        }

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