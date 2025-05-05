package shop;

import java.util.List;

import bean.Item;
import tool.Action;

public class PreviewAction extends Action {

	@SuppressWarnings("unchecked")
	public String execute(jakarta.servlet.http.HttpServletRequest request,
			jakarta.servlet.http.HttpServletResponse response) throws Exception {
		jakarta.servlet.http.HttpSession session = request.getSession();

		if (session.getAttribute("customer") == null) {
			return "preview-error-login.jsp";
		}

		List<Item> cart = (List<Item>) session.getAttribute("cart");
		if (cart == null || cart.size() == 0) {
			return "preview-error-cart.jsp";
		}

		return "parchase-in.jsp";
	}
}
