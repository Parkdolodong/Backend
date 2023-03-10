package org.comstudy.myweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿 클래스는 HttpServelet을 상속 받아야 한다.
public class HelloServlet extends HttpServlet {
	// 중요 : 서블릿 실행 하는 방법은 web.xml에 매핑 시킨 주소를 브라우저 주소창에 주소를 입력한다.
	// 브라우저를 실행 해야만 한다.

	// doGet을 입력 한 후에 "Ctrl + space bar" 를 치면 자동 완성 된다.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UFT-8");
		resp.setContentType("text/html; charset=UTF-8");
		// 서버의 콘솔에 출력 된다.
		System.out.println("doGet() - HelloServlet 호출 됨.");

		// 브라우저에 출력 되는 방식
		// Request객체에는 요청 정보(파라미터, session, url 등)가 저장 된다.
		// Response객체에는 브라우저에 처리하는 정보(forward, redirect 등)가 저장 된다.
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("  <head>");
		out.println("    <title>Hello world</title>");
		out.println("  </head>");
		out.println("  <body>");
	      out.println("    <p><a href=\"http://www.naver.com\">네이버로 이동</a></p>");
		out.println("  </body>");
		out.println("</html>");
		out.close();
	}

	// 오버라이드(Override) - 부모 클래스의 맴버 메서드르 자식 클래스가 재 정의 하는 것.
	// @Override 어노테이션으로 검증
	// 우클릭 > Source > Override/Implement methods

}
