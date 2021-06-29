
package IP12lab2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author proniaieva
 */
public class lab2Servlet extends HttpServlet {
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        lab2Validator validator = new lab2Validator();
        String arg = request.getParameter("x");
        String result = validator.ValidateAndCalculate(arg);
        request.setAttribute("result", result);
        request.getRequestDispatcher("lab2.jsp").forward(request, response);
    }

}