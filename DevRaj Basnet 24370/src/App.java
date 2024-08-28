import javax.servlet.*;
import java.io.IOException;

public class SimpleServlet implements Servlet {

    // Initialization method
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Servlet is being initialized...");
    }

    // Service method to handle requests
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Request received and being processed...");
        response.getWriter().write("Hello from SimpleServlet!");
    }

    // Destruction method
    public void destroy() {
        System.out.println("Servlet is being destroyed...");
    }

    // Other methods of the Servlet interface (not implemented for simplicity)
    public ServletConfig getServletConfig() {
        return null;
    }

    public String getServletInfo() {
        return null;
    }
}
