/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.FoodManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Varada
 */
public class FoodManagerOrganization extends Organization{
    public FoodManagerOrganization(){
        super(Organization.OrganizationType.FoodManager.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodManagerRole());
        return roles;
    }
}
