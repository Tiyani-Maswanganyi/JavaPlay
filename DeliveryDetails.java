/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mama;

/**
 *
 * @author Sawyer
 */
public class DeliveryDetails {
    // variables
    private String town;
    private String deliveryCompany;
    private String weight;
    private double price;
    
    //setters
    
    public void setTown(String town)
    {
        this.town = town;
    }
     public void setDeliveryCompany(String company)
    {
        this.deliveryCompany = company;
    }
      public void setWeight(String weight)
    {
        this.weight = weight;
    }
       public void setPrice(double price)
    {
        this.price = price;
    }
       
       //getters
    public String getTown()
    {
        return this.town;
    }
    public String getDeliveryCompany()
    {
        return this.deliveryCompany;
    }
    public String getWeight()
    {
        return this.weight;
    }
    public double getPrice()
    {
        return this.price;
    }
}
