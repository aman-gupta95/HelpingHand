/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Accomodation.Accomodation;
import Business.Accomodation.AccomodationDirectory;
import Business.Homeless.HomelessIndividualDirectory;
import Business.Role.Role;
import java.util.ArrayList;
import Business.DataReader.DataReader;
import Business.Drug.Drug;
import Business.FoodPackets.FoodPacketsDirectory;
import Business.Homeless.HomelessIndividual;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author amans
 */
public class HelpCenterEnterprise extends Enterprise {
    private HashMap<Integer, Drug> drugList;
    private HomelessIndividualDirectory homelessDirectory;
    private AccomodationDirectory accomodationDirectory;
    private DataReader homelessReader;
    private DataReader drugReader;
    private DataReader accomodationReader;
    private final String HOMELESS_FILE_PATH = "./Homeless_mockData.csv";
    private final String DRUG_FILE_PATH = "./Medicine_mockData.csv";

    private FoodPacketsDirectory foodPacketDirectory;

    private final String ACCO_FILE_PATH = "./Accomodation_MockData.csv";

    public HelpCenterEnterprise(String name) throws IOException, ParseException {
        super(name,EnterpriseType.HelpCenter);
        drugList = new HashMap();
        homelessDirectory = new HomelessIndividualDirectory();

        foodPacketDirectory = new FoodPacketsDirectory();

        accomodationDirectory = new AccomodationDirectory();

        homelessReader = new DataReader(HOMELESS_FILE_PATH);
        drugReader = new DataReader(DRUG_FILE_PATH);
        accomodationReader = new DataReader (ACCO_FILE_PATH);
        readData();
    }

    public AccomodationDirectory getAccomodationDirectory() {
        return accomodationDirectory;
    }

    public HashMap<Integer, Drug> getDrugList() {
        return drugList;
    }
    
    public HomelessIndividualDirectory getHomelessDirectory() {
        return homelessDirectory;
    }

    public FoodPacketsDirectory getFoodPacketDirectory() {
        return foodPacketDirectory;
    }
    
    
    
    private void readData() throws IOException, ParseException{
        String row[];
        while((row = homelessReader.getNextRow()) != null ){
            int homelessId = Integer.parseInt(row[0]);
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            Date dateOfBirth = df.parse(row[5]);
            HomelessIndividual homeless = new HomelessIndividual(homelessId, row[1], row[2], row[4], dateOfBirth, row[3]);
            this.getHomelessDirectory().getHomelessDirectory().add(homeless);
        }
        while((row = drugReader.getNextRow()) != null )
        {
            int drugId = Integer.parseInt(row[0]);
            int quantity = Integer.parseInt(row[3]);
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            Date dateOfExpiry = df.parse(row[2]);
            Drug drug = new Drug(drugId, row[1], dateOfExpiry, quantity);
            this.drugList.put(drugId, drug);
        } 
//             while((row = accomodationReader.getNextRow()) != null )
//        {
//            int NoOfSpots = Integer.parseInt(row[2]);
//            Accomodation acco = new Accomodation( row[0], row[1],NoOfSpots);
//            this.getAccomodationDirectory().getAccomodationDirectory().add(acco);
//            
//           
//        }
    }
    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        return null;
    }
   }
