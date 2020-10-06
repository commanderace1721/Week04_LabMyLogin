/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class HomeServlet extends HttpServlet {

 
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
         String username = request.getParameter("username");
        
      if(session.getAttribute("username") == null)
        {
        
       response.sendRedirect("login");
       return;
        
        }
      
      if(session.getAttribute("username") != null)
      {
        
      }
          
      getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        User usr = new User();
        AccountService as = new AccountService();
             String username = request.getParameter("username");
        String password = request.getParameter("password");
          
          
          User test = as.login(username, password);
        session.setAttribute("username", test.getUsername());
     getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
    }

  

}
