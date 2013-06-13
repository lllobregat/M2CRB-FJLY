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
public class ServiceESSiteImpl extends ServiceESSitePOA {
 
    private String nombd;
    
    public ServiceESSiteImpl(String nombd) {
        this.nombd = nombd;
    }
    
    public void autoriserEntree(Carte carte) {
        
    }
    
    public boolean entrer(short idCarte) throws AssistanceTouristique.ServiceESSitePackage.carteNonValideException, 
                                                AssistanceTouristique.ServiceESSitePackage.siteDejaVisiteException, 
                                                AssistanceTouristique.ServiceESSitePackage.siteSatureException, 
                                                AssistanceTouristique.ServiceESSitePackage.siteFermeException {
        return false;
      
    }
    
    //Methode oneway
    public void sortir(short idCarte) {
    
    }
    
    //Methode oneway
    public void donnerAvisVisite(float satisfaction) {
        
    }
    
    public Visite[] getInfosES(short idSite) {
        return null;
        
    }
    
    public float getAffluenceCourante(short idSite) {
        float affluenceCourante=0;
        switch(idSite) {
            //Georges Labit
            case 1 :
                affluenceCourante=2;
                break;
            //Museum histoire naturelle
            case 2:
                affluenceCourante=4;
                break;
            //Saint Raymond
            case 3 :
                affluenceCourante=6;
                break;      
        }
        
        return affluenceCourante;
    }

    public float getTauxSatisfaction(short idSite) {
        return ((float) 12.5);
    }

    public boolean getEstFavoris(short idSite) {
        return true;
    }
    
}
