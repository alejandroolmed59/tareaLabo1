import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MainServlet")
public class Controller extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Controller() {
        super();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = "root";
        String pass = "root";
        String userReq= request.getParameter("username");
        String passReq = request.getParameter("pass");
        PrintWriter out = response.getWriter();
        if (user.equals(userReq) && pass.equals(passReq)) {
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>"+"ACCESO CORRECTO"+"</h1>");
            out.println("</body>");
            out.println("</html>");
        }else {
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>" + "ACCESO INCORRECTO"+"</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}