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
		// get 방식 인코딩 :  server.xml에서 인코딩 명령어 추가
		
		String data = request.getParameter("data");
		System.out.println("Get 방식에서 나온 값 : " + data);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post 방식으로 인코딩 할때는
		// request 객체에서 인코딩 해야 한다.
		// -> 값을 가져오기 전에 (파라미터 수집) 인코딩을 해줘야 한다.
		request.setCharacterEncoding("euc-kr");
		
		String data = request.getParameter("data");
		System.out.println("Post 방식에서 나온 값 : " + data);
//		doGet(request, response);
	}

}
