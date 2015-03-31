//package io.exponential.web.employees;
//
////import java.util.List;
////
////import com.dineshonjava.sdnext.dao.EmpDao;
////import com.dineshonjava.sdnext.domain.Employee;
////import com.dineshonjava.sdnext.jdbc.utils.EmployeeMapper;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.jdbc.core.namedparam.SqlParameterSource;
//import org.springframework.stereotype.Component;
//
//import java.util.HashMap;
//
//@Component
//public class EmployeeDaoImpl implements EmployeeDao {
//    @Autowired
//    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//
//    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
//        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
//    }
//
//    @Override
//    public void create(String name, Integer age, Long salary) {
//        String SQL = "INSERT INTO Employee (name, age, salary) VALUES (:name, :age, :salary)";
//        Map namedParameters = new HashMap();
//        namedParameters.put("name", name);
//        namedParameters.put("age", age);
//        namedParameters.put("salary", salary);
//        namedParameterJdbcTemplate.update(SQL, namedParameters);
//        System.out.println("Created Record Name = " + name + " Age = " + age+ " Salary = " + salary);
//    }
//
//    @Override
//    public Employee getEmployee(Integer empid) {
//        String SQL = "SELECT * FROM Employee WHERE empid = :empid";
//        SqlParameterSource namedParameters = new MapSqlParameterSource("empid", Integer.valueOf(empid));
//        Employee employee = (Employee) namedParameterJdbcTemplate.queryForObject(SQL, namedParameters, new EmployeeMapper());
//        return employee;
//    }
//
//    @Override
//    public List<employee> listEmployees() {
//        String SQL = "SELECT * FROM Employee";
//        List<employee> employees = (List<employee>) namedParameterJdbcTemplate.query(SQL, new EmployeeMapper());
//        return employees;
//    }
//
//    @Override
//    public void delete(Integer empid) {
//        String SQL = "DELETE FROM Employee WHERE empid = :empid";
//        SqlParameterSource namedParameters = new MapSqlParameterSource("empid", Integer.valueOf(empid));
//        namedParameterJdbcTemplate.update(SQL, namedParameters);
//        System.out.println("Deleted Record with EMPID = " + empid );
//    }
//
//    @Override
//    public void update(Integer empid, Integer age) {
//        String SQL = "UPDATE Employee SET age = :age WHERE empid = :empid";
//        SqlParameterSource namedParameters = new MapSqlParameterSource();
//        namedParameters.addValue("age", age);
//        namedParameters.addValue("empid", empid);
//        namedParameterJdbcTemplate.update(SQL, namedParameters);
//        System.out.println("Updated Record with EMPID = " + empid );
//    }
//
//}
