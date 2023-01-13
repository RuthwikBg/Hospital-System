/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;

import Roles.Bed_Manager;
import Roles.DeliveryManager;
import Roles.Delivery_Man;
import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class Delivery_Manager_Directory {
    
    private ArrayList<DeliveryManager> deliveryManList;

    public Delivery_Manager_Directory(ArrayList<DeliveryManager> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
public Delivery_Manager_Directory() {
        this.deliveryManList = new ArrayList<DeliveryManager>();
    }
    public ArrayList<DeliveryManager> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryManager> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
    
    
    
}
