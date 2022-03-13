package kr.co.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex06Table")
public class ex06Table extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();

		// 파라미터 수집
		String room = request.getParameter("room");

		// 문자열 정수로 변환
		int room1 = Integer.parseInt(room);

		out.print("<table border='1'><tr>");
		for (int i = 1; i <= room1; i++) {
			out.print("<td>" + i + "</td>");
		}

		out.print("</tr></table>");

	}

}
