package kr.co.smhrd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex03DataSend")
public class ex03DataSend extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		// get��� ������ ���� -> �������� ���ڵ��� �������
		//post ��� << �̰� �ȵ�
		//request.setCharacterEncoding("euc-kr");
		
		// getParameter("name �Ӽ���")
		String data = request.getParameter("data");
		System.out.println(data);
	}

}
