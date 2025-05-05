package shop;

import java.util.List;

import bean.Product;
import dao.ProductDAO;
import tool.Action;

//@WebServlet(urlPatterns={"Search.Action"})
public class SearchAction extends Action {

	@Override
	public String execute(jakarta.servlet.http.HttpServletRequest request,
			jakarta.servlet.http.HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String keyword=request.getParameter("keyword");
		ProductDAO dao=new ProductDAO();
		List<Product> list=dao.search(keyword);
		request.setAttribute("list",list);
	return "list.jsp";
	}
}
