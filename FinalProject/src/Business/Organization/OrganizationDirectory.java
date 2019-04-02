/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Organization.Organization.OrganizationType;
import java.util.ArrayList;

/**
 *
 * @author Varada
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory(){
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createAndAddOrganization(Organization.OrganizationType type){
        Organization organization=null;
        if(type.getValue().equals(Organization.OrganizationType.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.OrganizationType.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.OrganizationType.HousingManager.getValue())){
            organization = new HousingOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.OrganizationType.LabAssistant.getValue())){
            organization = new LabAssistantOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.OrganizationType.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.OrganizationType.Receptionist.getValue())){
            organization = new ReceptionistOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.OrganizationType.RelationManager.getValue())){
            organization = new RelationManagerOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.OrganizationType.Stocker.getValue())){
            organization = new StockerOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Organization.OrganizationType.Pharmacist.getValue())){
            organization = new PharmacistOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.OrganizationType.FoodManager.getValue())){
            organization = new FoodManagerOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Organization.OrganizationType.ShelterHomeManager.getValue())){
            organization = new ShelterHomeManagerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
}
