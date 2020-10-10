package dataOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CountSession
 */
@WebServlet("/CountSession")
public class CountSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CountSession() {
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
		out.println("<title>セッション</title>");
		out.println("</head>");

		out.println("<body>");
		out.println("<h1>訪問回数テスト（セッション）</h1>");
		//Sessionを取得
		HttpSession visit = request.getSession(false);

		if(visit == null) {
			out.println("<p>初回の訪問です。</p>");
			visit = request.getSession(true);
			visit.setAttribute("visited", "1");
		}else {
			String access = (String)visit.getAttribute("visited");
			int visited = Integer.parseInt(access);
			visited++;

			out.println("<p>" + visited + "回目の訪問です。</p>");
			visit.setAttribute("visited", Integer.toString(visited));
		}

		out.println("<a href=\"/dataOperation/CountSession\">画面を再訪問</a>");
		out.println("</body>");

		out.println("</html>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
