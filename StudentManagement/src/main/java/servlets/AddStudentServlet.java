package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddStudentServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/registerstudent" })
public class AddStudentServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String studName = (String) request.getParameter("studName");
		String studEmail = (String) request.getParameter("studEmail");
		response.getWriter().append("<h1>Served at: </h1>").append(request.getContextPath());
	}

}
