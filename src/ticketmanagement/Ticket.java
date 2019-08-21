/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmanagement;

/**
 *
 * @author Aamir
 */
public class Ticket extends Station{
    private String CompType;
    private String SeatNo;
    private String CompNo;
    private int TicketPrice;
    private String train;
    
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
    
    
}
