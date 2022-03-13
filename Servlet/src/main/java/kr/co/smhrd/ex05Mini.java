package kr.co.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex05Mini")
public class ex05Mini extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// ������ �������� ���ڵ� ���, ������ ����� ����
		response.setContentType("text/html; charset=euc-kr");
		// ��� ��Ʈ�� ��ü�� ����
		PrintWriter out = response.getWriter();

		String choice = request.getParameter("choice");

		if (choice.equals("one")) {
			out.print("<img src='images/minions1.jpg'>");
		} else if (choice.equals("two")) {
			out.print("<img src='images/minions2.jpg'>");
		} else if (choice.equals("three")) {
			out.print("<img src='images/minions3.jpg'>");
		}

	}

}
