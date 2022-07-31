package servlets.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Register Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form method='post'>");
		out.println("<input type='text' name='benutzername' style='margin-bottom: 20px;' /><br />");
		out.println("<input type='text' name='passwort' style='margin-bottom: 20px;' /><br />");
		out.println("<input type='submit' value='Insert Person' /><br />");
		out.println("</form>");
		out.println("</body>");
		out.println("<html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String name = req.getParameter("benutzername");
		String password = req.getParameter("passwort");

		if (name != null && password != null && name.length() > 0 && password.length() > 0) {
			Person person = new Person(name, password);
			List<Person> aPerson = (List<Person>) this.getServletContext().getAttribute("personenliste");
			System.out.println("Personen Array");
			System.out.println(aPerson);

			synchronized (aPerson) {
				aPerson.add(person);
			}
		}
	}
}