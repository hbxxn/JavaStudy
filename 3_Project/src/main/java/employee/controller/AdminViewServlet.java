package employee.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

import employee.model.service.EmployeeService;
import employee.model.vo.Employee;

/**
 * Servlet implementation class AdminViewServlet
 */
@WebServlet("/admin.me")
public class AdminViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Employee loginUser = request.getSession().getAttribute("loginUser");
		HttpSession session = request.getSession();
		Employee loginUser = (Employee)session.getAttribute("loginUser");
		
		if(loginUser != null && loginUser.getIsAdmin().equals("Y")) {
			ArrayList<Employee> list = new EmployeeService().selectAll();
			request.setAttribute("empList", list);
			
			request.getRequestDispatcher("WEB-INF/views/employee/admin.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "잘못된 접근입니다.");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
