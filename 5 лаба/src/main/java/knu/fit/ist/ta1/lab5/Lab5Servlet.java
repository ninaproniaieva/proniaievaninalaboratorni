package knu.fit.ist.ta1.lab5;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;


/**
 *
 * @author Владимир
 */
@WebServlet(name = "Lab5Servlet", urlPatterns = {"/lab5"})
public class Lab5Servlet extends HttpServlet {

    @Autowired

    Lab5Task lab5task;

    /**
     *
     * @param config
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig config) throws ServletException {

        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                config.getServletContext());
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Lab5Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Lab5Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String list = lab5task.list(request.getParameter("num"));
        String sortedList = lab5task.sortedList();
        String sortStr = lab5task.sortStr();
        String sortShr = lab5task.sortShr();
        String searchWord = lab5task.searchWord(request.getParameter("word"), request.getParameter("start"), request.getParameter("finish"));

        request.setAttribute("list", list);
        request.setAttribute("sortedList", sortedList);
        request.setAttribute("sortStr", sortStr);
        request.setAttribute("sortShr", sortShr);
        request.setAttribute("searchWord", searchWord);

        request.getRequestDispatcher("lab5.jsp").forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
