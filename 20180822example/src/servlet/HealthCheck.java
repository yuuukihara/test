
package servlet;

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

  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

    // フォワード
    RequestDispatcher dispatcher =
        request.getRequestDispatcher
            ("/WEB-INF/jsp/healthCheck.jsp");
    dispatcher.forward(request, response);
  }

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

    // リクエストパラメータを取得
    String weight = request.getParameter("weight"); // 身長
    String height = request.getParameter("height"); // 体重

    // 入力値をプロパティに設定
    Health health = new Health();
    health.setHeight(Double.parseDouble(height));
    health.setWeight(Double.parseDouble(weight));
    // 健康診断を実行し結果を設定
    HealthCheckLogin healthCheckLogic = new HealthCheckLogin();
    healthCheckLogic.execute(health);

    // リクエストスコープに保存
    request.setAttribute("health", health);

    // フォワード
    RequestDispatcher dispatcher =
        request.getRequestDispatcher
            ("/WEB-INF/jsp/healthCheckResult.jsp");
    dispatcher.forward(request, response);
  }
}