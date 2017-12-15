package test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/go8")
public class Go8Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("/go8 요청 처리중...");
		
		//요청 전달자 객체 얻어오기
		RequestDispatcher rd = request.getRequestDispatcher("view1.jsp");
		//view1.jsp 페이지(서블릿) 에 응답을 위임한다.
		rd.forward(request, response);// forward 는 주소창이 변하지 않는다. 그래서 클라이언트는 서블릿에서 응답한 줄로 안다.
		//forward 는 출력은 jsp에서 하고, 요청 처리는 서블릿에서 하는 경우에 사용한다.
		
	}
}
