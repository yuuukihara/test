package aaa1;

import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet{
	private static final long seriaVersionUID = 1L;

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throw ServletException, IOException{

		response.sendRedirect("/example/SampleServlet");
	}

}
