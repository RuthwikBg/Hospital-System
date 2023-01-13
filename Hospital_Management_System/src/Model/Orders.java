/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Roles.Delivery_Man;


/**
 *
 * @author sumanayanakonda
 */
public class Orders {
    
    private String OrderName;
    private String OrderStatus;
    private Person person;
    private int Amount;
    private Delivery_Man deliveryman;
    private String OrderType;
    private String BuyerName;
    private House BuyerAddress;
   

    public Delivery_Man getDeliveryman() {
        return deliveryman;
    }

    public void setDeliveryman(Delivery_Man deliveryman) {
        this.deliveryman = deliveryman;
    }
    
    
    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }
    
    

    public String getOrderName() {
        return OrderName;
    }

    public void setOrderName(String OrderName) {
        this.OrderName = OrderName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
   
   

    public String getOrderType() {
        return OrderType;
    }

    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public String getBuyerName() {
        return BuyerName;
    }

    public void setBuyerName(String BuyerName) {
        this.BuyerName = BuyerName;
    }

    public House getBuyerAddress() {
        return BuyerAddress;
    }

    public void setBuyerAddress(House BuyerAddress) {
        this.BuyerAddress = BuyerAddress;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }
    
    
    
}
