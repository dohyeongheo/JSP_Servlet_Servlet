package kr.co.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex04Plus")
public class ex04Plus extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// servlet을 먼저 실행하려고 하면 가져온 값이 없어서 오류가 난다.
		// html에서 먼저 실행 -> 값 -> servlet 값 가져와서 로직 구성

		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();

		// explus04.html 에서 값을 받아옴
		// 받아온 값을 num1에 대입
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");

		// 문자열 -> 정수형 바꾸기
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);

		// num11과 num22를 더한 값을 사용자에게 출력해줌
		out.println(num11 + num22);

	}

}
