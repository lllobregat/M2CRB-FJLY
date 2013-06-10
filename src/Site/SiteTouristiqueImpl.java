/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Site;
import AssistanceTouristique.*;
/**
 *
 * @author Lydia
 */
public class SiteTouristiqueImpl extends SiteTouristiquePOA {
    
    public SiteTouristiqueImpl() {
        
    }
    
    public short getHorairesFermeture(String nom) {
        short horaire=0;
        switch(nom) {
            case "Georges Labit" :
                //17h30 en minutes
                horaire=(17*60)+30;
                break;
            case "Museum histoire naturelle" :
                //18h en minutes
                horaire=18*60;
                break;
            case "Saint Raymond" :
                //18h45 en minutes
                horaire=(18*60)+45;
                break;
        }
        return horaire;
        
    }
}
