package kr.co.smhrd;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex08Info")
public class ex08Info extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. post ��� �ѱ� ���ڵ�
		request.setCharacterEncoding("euc-kr");

		// 2. �Ķ���� ����
		String job = request.getParameter("job");
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobby");

		System.out.println("���� : " + job);
		System.out.println("���� : " + gender);

		String hobby = "";

		for (int i = 0; i < hobbies.length; i++) {
			hobby += hobbies[i] + " ";
		}
		System.out.println("��� : " + hobby);

	}

}
