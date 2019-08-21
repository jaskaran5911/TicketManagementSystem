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
public abstract class Train extends Station{
    private String PlatForm;
    private String InterState;
    private String Time;

    public Train() {
    }

    
    
    public Train(String PlatForm, String InterState, String Time) {
        this.PlatForm = PlatForm;
        this.InterState = InterState;
        this.Time = Time;
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
    
    @Override
    public String toString(){
        String train="Plateform Number: "+PlatForm+", Interstate Terminal: "+InterState+", Time: "+Time;
        return train;
    }
    
}
