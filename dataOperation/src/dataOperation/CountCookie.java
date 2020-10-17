package dataOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountCookie
 */
@WebServlet("/CountCookie")
public class CountCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CountCookie() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>クッキー</title>");
		out.println("</head>");

		out.println("<body>");
		out.println("<h1>訪問回数テスト（クッキー）</h1>");
		//Cookieの値を取得
		Cookie[]visits = request.getCookies();
		//Cookie変数の宣言
		Cookie visitedCookie = null;
		//nullCheck
		if(visits != null) {
			for (int i = 0; i<visits.length; i++) {
				if("visited".equals(visits[i].getName())) {
					visitedCookie = visits[i];
				}
			}
			if (visitedCookie != null) {
				int visit = Integer.parseInt(visitedCookie.getValue()) + 1;
				out.println("<p>" + visit + "回目の訪問です。</p>");
				visitedCookie.setValue(Integer.toString(visit));
				visitedCookie.setMaxAge(300);
				response.addCookie(visitedCookie);
			}else{
				out.println("<p>初回の訪問です。</p>");

				Cookie newCookie = new Cookie("visited", "1");
				newCookie.setMaxAge(300);
				response.addCookie(newCookie);
			}
		}else{
			out.println("<p>初回の訪問です。</p>");

			Cookie newCookie = new Cookie("visited", "1");
			newCookie.setMaxAge(300);
			response.addCookie(newCookie);
		}
		out.println("<a href=\"/dataOperation/CountCookie\">画面を再訪問</a>");
		out.println("</body>");

		out.println("</html>");
	}

}