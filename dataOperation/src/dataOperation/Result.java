package dataOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Result() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String help = request.getParameter("help");
		String comment = request.getParameter("comment");

		if (gender == null) {
			gender = "";
		}else if (gender.equals("male"))  {
			gender = "男性";
		}else if(gender.equals("female")){
			gender = "女性";
		}

		if (help.equals("1")) {
			help = "製品について";
		}else if (help.equals("2")){
			help = "不具合やクレーム";
		}else if(help.equals("3")){
			help = "アフターサポート";
		}
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>result</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>以下の内容でお問い合わせしました。回答をお待ちください。</p>");
		out.println("<p>名前：" + name + "様</p>");
		out.println("<p>性別：" + gender + "</p>");
		out.println("<p>お問い合わせ内容："+ help + "</p>");
		out.println("<p>お問い合わせ内容：" + comment + "</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
/*想定結果
　以下の内容でお問い合わせしました。回答をお待ちください。
　名前：田中　太郎様
　性別：男性
　お問い合わせ種類：不具合やクレーム
　お問い合わせ内容：テストです。*/
