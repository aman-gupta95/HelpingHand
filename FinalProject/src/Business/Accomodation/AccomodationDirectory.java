/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Accomodation;

import java.util.ArrayList;

/**
 *
 * @author Yash Lekhwani
 */
public class AccomodationDirectory {
     private ArrayList<Accomodation> AccomodationDirectory;

    public AccomodationDirectory() 
    {
        AccomodationDirectory = new ArrayList<Accomodation>();
    }

    public ArrayList<Accomodation> getAccomodationDirectory() {
        return AccomodationDirectory;
    }
}
