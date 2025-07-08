package employee.model.service;

import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import employee.model.dao.EmployeeDAO;
import employee.model.vo.Employee;

public class EmployeeService {
	private EmployeeDAO empDAO = new EmployeeDAO();
	
	public Employee login(Employee e) {
		Connection conn = getConnection();
		Employee login = empDAO.login(conn, e);
		
		return login;
	}
	
	public ArrayList<Employee> selectAll() {
		Connection conn = getConnection();
		ArrayList<Employee> list = empDAO.selectAll(conn);
		
		return list;
	}

	public int insertEmployee(Employee e) {
		Connection conn = getConnection();
		int result = empDAO.insertEmployee(conn, e);
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		return result;
	}
	
	public int updateEmployee(Employee e) {
		Connection conn = getConnection();
		int result = empDAO.updateEmployee(conn, e);
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		return result;
	}
	
	public int checkEmpNo(int empNo) {
		Connection conn = getConnection();
		int result = empDAO.checkEmpNo(conn, empNo);
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		return result;
	}

	public int updateState(int id, String col, String value) {
		Connection conn = getConnection();
		int result = empDAO.updateState(conn, id, col, value);
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		return result;
	}
}
