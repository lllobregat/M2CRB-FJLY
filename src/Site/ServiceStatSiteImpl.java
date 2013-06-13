/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Site;
import AssistanceTouristique.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.omg.CosNaming.NamingContext;
/**
 *
 * @author Lydia
 */
public class ServiceStatSiteImpl extends ServiceStatSitePOA {
    private org.omg.CORBA.ORB orb;
    private short idSite;
    private String nomSite;
    private String nombd;
    private ServiceESSite monServES;
    
    public ServiceStatSiteImpl(org.omg.CORBA.ORB orb, short idSite, String nomSite, String nombd) {
        this.orb=orb;
        this.idSite=idSite;
        this.nomSite=nomSite;
        this.nombd=nombd;
        
        try {
            NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(this.orb.resolve_initial_references("NameService"));
            //Recherche du site
            org.omg.CosNaming.NameComponent[] nameToFind = new org.omg.CosNaming.NameComponent[1];
            nameToFind[0] = new org.omg.CosNaming.NameComponent(this.nomSite, "");
            org.omg.CORBA.Object distantServES = nameRoot.resolve(nameToFind);
                
            this.monServES = AssistanceTouristique.ServiceESSiteHelper.narrow(distantServES);
                
            //Appel à la methode du service E/S
            this.monServES.getInfosES(this.idSite);
        }
	catch (Exception e) {
		e.printStackTrace();
	}  
        
    }
    
    public Statistique[] getStatsSite(short idSite) {

        //-------- TODO corba: récupérer les données ServiceE/S -----------------//
        
        //En attendant, lecture dans la base de données
        Statistique[] stat = new Statistique[4];
        stat[0] = new Statistique("Affluence quotidienne", (int)(new SiteDBManager(this.nombd).getAffluenceQuotidienneSite()), "%");
        stat[1] = new Statistique("Durée moyenne de visite", new SiteDBManager(this.nombd).getDureeMoyenneVisiteSite(), "minutes");
        stat[2] = new Statistique("Durée minimum de visite", new SiteDBManager(this.nombd).getDureeMinimaleVisiteSite(), "minutes");
        stat[3] = new Statistique("Durée maximum de visite", new SiteDBManager(this.nombd).getDureeMaximaleVisiteSite(), "minutes");

        return stat;
        
    }

}
