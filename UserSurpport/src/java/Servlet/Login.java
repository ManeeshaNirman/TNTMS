/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import TNTMS.ProcessSessionBeanRemote;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Maneesha Nirman
 */
public class Login extends HttpServlet {

  

//    @EJB
//    private ProcessSessionBeanRemote processSessionBean;

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        String un = request.getParameter("un");
        String pw = request.getParameter("pw");
        

        System.out.println("pw:" + pw);

        String result = processSessionBean.userLogin(un, pw);

        if (result.equals("loginsuccess")) {
            System.out.println("methana hari");
            response.getWriter().write("ok");

        } else if(result.equals("unsucess")) {

            response.getWriter().write("No");
            System.out.println("No");
        }else{
        System.out.println("error");
         response.getWriter().write("error");
            
        }
        
    }

  
     ProcessSessionBeanRemote processSessionBean = lookupProcessSessionBeanRemote();

    private ProcessSessionBeanRemote lookupProcessSessionBeanRemote() {
        try {
            Context c = new InitialContext();
            return (ProcessSessionBeanRemote) c.lookup("java:global/TNTMS/ProcessSessionBean!TNTMS.ProcessSessionBeanRemote");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}
