package kr.co.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex01Reqeuest")
// 실행할 서블릿을 찾는 문자열 : URL 맵핑

public class ex01Reqeuest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// REQUEST객체 : 사용자의 요청을 통해 정보를 담고 있는 객체
		// 정보 : 접속하는 IP주소, 데이터, 쿠키 ,,, 등등

		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		// request.getRemoteAddr(); : 클라이언트 ip 주소를 가져오는 기능
		String ip = request.getRemoteAddr();
		System.out.println(ip);

		// ip 주소
		// localhost
		// 220.93.229.140 (ipv4주소)
		// 0:0:0:0:0:0:0:1 (ipv6주소)

		// 실습! 내 ip주소면 "저 입니다!"
		// 팀원 ip주소면 "우리팀 환영합니다"
// 선생님 ip주소면 "선생님 환영합니다!"

		if (ip.equals("220.93.229.140")) {
			System.out.println("저 입니다!");
			out.println("저 입니다!");
		
		} else if (ip.equals("210.223.239.145")) {
			System.out.println("윤솔아씨 환영합니다!");
			out.println("윤솔아씨 환영합니다!");
			out.println("자주 오시네요");
		
		} else if (ip.equals("172.30.1.49")) {
			System.out.println("조민규씨 환영합니다!");
			out.println("조민규씨 환영합니다!");
			out.println("감사합니다.");
		
		} else if (ip.equals("211.63.240.13")) {
			System.out.println("김민정씨 환영합니다!");
			out.println("김민정씨 환영합니다!");
			out.println("감사합니다");
		
		} else if (ip.equals("210.223.239.202")) {
			System.out.println("윤진관씨 나가주세요");
			out.println("윤진관씨 나가주세요");
			out.println("감사합니다.");
			
		} else if (ip.equals("125.183.194.246")) {
			System.out.println("윤진관씨 나가주세요");
			out.println("윤진관씨 나가주세요");
			out.println("감사합니다.");
		
		} else if (ip.equals("59.0.234.242")) {
			out.println("선생님 환영합니다!");

		}
		
		else {
			out.print("여기는 뉴피자팀입니다.");
		}
	}

}
