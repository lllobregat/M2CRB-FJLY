/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Site;
import AssistanceTouristique.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author Lydia
 */
public class ServiceStatSiteImpl extends ServiceStatSitePOA {
    
    public ServiceStatSiteImpl() {
        
    }
    
    public Statistique[] getStatsSite(String date , String nomSite) {
        //Traitement de la date
        DateFormat formater = DateFormat.getDateInstance(DateFormat.SHORT,Locale.ENGLISH);
        try {
            Date dateStat = formater.parse(date);
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        /*Switch(nomSite) {
         * case "museum hostoire naturelle":
         * break;
         * case "Saint Raymond" :
         * break;
         * case "Geeorges Labit" :
         * break;
        }
        */
        
        Statistique[] stat = new Statistique[4];
        stat[0] = new Statistique("Affluence quotidienne", 12, "personnes");
        stat[1] = new Statistique("Durée moyenne de visite", 120, "minutes");
        stat[2] = new Statistique("Durée minimum de visite", 70, "minutes");
        stat[3] = new Statistique("Durée maximum de visite", 180, "minutes");
        return stat;
        
    }
    
    public void afficherInfosES(Visite[] listeVisites, String nom) {
        
    }
}
