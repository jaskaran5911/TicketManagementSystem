/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmanagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aamir
 */
public abstract class Train extends Station{
    private String PlatForm;
    private String InterState;
    private String Time;
    private String TrainName;
    private String conductorname;
    private String conductorage;
    private String conductoID;
    
    public Train() {
    }
    public Train(String PlatForm, String InterState, String Time) {
        this.PlatForm = PlatForm;
        this.InterState = InterState;
        this.Time = Time;
    }

    public String getTrainName() {
        return TrainName;
    }

    public void setTrainName(String TrainName) {
        this.TrainName = TrainName;
    }
    
    

    public String getPlatForm() {
        return PlatForm;
    }

    public void setPlatForm(String PlatForm) {
        this.PlatForm = PlatForm;
    }

    public String getInterState() {
        return InterState;
    }

    public void setInterState(String InterState) {
        this.InterState = InterState;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getConductorname() {
        return conductorname;
    }

    public void setConductorname(String conductorname) {
        this.conductorname = conductorname;
    }

    public String getConductorage() {
        return conductorage;
    }

    public void setConductorage(String conductorage) {
        this.conductorage = conductorage;
    }

    public String getConductoID() {
        return conductoID;
    }

    public void setConductoID(String conductoID) {
        this.conductoID = conductoID;
    }
    
    
    //Method to show train class data in string format
    @Override
    public String toString(){
        String train="Train Name: "+TrainName+", Platform Name:"+PlatForm+", Interstate Terminal: "+InterState+", Time: "+Time;
        return train;
    }
    //Method to read train details from file
    public ArrayList<String> readFromFile() throws IOException {
        ArrayList<String> data = new ArrayList<>();
        BufferedReader in = new BufferedReader(new FileReader("TrainDetail.txt"));

        for(String temp = in.readLine(); temp != null; temp = in.readLine()) {
            data.add(temp);
        }
        
        in.close();
        return data;
    }
    
    
   
    
}
