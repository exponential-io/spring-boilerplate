package io.exponential.app.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Transactional
public class CustomerDaoClass implements CustomerDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Customer> findAll() {
        String sql = "SELECT id, name, age FROM customers";
        return jdbcTemplate.query(sql, new CustomerRowMapper());
    }

}
