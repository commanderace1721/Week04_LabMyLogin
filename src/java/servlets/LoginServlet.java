
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author 826847
 */
public class LoginServlet extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String action = request.getParameter("action");
          if(session.getAttribute("username") != null)
      {
          
        if(action != null && action.equals("reset"))
        {
            session.invalidate();
            session = request.getSession();
            
            request.setAttribute("message", "Successfully Loggedout");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
        return;
        
      }
          
        
        
       getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User usr = new User();
        AccountService as = new AccountService();
        
      
          
        if(username.isEmpty() && password.isEmpty())
        {
         
         
         
         as.login(username, password);
         
         request.setAttribute("message", "Invalid entry");
         
         
         getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response); 
         
         
          
         
       
        }
        if(username != null && password != null)
         {
           
           as.login(username, password);
           User test = as.login(username, password);
           if(test == null) 
           {
             request.setAttribute("message", "Invalid Username and Password");
             getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response); 
             return;
           }
            session.setAttribute("username", username);
            response.sendRedirect("home");
           
         }
       
       
    }

  

}
