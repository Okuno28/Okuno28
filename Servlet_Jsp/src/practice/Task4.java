package practice;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Task4
 */
@WebServlet("/task4")
public class Task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Task4() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String RESULT = "/WEB-INF/jsp/fortune_result.jsp";
		Date today = new Date();
		String[] uranai = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
		Random random = new Random();
		String result = uranai[random.nextInt(uranai.length)];

		FortuneBean sampleData = new FortuneBean();
		sampleData.setToday(today);
		sampleData.setFortune(result);
		request.setAttribute("uranai", sampleData);

		request.getRequestDispatcher(RESULT).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
