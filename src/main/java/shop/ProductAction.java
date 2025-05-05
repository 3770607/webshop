package shop;

import java.util.List;

import bean.Product;
import dao.ProductDAO;
import tool.Action;

public class ProductAction extends Action {

	@Override
	public String execute(jakarta.servlet.http.HttpServletRequest request,
			jakarta.servlet.http.HttpServletResponse response) throws Exception {
	jakarta.servlet.http.HttpSession session=request.getSession();
		
		String keyword=request.getParameter("keyword");
		if(keyword==null) keyword="";
		
		ProductDAO dao=new ProductDAO();
		List<Product> list=dao.search(keyword);
		
		session.setAttribute("list",list);
	return "product.jsp";
	}
}
