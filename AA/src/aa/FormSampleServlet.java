package aa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormSampleServlet
 */
@WebServlet("/FormSampleServlet")
public class FormSampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String body = request.getParameter("body");
		String qtype= request.getParameter("qtype");

		String errorMsg = "";

		if(name ==null || name.length()==0){
			errorMsg +="errorだよ";
		}
		if(gender == null || gender.length()==0){
			errorMsg += "性別エラー";
		}else if(gender.equals(0)){
			gender="男性";
		}else{
			gender="女性";
		}

		if(body == null || body.length()==0){
			errorMsg += "テキストエリアかいてませんぜ";
		}

		String msg = name +"さん("+gender+")を登録しました";
		if(errorMsg.length() != 0){
			msg = errorMsg;
		}

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>fjieow</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+msg+"</p>");
		out.println(qtype+body);
		out.println("</body>");
		out.println("</html>");


	}

}
