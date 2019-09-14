/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmanagement;

import java.util.ArrayList;

/**
 *
 * @author Jaskaran
 */
public class Luggage extends Ticket{
    private String LuggageSubmit;
    private String LuggageCollect;

    public Luggage(String LuggageSubmit, String LuggageCollect) {
        this.LuggageSubmit = LuggageSubmit;
        this.LuggageCollect = LuggageCollect;
    }

    public Luggage() {
    }
    
    

    public String getLuggageSubmit() {
        return LuggageSubmit;
    }

    public void setLuggageSubmit(String LuggageSubmit) {
        this.LuggageSubmit = LuggageSubmit;
    }

    public String getLuggageCollect() {
        return LuggageCollect;
    }

    public void setLuggageCollect(String LuggageCollect) {
        this.LuggageCollect = LuggageCollect;
    }
    //Method to set value of luggage class in string format
    @Override
    public String toString(){
        return "Luggage Submit time: "+LuggageSubmit+", Luggage Collect time:"+LuggageCollect;
    }
    
    
}
