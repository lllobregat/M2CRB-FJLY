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
    private String nomSite;
    private String nombd;
    
    public SiteTouristiqueImpl(String nomSite, String nombd) {
       this.nomSite = nomSite;
       this.nombd = nombd;
    }
    
    //TODO BD
    public Site getInfoSite(short idSite) {
   
        float latitude = new SiteDBManager(this.nombd).getCoordLatitudeSite();
        float longitude = new SiteDBManager(this.nombd).getCoordLongitudeSite();
        Coordonnees coordSite = new Coordonnees(longitude, latitude);
        
        Site infoSite = new Site((short)new SiteDBManager(this.nombd).getIdSite(), new SiteDBManager(this.nombd).getNomSite(),
                                 coordSite, new SiteDBManager(this.nombd).getHoraireOuvertureSite(),
                                 new SiteDBManager(this.nombd).getHoraireFermetureSite(), new SiteDBManager(this.nombd).getDescriptionSite(),
                                 new SiteDBManager(this.nombd).getAdresseSite(), new SiteDBManager(this.nombd).getTelephoneSite(),
                                 (int)new SiteDBManager(this.nombd).getAffluenceCouranteSite());
        return infoSite;     
    }
}
