package kr.co.smhrd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex09Join")
public class ex09Join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");

		// 2. �Ķ���� ����
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		String mail = request.getParameter("mail");
		String food[] = request.getParameterValues("food");
		String hobby[] = request.getParameterValues("hobby");
		String gender = request.getParameter("gender");
		
		String color = request.getParameter("color");
		String board = request.getParameter("board");
		
		
System.out.println("���̵�� " + id);
System.out.println("�̸��� " + name);
System.out.println("��й�ȣ�� " + pw);
System.out.println("�����ּҴ� " + mail);
String foods = "";
for (int i = 0; i < food.length; i++ ) {
	foods += food[i] + " ";
}
System.out.println("�����ϴ� ������ " + foods);
String hobbies = "";
for (int i = 0; i < food.length; i++ ) {
	hobbies += hobby[i] + " ";
}
System.out.println("�����ϴ� ��̴� " + hobbies);
System.out.println("������ " + gender);
System.out.println("�����ϴ� ������ " + color);
System.out.println("�Խñ��� ������ " + board);
		
	
	}

}
