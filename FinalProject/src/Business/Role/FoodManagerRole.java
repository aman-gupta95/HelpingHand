/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FoodEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.FoodManager.FoodManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Varada
 */
public class FoodManagerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userprocesscontainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business){
        return new FoodManagerWorkAreaJPanel(userprocesscontainer, business, (FoodEnterprise)enterprise, account);
    }
    
    
}
