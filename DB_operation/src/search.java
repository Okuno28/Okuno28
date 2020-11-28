

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class search
 */
@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public search() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>検索結果</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>検索結果</p>");

		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //ドライバの読み込み
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1","okuno","pass"); //DB接続

			String sql = "SELECT * FROM employee WHERE name LIKE ?";
			PreparedStatement ps = con.prepareStatement(sql);
			String name = request.getParameter("name");
			ps.setString(1, "%" + name + "%");

			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				out.println("<p>ID：" + rs.getInt("id") + "</p>");
				out.println("<p>名前：" + rs.getString("name") + "</p>");
				out.println("<p>生年月日：" + rs.getDate("birthday") + "</p>");
				out.println("<p>年齢：" + rs.getInt("age") + "</p>");
			}
			rs.close();
			ps.close();

		}catch (SQLException e){
			//DB接続やSQL処理失敗時の処理
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			//JDBCドライバが見つからない時の処理
			e.printStackTrace();
		}finally {
			//DBの切断
			if (con != null) {
				try {
					con.close();
				}catch(SQLException e) {
					//DB切断失敗時の処理
					e.printStackTrace();
				}
			}
			out.println("</body>");
			out.println("</html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
