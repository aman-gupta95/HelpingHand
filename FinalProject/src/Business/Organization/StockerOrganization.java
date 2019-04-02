/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.StockerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author amans
 */
public class StockerOrganization extends Organization {

    public StockerOrganization() {
        super(Organization.OrganizationType.Stocker.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList();
        roles.add(new StockerRole());
        return roles;
    }
}
