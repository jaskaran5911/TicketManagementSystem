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
 * @author Jaskaran
 */
public class Ticket extends Station{
    private String CompType;
    private String SeatNo;
    private String CompNo;
    private int TicketPrice;
    private String train;
    private String PassangerName;
    private String Interstate;
    private String platform;
    private String Carriage;
    ArrayList<String> data = new ArrayList<>();
    public Ticket() {
    }

    public Ticket(String CompType, String SeatNo, int TicketPrice) {
        this.CompType = CompType;
        this.SeatNo = SeatNo;
        this.TicketPrice = TicketPrice;
    }
    
     public Ticket(String CompType, int TicketPrice, String CompNo) {
        this.CompType = CompType;
        this.TicketPrice = TicketPrice;
        this.CompNo=CompNo;
    }

    public String getCarriage() {
        return Carriage;
    }

    public void setCarriage(String Carriage) {
        this.Carriage = Carriage;
    }

     
    public String getPassangerName() {
        return PassangerName;
    }

    public void setPassangerName(String PassangerName) {
        this.PassangerName = PassangerName;
    }

    public String getInterstate() {
        return Interstate;
    }

    public void setInterstate(String Interstate) {
        this.Interstate = Interstate;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

     
    public String getCompType() {
        return CompType;
    }

    public void setCompType(String CompType) {
        this.CompType = CompType;
    }

    public String getSeatNo() {
        return SeatNo;
    }

    public void setSeatNo(String SeatNo) {
        this.SeatNo = SeatNo;
    }

    public String getCompNo() {
        return CompNo;
    }

    public void setCompNo(String CompNo) {
        this.CompNo = CompNo;
    }

    public int getTicketPrice() {
        return TicketPrice;
    }

    public void setTicketPrice(int TicketPrice) {
        this.TicketPrice = TicketPrice;
    }
    //Polymorphism is used here
    @Override
    public String toString(){
        
        if(CompType=="First-Class"){
        train="Train seat type: "+CompType+", Seat/Compartment No: "+CompNo+", Ticket Price: "+TicketPrice;
        }
        else{
           train="Train seat type: "+CompType+"Seat/Compartment No: "+SeatNo+"Ticket Price: "+TicketPrice; 
        }
        return train;
    }
    //Method to read data from purchase ticket file.
    public ArrayList<String> readFromFile() throws IOException {
        
        String[] traindata=new String[4];
        BufferedReader in = new BufferedReader(new FileReader("PurchaseTicket.txt"));

        for(String temp = in.readLine(); temp != null; temp = in.readLine()) {
            data.add(temp);
            traindata=temp.split(",");
            
            System.out.println(traindata[0]);
        }
        
        in.close();
        return data;
    }
    //Method to set total passenger details who has purchased ticket
    public ArrayList<Ticket> Passangerlist(){
        ArrayList<Ticket> passangerlist=new ArrayList<>();
        try {
            
            data=readFromFile();
            String[] traindata=new String[7];
            for(String s:data){
                traindata=s.split(",");
                Ticket t=new Ticket();
                    t.setCarriage(traindata[0]);
                    t.setPlatform(traindata[1]);
                    if(traindata[4].equals("NON-SLEEPER")){
                        t.setSeatNo(traindata[2]);
                    }
                    else{
                        t.setCompNo(traindata[2]);
                    }
                    t.setInterstate(traindata[3]);
                    t.setCompType(traindata[4]);
                    t.setPassangerName(traindata[5]);
                    t.setTicketPrice(Integer.parseInt(traindata[6]));
                    passangerlist.add(t);
            }
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return passangerlist;
    }
    
}
