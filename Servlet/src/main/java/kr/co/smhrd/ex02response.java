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
		// response ��ü : ����ڿ��� ������ ���ִ� ��ü
		// ��) html ���� ����, ������ �̵�
		
//		1. ���ڵ�, � ������ �����͸� ��������
		response.setContentType("text/html; charset=euc-kr");
		// ���ڵ� : ��ǻ�Ͱ� ������ �� �ֵ��� ��ȣȭ �ϴ� ���� <-> ���ڵ� : ��ȣȭ
		// �ѱ� ���ڵ� �ϴ� ��� : euc-kr, utf-8
		
		// 2. ��� ��Ʈ��
		// �ڹ� Scanner
		// PrintWriter
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>����ϱ�</title></head>");
		out.print("<body>�ȳ��ϼ���!</body></html>");
		
	}

}
