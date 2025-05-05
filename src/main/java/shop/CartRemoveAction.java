package shop;

import java.util.List;

import bean.Item;
import tool.Action;

public class CartRemoveAction extends Action {

	@SuppressWarnings("unchecked")
public String execute(jakarta.servlet.http.HttpServletRequest request,
			jakarta.servlet.http.HttpServletResponse response) throws Exception {
		jakarta.servlet.http.HttpSession session=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		List<Item> cart=(List<Item>)session.getAttribute("cart");
		
		for(Item i:cart) {
			if(i.getProduct().getId()==id) {
				cart.remove(i);
				break;
			}
		}
		
		return "cart.jsp";}
}
