package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HtmlTemplate")
public class HtmlTemplate extends HttpServlet {
	public static void header(PrintWriter out){
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>ServletTask</title>");
		out.println("</head>");
		out.println("<body>");
	}
	public static void footer(PrintWriter out) {
		out.println("</body>");
		out.println("</html>");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		HtmlTemplate.header(out);
		out.println("<h1>HtmlTemplate使用例</h1>");
		HtmlTemplate.footer(out);
	}

}
