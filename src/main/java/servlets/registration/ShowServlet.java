package servlets.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/show")
public class ShowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Show registered users</title>");
		out.println("</head>");
		out.println("<body>");

		List<Person> persons = (List<Person>) this.getServletContext().getAttribute("personenliste");

		synchronized (persons) {
			for (Person person : persons) {
				out.format("<div>%s</div>", person.getUsername());
			}
		}

		out.println("</body>");
		out.println("<html>");
	}
}
