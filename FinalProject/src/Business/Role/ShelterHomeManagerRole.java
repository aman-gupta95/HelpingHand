/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.ShelterHomeEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.PharmacistRole.PharmacistWorkAreaJPanel;
import UserInterface.ShelterHomeManagerRole.ShelterHomeManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author amans
 */
public class ShelterHomeManagerRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ShelterHomeManagerWorkAreaJPanel(userProcessContainer, business, account, (ShelterHomeEnterprise)enterprise);
    }
}
