/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Accomodation;

/**
 *
 * @author Yash Lekhwani
 */
public class Accomodation {
    private String AccomodationName;
    private String Location;
    private int NoOfSpots;
    public Accomodation(String AccomodationName, String Location, int NoOfSpots)
    {
       this.AccomodationName = AccomodationName;
       this.Location = Location;
       this.NoOfSpots = NoOfSpots;
    }

    public String getAccomodationName() {
        return AccomodationName;
    }

    public void setAccomodationName(String AccomodationName) {
        this.AccomodationName = AccomodationName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getNoOfSpots() {
        return NoOfSpots;
    }

    public void setNoOfSpots(int NoOfSpots) {
        this.NoOfSpots = NoOfSpots;
    }
    
      @Override
    public String toString() {
        return this.getAccomodationName();
    }
}
