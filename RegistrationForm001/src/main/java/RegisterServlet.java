import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirm_password = request.getParameter("confirm_password");

        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || !password.equals(confirm_password)) {
            response.sendRedirect("error.html");
        } else {
            // Registration logic (e.g., saving to a database)
            response.sendRedirect("success.html");
        }
    }
}
