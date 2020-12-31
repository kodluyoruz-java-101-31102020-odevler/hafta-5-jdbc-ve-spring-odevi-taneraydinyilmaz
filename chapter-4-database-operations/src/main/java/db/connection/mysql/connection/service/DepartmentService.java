package db.connection.mysql.connection.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.connection.mysql.connection.dao.DepartmentDAO;
import db.connection.mysql.connection.model.Department;
import db.connection.mysql.connection.model.Employee;

public class DepartmentService {

	private DepartmentDAO departmentDAO;

	public DepartmentService(DepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}

	// burada tüm departmanları listeleyen fonksiyonu yazınız.
	public List<Department> listAll() {
		return this.departmentDAO.getAll();
	}

	public Employee employee(ResultSet resultSet) throws SQLException {
		Employee employee = new Employee();
		employee.setId(resultSet.getLong("emp_no"));
		employee.setName(resultSet.getString("first_name"));
		employee.setLastName(resultSet.getString("last_name"));
		employee.setGender(resultSet.getString("gender"));
		employee.setBirthDate(resultSet.getDate("birth_date"));
		employee.setHireDate(resultSet.getDate("hire_date"));

		return employee;
	}
}
