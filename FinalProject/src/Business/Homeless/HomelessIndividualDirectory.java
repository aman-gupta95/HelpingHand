/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Homeless;

import java.util.ArrayList;

/**
 *
 * @author amans
 */
public class HomelessIndividualDirectory {
    private ArrayList<HomelessIndividual> homelessDirectory;

    public HomelessIndividualDirectory() {
        homelessDirectory = new ArrayList<HomelessIndividual>();
    }

    public ArrayList<HomelessIndividual> getHomelessDirectory() {
        return homelessDirectory;
    }
    
}
