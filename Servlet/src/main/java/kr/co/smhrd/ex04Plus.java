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
		// servlet�� ���� �����Ϸ��� �ϸ� ������ ���� ��� ������ ����.
		// html���� ���� ���� -> �� -> servlet �� �����ͼ� ���� ����

		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();

		// explus04.html ���� ���� �޾ƿ�
		// �޾ƿ� ���� num1�� ����
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");

		// ���ڿ� -> ������ �ٲٱ�
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);

		// num11�� num22�� ���� ���� ����ڿ��� �������
		out.println(num11 + num22);

	}

}
