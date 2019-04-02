/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.ShelterHomeManagerRole;
import java.util.ArrayList;

/**
 *
 * @author amans
 */
public class ShelterHomeManagerOrganization extends Organization{
    
    public ShelterHomeManagerOrganization(){
        super(Organization.OrganizationType.ShelterHomeManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ShelterHomeManagerRole());
        return roles;
    }
}
