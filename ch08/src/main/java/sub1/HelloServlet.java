package sub1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		// 서블릿이 최초 생성될 때 초기화 메서드
		System.out.println("helloServlet init...");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 클라이언트 Get 요청 실행 
		System.out.println("HelloServlet get 요청!!!");
		
		// HTML 출력
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<meta charset='UTF-8'>");
		writer.println("<title>HelloServlet</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h3>HelloServlet</h3>");
		writer.println("<a href = '/ch08/Servlet.jsp'>서블릿 메인</a><br>");
		writer.println("<a href = '/ch08/hello.do'>Hello Servlet</a><br>");
		writer.println("<a href = '/ch08/welcome.do'>Welcome Servlet</a><br>");
		writer.println("<a href = '/ch08/greeting.do'>Greeting Servlet</a><br>");
		writer.println("</body>");
		writer.println("</html>");
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 클라이언트 Post 요청 실행
		System.out.println("HelloServlet post 요청!!!");
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		System.out.println("id : " + id);
		System.out.println("pw : " + pw);
		
		resp.sendRedirect("/ch08/greeting.do");
	}

}
