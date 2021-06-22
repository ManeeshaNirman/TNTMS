/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TNTMS;

import Entity.Data;
import Model.LocationTracker;
import com.google.gson.Gson;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.Singleton;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Maneesha Nirman
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup",
            propertyValue = "tntms")
    ,
    @ActivationConfigProperty(propertyName = "destinationType",
            propertyValue = "javax.jms.Queue")
})

@Singleton
public class getReadingSession implements getReadingSessionRemote, MessageListener {

    //  @Resource
    // private MessageDrivenContext mdc;
     @PersistenceContext (unitName = "TNTMSPU")
     EntityManager em;
    @Override
   
    public void onMessage(Message message) {
        try {

            if (message instanceof TextMessage) {
                String data = message.getBody(String.class);
                Gson g = new Gson();
                LocationTracker locationTracker = g.fromJson(data, LocationTracker.class);

                System.out.println("mess Train name:" + locationTracker.getTrainName());
                System.out.println("mess Location:" + locationTracker.getLocation());
                System.out.println("mess speed:" + locationTracker.getSpeed());
                System.out.println("mess:" + locationTracker.getHumility());

                System.out.println("message:" + message);
                String trainName=locationTracker.getTrainName();
                String location=locationTracker.getLocation();
                double speed=locationTracker.getSpeed();
                double temperature=locationTracker.getTemp();
                String huminity=locationTracker.getHumility();
                String date=locationTracker.getDate();
                String time=locationTracker.getTime();
                
                Data data1=new Data();
                data1.setTrainName(trainName);
                data1.setLocation(location);
                data1.setSpeed(speed);
                data1.setTemperature(temperature);
                data1.setTime(time);
                data1.setDate(date);
                data1.setHuminity(huminity);
                
                 em.persist(data1);
                 em.flush();
               //  em.close();
                
                





            } else {
                System.out.println("messag Error: Not Text Message");

            }
        } catch (Exception e) {
            System.out.println("Erroe");
            //  mdc.setRollbackOnly();
        }
    }

}
