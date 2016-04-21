package projeto;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfig extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = getServletConfig().getInitParameter("username");
		String email = getServletConfig().getInitParameter("email");
		PrintWriter out = response.getWriter();
		out.println("Nome do usuário: "+username);
		out.println("E-mail: "+email);
	}

}
