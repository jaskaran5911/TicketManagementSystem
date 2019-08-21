/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Jaskaran
 */
public class Details {
    String FromPlace;
    String ToPlace;

    public Details() {
    }

    public Details(String FromPlace, String ToPlace) {
        this.FromPlace = FromPlace;
        this.ToPlace = ToPlace;
    }

    public String getFromPlace() {
        return FromPlace;
    }

    public void setFromPlace(String FromPlace) {
        this.FromPlace = FromPlace;
    }

    public String getToPlace() {
        return ToPlace;
    }

    public void setToPlace(String ToPlace) {
        this.ToPlace = ToPlace;
    }
    
    
}
