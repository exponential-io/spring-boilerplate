package io.exponential.app.cars;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarRowMapper implements RowMapper {
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Car car = new Car();
        car.setId(rs.getLong("id"));
        car.setMake(rs.getString("make"));
        car.setModel(rs.getString("model"));
        return car;
    }
}
