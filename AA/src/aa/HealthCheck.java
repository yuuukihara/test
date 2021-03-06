package aa;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Health;
import model.HealthCheckLogin;


@WebServlet("/HealthCheck")
public class HealthCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		RequestDispatcher dispatcher = request.getRequestDispatcher("/healthCheck.jsp");
		dispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String weight = request.getParameter("weight");
		String height = request.getParameter("height");

		Health health = new Health();
		health.setWeight(Double.parseDouble(weight));
		health.setHeight(Double.parseDouble(height));

		HealthCheckLogin healthchecklogin = new HealthCheckLogin();
		healthchecklogin.execute(health);

		request.setAttribute("health", health);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/healthCheckResult.jsp");
		dispatcher.forward(request,response);


	}

}
