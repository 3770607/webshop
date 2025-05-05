package tool;

import java.io.IOException;
import java.io.PrintWriter;

@jakarta.servlet.annotation.WebServlet(urlPatterns={"*.action"})
public class FrontController extends jakarta.servlet.http.HttpServlet {

	public void doPost(
		jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response
	) throws jakarta.servlet.ServletException, IOException {
                request.setCharacterEncoding("UTF-8");
                response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		try {
			String path=request.getServletPath().substring(1);
			String name=path.replace(".a", "A").replace('/', '.');
			Action action=(Action)Class.forName(name).
				getDeclaredConstructor().newInstance();
			String url=action.execute(request, response);
			request.getRequestDispatcher(url).
				forward(request, response);
		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}

	public void doGet(
		jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response
	) throws jakarta.servlet.ServletException, IOException {
		doPost(request, response);
	}
}
