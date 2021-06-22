/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import TNTMS.ProcessSessionBeanRemote;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
public class LoadData extends HttpServlet {

 

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("servlet ekata awa");
        try {
                  List<Entity.Data> s= processSessionBean.loadAll();
         //   System.out.println("awa awa"+s);      
           System.out.println("servlet ekata awa1");
                 
        //System.out.println("listsev:"+s);
               for (Entity.Data data : s) {
            System.out.println("servid:"+data.getTrackId());
            System.out.println("servename:"+data.getTrainName());
        }
               
             request.setAttribute("data",s);
            request.getRequestDispatcher("datatable.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
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
