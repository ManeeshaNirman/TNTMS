/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TNTMS;


import Entity.Data;
import Entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Maneesha Nirman
 */
@Stateless

public class ProcessSessionBean implements ProcessSessionBeanRemote, ProcessSessionBeanLocal {

    
    
    @PersistenceContext(unitName = "TNTMSPU")
    EntityManager em;
  
    
    @Override
    public String userLogin(String username, String password) {
        
        User user=(User)em.createQuery("SELECT u FROM User u WHERE u.username = '"+username.trim()+"'").getSingleResult();
        System.out.println("pws:"+password);
        
        
  if(user.getUsername().equalsIgnoreCase(username)){
      
      if(password.equals(user.getPassword())){
      
      return "loginsuccess";
      }
  
      return "unsucess";
  
  }else{
      
     return "unsucess"; 
  }
        
    
    }
    
    
    

   
    @Override
    public List<Data> loadAll() {
          List<Data> datas= em.createQuery("SELECT d FROM Data d").getResultList();
         
         
          
//          for (Data data : datas) {
//              list.add(data);
//              System.out.println(data.getTrackId());
//              System.out.println(data.getTrainName());
//              System.out.println(data.getLocation());
//            
//        }
         
      System.out.println("array:"+datas.size());
       
       return datas;
    }

   

  

  
   
    
   

    
}
