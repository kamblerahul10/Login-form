/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vishwas
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            String uname=request.getParameter("username");
            String pass=request.getParameter("password");
            if(uname!=null && pass!=null){
                if(uname.equals("Rahul") && pass.equals("Rahul")){
                    response.sendRedirect("Welcome.jsp");
                }
                else{
                    out.println("Incorrect username Or Password ");
                }
            }
            else{
               out.println("Empty Username or password ");
            }
                
        } finally {            
            out.close();
        }
    }

 
}
