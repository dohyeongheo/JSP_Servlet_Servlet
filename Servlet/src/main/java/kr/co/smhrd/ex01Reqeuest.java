package kr.co.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex01Reqeuest")
// ������ ������ ã�� ���ڿ� : URL ����

public class ex01Reqeuest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// REQUEST��ü : ������� ��û�� ���� ������ ��� �ִ� ��ü
		// ���� : �����ϴ� IP�ּ�, ������, ��Ű ,,, ���

		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		// request.getRemoteAddr(); : Ŭ���̾�Ʈ ip �ּҸ� �������� ���
		String ip = request.getRemoteAddr();
		System.out.println(ip);

		// ip �ּ�
		// localhost
		// 220.93.229.140 (ipv4�ּ�)
		// 0:0:0:0:0:0:0:1 (ipv6�ּ�)

		// �ǽ�! �� ip�ּҸ� "�� �Դϴ�!"
		// ���� ip�ּҸ� "�츮�� ȯ���մϴ�"
// ������ ip�ּҸ� "������ ȯ���մϴ�!"

		if (ip.equals("220.93.229.140")) {
			System.out.println("�� �Դϴ�!");
			out.println("�� �Դϴ�!");
		
		} else if (ip.equals("210.223.239.145")) {
			System.out.println("���־ƾ� ȯ���մϴ�!");
			out.println("���־ƾ� ȯ���մϴ�!");
			out.println("���� ���ó׿�");
		
		} else if (ip.equals("172.30.1.49")) {
			System.out.println("���αԾ� ȯ���մϴ�!");
			out.println("���αԾ� ȯ���մϴ�!");
			out.println("�����մϴ�.");
		
		} else if (ip.equals("211.63.240.13")) {
			System.out.println("������� ȯ���մϴ�!");
			out.println("������� ȯ���մϴ�!");
			out.println("�����մϴ�");
		
		} else if (ip.equals("210.223.239.202")) {
			System.out.println("�������� �����ּ���");
			out.println("�������� �����ּ���");
			out.println("�����մϴ�.");
			
		} else if (ip.equals("125.183.194.246")) {
			System.out.println("�������� �����ּ���");
			out.println("�������� �����ּ���");
			out.println("�����մϴ�.");
		
		} else if (ip.equals("59.0.234.242")) {
			out.println("������ ȯ���մϴ�!");

		}
		
		else {
			out.print("����� ���������Դϴ�.");
		}
	}

}
