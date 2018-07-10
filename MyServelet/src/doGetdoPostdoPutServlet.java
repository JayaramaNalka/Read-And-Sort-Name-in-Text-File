import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class doGetdoPostdoPutServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//reportType("doGet", response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		reportType("doPost", response);
	}

	public void reportType(String requestType, HttpServletResponse response) throws IOException, ServletException {
		// set the MIME type
		response.setContentType("text/html");

		// use this to print to browser
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>doGetdoPostdoPutServlet" + "</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Your Request</h1>");
		out.println("Your request type: " + requestType);
		out.println("</body>");
		out.println("</html>");
	}

}
