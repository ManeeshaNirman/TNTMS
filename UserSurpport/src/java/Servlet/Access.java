/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import TNTMS.ProcessSessionBeanRemote;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Maneesha Nirman
 */
public class Access {

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
