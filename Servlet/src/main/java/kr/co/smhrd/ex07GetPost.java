package kr.co.smhrd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex07GetPost")
public class ex07GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get ��� ���ڵ� :  server.xml���� ���ڵ� ��ɾ� �߰�
		
		String data = request.getParameter("data");
		System.out.println("Get ��Ŀ��� ���� �� : " + data);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post ������� ���ڵ� �Ҷ���
		// request ��ü���� ���ڵ� �ؾ� �Ѵ�.
		// -> ���� �������� ���� (�Ķ���� ����) ���ڵ��� ����� �Ѵ�.
		request.setCharacterEncoding("euc-kr");
		
		String data = request.getParameter("data");
		System.out.println("Post ��Ŀ��� ���� �� : " + data);
//		doGet(request, response);
	}

}
