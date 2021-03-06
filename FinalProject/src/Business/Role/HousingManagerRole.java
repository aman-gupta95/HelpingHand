/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HelpCenterEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.HousingManagerRole.HousingManagerWorkAreaJPanel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author Varada
 */
public class HousingManagerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HousingManagerWorkAreaJPanel(userProcessContainer, business, (HelpCenterEnterprise)enterprise, account);
    }
}
