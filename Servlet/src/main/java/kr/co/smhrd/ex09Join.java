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

		// 2. 파라미터 수집
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		String mail = request.getParameter("mail");
		String food[] = request.getParameterValues("food");
		String hobby[] = request.getParameterValues("hobby");
		String gender = request.getParameter("gender");
		
		String color = request.getParameter("color");
		String board = request.getParameter("board");
		
		
System.out.println("아이디는 " + id);
System.out.println("이름은 " + name);
System.out.println("비밀번호는 " + pw);
System.out.println("메일주소는 " + mail);
String foods = "";
for (int i = 0; i < food.length; i++ ) {
	foods += food[i] + " ";
}
System.out.println("좋아하는 음식은 " + foods);
String hobbies = "";
for (int i = 0; i < food.length; i++ ) {
	hobbies += hobby[i] + " ";
}
System.out.println("좋아하는 취미는 " + hobbies);
System.out.println("성별은 " + gender);
System.out.println("좋아하는 색깔은 " + color);
System.out.println("게시글의 내용은 " + board);
		
	
	}

}
