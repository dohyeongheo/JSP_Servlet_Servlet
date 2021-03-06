package kr.co.smhrd;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ex02response1
 */
@WebServlet("/ex02response")
public class ex02response extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response 객체 : 사용자에게 응답을 해주는 객체
		// 예) html 만들어서 응답, 페이지 이동
		
//		1. 인코딩, 어떤 형식의 데이터를 보내줄지
		response.setContentType("text/html; charset=euc-kr");
		// 인코딩 : 컴퓨터가 이해할 수 있도록 암호화 하는 과정 <-> 디코딩 : 복호화
		// 한글 인코딩 하는 방식 : euc-kr, utf-8
		
		// 2. 출력 스트림
		// 자바 Scanner
		// PrintWriter
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>출력하기</title></head>");
		out.print("<body>안녕하세요!</body></html>");
		
	}

}
