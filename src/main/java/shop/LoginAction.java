package shop;

import bean.Customer;
import dao.CustomerDAO;
import tool.Action;

public class LoginAction extends Action{

	@Override
	public String execute(jakarta.servlet.http.HttpServletRequest request,
			jakarta.servlet.http.HttpServletResponse response) throws Exception {
		String login=request.getParameter("login");
		String password=request.getParameter("password");
		jakarta.servlet.http.HttpSession session=request.getSession();
		CustomerDAO dao=new CustomerDAO();
		Customer c=dao.search(login,password);
		if(c!=null) {
			session.setAttribute("customer",c);
			return "login-out.jsp";
		}
		return "login-error.jsp";
	}
	
}
