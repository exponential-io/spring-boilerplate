package io.exponential.app.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    JdbcTemplate jdbcTemplate;

//    @Autowired
//    CustomerDaoClass customerDaoClass;

    @Autowired
    CustomerDao customerDao;

    /**
     * Get all customers
     * @return List of customers
     */
    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers() {
        List<Customer> results = jdbcTemplate.query(
                "SELECT id, name, age FROM customers",
                new RowMapper<Customer>() {
                    @Override
                    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                        return new Customer(rs.getLong("id"),rs.getString("name"), rs.getInt("age"));
                    }
                }
        );

        return results;
    }

    @RequestMapping(value = "/customersx", method = RequestMethod.GET)
    public List<Customer> getCustomersX() {
        return customerDao.findAll();
//        return customerDaoClass.findAll();
    }

    /*
        Read by id
     */
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable("id") int id) {
        String sql = "SELECT id, name, age FROM customers WHERE id = ?";
        Customer customer = (Customer)jdbcTemplate.queryForObject(
                sql, new Object[] { id }, new CustomerRowMapper()
        );

        return customer;
    }

//    @RequestMapping(value = "/customers", method = RequestMethod.GET)
//    public int getCustomers() {
//        int rowCount = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM customers", Integer.class);
//        return rowCount;
//
////        Customer customer = jdbcTemplate.query("SELECT id, name, age FROM customers WHERE id = 1");
////        List<Customer> results = jdbcTemplate.query(
////                "SELECT id, name, age FROM customers",
////                new Object[]{"Josh"},
////                CustomerRowMapper
////        );
////
////        System.out.println(results.toString());
////        return "Hi buddy";
//    }

    /**
     * CREATE TABLE VIA POST
     */
    @RequestMapping(value = "/xxx", method = RequestMethod.POST)
    public void createXxxTable() {
        jdbcTemplate.execute("CREATE TABLE xxx(id serial)");
    }

}
