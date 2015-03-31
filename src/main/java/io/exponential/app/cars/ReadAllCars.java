package io.exponential.app.cars;

import io.exponential.app.customers.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReadAllCars {

    @Autowired
    JdbcTemplate jdbc;

    @Autowired
    CarDao carDao;

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public List<Car> readAllCars() {

        return carDao.readAll();
    }

}
