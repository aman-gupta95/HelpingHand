/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.FoodPackets.FoodPackets;
import Business.FoodPackets.FoodPacketsDirectory;
import Business.Role.Role;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Varada
 */
public class FoodEnterprise extends Enterprise {
    private HashMap<Integer, FoodPackets> foodList;
    private FoodPacketsDirectory foodPacketDirectory;

    public FoodEnterprise(String name) throws IOException, ParseException
    {
        super(name, EnterpriseType.Food);
        foodList = new HashMap();
        foodPacketDirectory = new FoodPacketsDirectory();
    }

    public HashMap<Integer, FoodPackets> getFoodList() {
        return foodList;
    }

    public void setFoodList(HashMap<Integer, FoodPackets> foodList) {
        this.foodList = foodList;
    }

    public FoodPacketsDirectory getFoodPacketDirectory() {
        return foodPacketDirectory;
    }

    public void setFoodPacketDirectory(FoodPacketsDirectory foodPacketDirectory) {
        this.foodPacketDirectory = foodPacketDirectory;
    }
    
   

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
