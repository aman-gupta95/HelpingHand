/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Accomodation.Accomodation;
import Business.Accomodation.AccomodationDirectory;
import Business.DataReader.DataReader;
import Business.Role.Role;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author amans
 */
public class ShelterHomeEnterprise extends Enterprise {

    private final String ACCO_FILE_PATH = "./Accomodation_MockData.csv";
    private DataReader accomodationReader;
    private AccomodationDirectory accomodationDirectory;
    
    
    public ShelterHomeEnterprise(String name) throws IOException, ParseException{
        super(name, EnterpriseType.ShelterHome);
        accomodationDirectory = new AccomodationDirectory();
        accomodationReader = new DataReader (ACCO_FILE_PATH);
        readData();
    }
    
     public AccomodationDirectory getAccomodationDirectory() {
        return accomodationDirectory;
    }

     private void readData() throws IOException, ParseException{
         String row[];
          while((row = accomodationReader.getNextRow()) != null )
            {
                int NoOfSpots = Integer.parseInt(row[2]);
                Accomodation acco = new Accomodation( row[0], row[1],NoOfSpots);
                this.getAccomodationDirectory().getAccomodationDirectory().add(acco);
            }
     }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
