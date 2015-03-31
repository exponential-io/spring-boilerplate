package io.exponential.app.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CarDaoPostgresql implements CarDao {

    @Autowired
    JdbcTemplate jdbc;

    @Override
    public List<Car> readAll() {
        String sql = "SELECT id, make, model FROM cars";
        return jdbc.query(sql, new CarRowMapper());
    }

}
