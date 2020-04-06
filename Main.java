/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mama;

import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void main(String[] args)
    { 

           String[] Townoptions = {"Cape Town", "Pretoria", "Durban"};
           String[] Weightoption ={"0Kg-4Kg", "5Kg-9Kg","Over 10Kg"};
           String[] Courieroptions = {"ABC Couriers", "Fast Track", "Rest Assured"};
           
            var deliveryDetails = new DeliveryDetails();

            JFrame frame = new JFrame("Delivery App");

            while(deliveryDetails.getTown()== null) {
             String city = (String)JOptionPane.showInputDialog(frame,
               "Select the town the parcel will be delivered to\n"+ 
                "1) Cape Town\n"+
                "2) Pretoria\n"+
                "3) Durban");
                System.out.println(city);
             if((city.contains("1")) || city.toUpperCase().trim() == "CAPETOWN"){
                 city = "Cape Town";
                deliveryDetails.setTown(city);
             }else if((city.contains("2")) || city.toUpperCase().trim() == "PRETORIA"){
                city = "Pretria";
                deliveryDetails.setTown(city);
             }else if((city.contains("3")) || city.toUpperCase().trim() == "DURBAN"){
                city = "Durban";
                deliveryDetails.setTown(city);
             } 
            }
        


            while(deliveryDetails.getWeight() == null){
             String weight = (String)JOptionPane.showInputDialog(frame,
              "Select the weight category of the parcel to be delivered to "+deliveryDetails.getTown()+"\n"+
              "1) 0kg - 4kg \n"+
              "2) 5kg - 9kg \n"+
              "3) Over 10kg \n"
             );

             if((weight.contains("1")) || weight.toUpperCase().trim() == "0KG-4KG"){
                weight = "0kg - 4kg";
                deliveryDetails.setWeight(weight);
                deliveryDetails.setPrice(300);
             } else if((weight.contains("2")) || weight.toUpperCase().trim() == "5KG-9KG"){
                weight = "5kg - 9kg";
                deliveryDetails.setWeight(weight);
                deliveryDetails.setPrice(500);
             } else if((weight.contains("3")) || weight.toUpperCase().trim() == "OVER10KG"){
                weight = "Over 10kg";
                deliveryDetails.setWeight(weight);
                deliveryDetails.setPrice(700);
             }

            }

            while(deliveryDetails.getDeliveryCompany() == null){
                String weight = (String)JOptionPane.showInputDialog(frame,
                "Select the courier company to deliver the parcel weight of "+deliveryDetails.getWeight()+" to "+deliveryDetails.getTown()+"\n"+
                "1) ABC Couriers \n"+
                "2) Fast Track \n"+
                "3) Rest Assured \n"
               );
  
               if((weight.contains("1")) || weight.toUpperCase().trim() == "ABCCOURIERS"){
                  weight = "ABC Couriers";
                  deliveryDetails.setDeliveryCompany(weight);
               } else if((weight.contains("2")) || weight.toUpperCase().trim() == "FASTTRACK"){
                  weight = "Fast Track";
                  deliveryDetails.setDeliveryCompany(weight);
               } else if((weight.contains("3")) || weight.toUpperCase().trim() == "RESTASSURED"){
                  weight = "Rest Assured";
                  deliveryDetails.setDeliveryCompany(weight);
               }  
            }
        
            System.out.println("DELIVERY REPORT - Created on " +java.time.LocalDate.now()+ " "+java.time.LocalTime.now()+"\n"+
                              "******************************************************************************************"+"\n"+
                              "TOWN: "+deliveryDetails.getTown()+"\n"+
                              "WEIGHT: "+deliveryDetails.getWeight()+"\n"+
                              "PRICE: "+deliveryDetails.getPrice()+"\n"+
                              "VAT (14%): "+deliveryDetails.getPrice() * 0.14+"\n"+
                              "TOTAL DUE: "+(deliveryDetails.getPrice() + (deliveryDetails.getPrice()*0.14))+"\n"+
                              "COURIER: "+deliveryDetails.getDeliveryCompany()+"\n"+
                              "*************************************************************************************************");  
      
    }
}