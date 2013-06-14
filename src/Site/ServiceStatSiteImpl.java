/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Site;
import AssistanceTouristique.*;
import org.omg.CosNaming.NamingContext;
/**
 *
 * @author Lydia
 */
public class ServiceStatSiteImpl extends ServiceStatSitePOA {
    private org.omg.CORBA.ORB orb;
    private String nomSite;
    private String nombd;
    private ServiceESSite monServES;
    private SiteDBManager db;
    
    public ServiceStatSiteImpl(org.omg.CORBA.ORB orb, short idSite, String nomSite, String nombd) {
        this.orb=orb;
        this.nomSite=nomSite;
        this.nombd=nombd;
        this.db = new SiteDBManager(this.nombd);
        
        try {
            NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(this.orb.resolve_initial_references("NameService"));
            //Recherche du service E/S
            String nomServES = "ES " + this.nomSite;
            org.omg.CosNaming.NameComponent[] nameToFind = new org.omg.CosNaming.NameComponent[1];
            nameToFind[0] = new org.omg.CosNaming.NameComponent(nomServES, "");
            org.omg.CORBA.Object distantServES = nameRoot.resolve(nameToFind);
                
            this.monServES = AssistanceTouristique.ServiceESSiteHelper.narrow(distantServES);
                
            //Appel à la methode du service E/S
            //this.monServES.getInfosES(this.idSite);
        }
	catch (Exception e) {
		e.printStackTrace();
	}  
        
    }
    
    public Statistique[] getStatsSite(short idSite) {

        //-------- TODO corba: récupérer les données ServiceE/S -----------------//
        
        //En attendant, lecture dans la base de données
        Statistique[] stat = new Statistique[4];
        stat[0] = new Statistique("Affluence quotidienne", db.getAffluenceQuotidienneSite(), "%");
        stat[1] = new Statistique("Durée moyenne de visite", db.generateDureeMoyenneVisiteSite(), "minutes");
        stat[2] = new Statistique("Durée minimum de visite", db.generateDureeMinimaleVisiteSite(), "minutes");
        stat[3] = new Statistique("Durée maximum de visite", db.generateDureeMaximaleVisiteSite(), "minutes");
        
        return stat;
        
    }
}
