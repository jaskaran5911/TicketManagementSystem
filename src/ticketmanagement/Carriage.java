/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmanagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Navdeep
 */
public class Carriage extends Train {

    private String CarriageID;
    private String Interstate;
    private String SeatNo;
    private String CompartmentNo;
    private String CarriageType;
    ArrayList<String> Carriagedata = new ArrayList<>();
    ArrayList<String> data = new ArrayList<>();

    public Carriage(String CarriageID, String SeatNo, String CarriageType, String PlatForm, String InterState, String Time) {
        super(PlatForm, InterState, Time);
        this.CarriageID = CarriageID;
        this.SeatNo = SeatNo;
        this.CarriageType = CarriageType;
    }

    public Carriage() {
    }

    public String getCarriageID() {
        return CarriageID;
    }

    public void setCarriageID(String CarriageID) {
        this.CarriageID = CarriageID;
    }

    public String getSeatNo() {
        return SeatNo;
    }

    public void setSeatNo(String SeatNo) {
        this.SeatNo = SeatNo;
    }

    public String getCompartmentNo() {
        return CompartmentNo;
    }

    public void setCompartmentNo(String CompartmentNo) {
        this.CompartmentNo = CompartmentNo;
    }

    public String getCarriageType() {
        return CarriageType;
    }

    public void setCarriageType(String CarriageType) {
        this.CarriageType = CarriageType;
    }
    //Method to set list of carriage
    public ArrayList<String> tostring() {

        String[] carriage = {"S01,Melbourne main,MM02,NON-SLEEPER", "S01,Melbourne main,MM05,NON-SLEEPER", "S02,Melbourne main,MM12,SLEEPER", "S02,Melbourne main,MM20,SLEEPER",
            "A02,Melbourne main,AN01,NON-SLEEPER", "A04,Melbourne main,AN20,SLEEPER"};
        for (String s : carriage) {
            Carriagedata.add(s);
        }
        return Carriagedata;
    }
    //Polymorphism is used here
    @Override
    public String toString() {
        return CarriageID + "," + Platform + "," + SeatNo + "," + CarriageType;
    }
    //Method to write carriage details in file
    public boolean writeToFile() throws IOException {
        boolean status;
        try (PrintWriter pw = new PrintWriter(new FileWriter("CarriageDetail.txt", true))) {
            for (String s : Carriagedata) {
                pw.println(s);
            }
            status = true;
        } catch (IOException e) {
            status = false;
            System.out.println("Exception while file write:" + e);
        }
        return status;
    }
    //Method to read data from AvailableSeats file.
    //Polymorphism is used here
    @Override
    public ArrayList<String> readFromFile() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("AvailableSeats.txt"));
        for (String temp = in.readLine(); temp != null; temp = in.readLine()) {
            data.add(temp);
        }
        in.close();
        return data;
    }
    //Method to get details of only SLEEPER Class compartments
    public ArrayList<Carriage> checkavailable() {
        ArrayList<Carriage> checklist = new ArrayList<>();
        try {
            readFromFile();
            String[] traindata = new String[4];
            for (int i = 0; i < data.size(); i++) {
                Carriage c = new Carriage();
                traindata = data.get(i).split(",");
                if (traindata[3].equals("SLEEPER")) {
                    c.setCarriageID(traindata[0]);
                    c.setCompartmentNo(traindata[2]);
                    checklist.add(c);
                } else {
                }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Carriage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checklist;
    }
}
