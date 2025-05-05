package shop;

import tool.Action;

public class LogoutAction extends Action{

	@Override
	public String execute(jakarta.servlet.http.HttpServletRequest request,
			jakarta.servlet.http.HttpServletResponse response) throws Exception {
		jakarta.servlet.http.HttpSession session=request.getSession();
		if(session.getAttribute("customer")!=null) {
			session.removeAttribute("customer");
			return "logout-out.jsp";
		}
		return "logout-error.jsp";}
	
}
