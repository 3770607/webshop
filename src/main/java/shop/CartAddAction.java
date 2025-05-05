package shop;

import java.util.ArrayList;
import java.util.List;

import bean.Item;
import bean.Product;
import tool.Action;

public class CartAddAction extends Action {

	@SuppressWarnings("unchecked")
	public String execute(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws Exception {
		
		jakarta.servlet.http.HttpSession session=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		List<Item> cart=(List<Item>)session.getAttribute("cart");
		if(cart==null) {
			cart=new ArrayList<Item>();
			session.setAttribute("cart",cart);
		}
		for(Item i:cart) {
			if(i.getProduct().getId()==id) {
				i.setCount(i.getCount()+1);
				return "cart.jsp";
			}
		}
		
		List<Product> list=(List<Product>)session.getAttribute("list");
		for(Product p:list) {
			if(p.getId()==id) {
				Item i=new Item();
				i.setProduct(p);
				i.setCount(1);
				cart.add(i);
			}
		}
		
		return "cart.jsp";
	}
}
