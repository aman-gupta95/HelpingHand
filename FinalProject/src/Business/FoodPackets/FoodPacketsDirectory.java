/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodPackets;

import java.util.ArrayList;

/**
 *
 * @author Varada
 */
public class FoodPacketsDirectory {
    private ArrayList<FoodPackets> foodPacketDirectory;
    
    public FoodPacketsDirectory(){
        foodPacketDirectory = new ArrayList();
    }

    public ArrayList<FoodPackets> getFoodPacketDirectory() {
        return foodPacketDirectory;
    }
  
}
