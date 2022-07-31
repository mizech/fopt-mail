package servlets.registration;

import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppContext implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent event) {
		event.getServletContext().setAttribute("personenliste", new ArrayList<Person>());
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
	}
}
