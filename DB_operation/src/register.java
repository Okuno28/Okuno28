

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public register() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //ドライバの読み込み
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1","okuno","pass"); //DB接続

			//SQL文の実行
			String sql = "INSERT INTO employee (id, name, birthday, age) VALUES (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			String id = request.getParameter("id");
			int num = Integer.parseInt(id);
			ps.setInt(1, num);

			String name = request.getParameter("name");
			ps.setString(2, name);

			String birthday = request.getParameter("date");
			Date birth = Date.valueOf(birthday);
			ps.setDate(3, birth);

			String age = request.getParameter("age");
			int a = Integer.parseInt(age);
			ps.setInt(4, a);

			ps.executeUpdate();
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
