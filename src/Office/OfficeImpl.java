/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;
import AssistanceTouristique.*;

import org.omg.CORBA.*; 
import org.omg.PortableServer.*; 
import org.omg.CosNaming.*; 
import org.omg.CosNaming.NamingContextPackage.*;

/**
 *
 * @author Lydia
 */
public class OfficeImpl extends OfficePOA {
    private org.omg.CORBA.ORB orb;
    private String[] listeSite;
    private int nb_sites;
    private Site[] siteAVisiter;
    
    public OfficeImpl(org.omg.CORBA.ORB orb, String[] listeSite) {
        this.orb=orb;
        this.listeSite=listeSite;
        this.nb_sites=this.listeSite.length;
        this.siteAVisiter = new Site[this.nb_sites];
        
        try {
            NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(this.orb.resolve_initial_references("NameService"));
            //Pour chaque site
            for(int i=0; i<listeSite.length; i++) {
                System.out.println(listeSite[i]);
                //Recherche du site
                org.omg.CosNaming.NameComponent[] site = new org.omg.CosNaming.NameComponent[1];
                site[0] = new org.omg.CosNaming.NameComponent(listeSite[i], "");
                org.omg.CORBA.Object distantSite = nameRoot.resolve(site);
                
                AssistanceTouristique.SiteTouristique monSite = AssistanceTouristique.SiteTouristiqueHelper.narrow(distantSite);
                
                switch(listeSite[i]) {
                    case "Georges Labit" :
                        monSite.getHorairesFermeture(listeSite[i]);
                        System.out.println(monSite.getHorairesFermeture(listeSite[i]));
                        break;
                    case "Museum histoire naturelle" :
                        monSite.getHorairesFermeture(listeSite[i]);
                        System.out.println(monSite.getHorairesFermeture(listeSite[i]));
                        break;
                    case "Saint Raymond" :
                        monSite.getHorairesFermeture(listeSite[i]);
                        System.out.println(monSite.getHorairesFermeture(listeSite[i]));
                        break;
                        
                }
            }
        }
	catch (Exception e) {
		e.printStackTrace();
	}  
    }
            
    public Site[] getListeSitesAVisiter(short idCarte, Coordonnees coordGPS, Site[] listeSitesVisites) {
        Site[] siteAVisiter = new Site[3];
        
        try {
            //Si le touriste possede une carte 
            if(idCarte > 0) {
            
            }
            else {
                //siteAVisiter[0] = new Site(String nom, AssistanceTouristique.Coordonnees coord, int affluenceCourante, int horaireFermeture)
            }

        }
	catch (Exception e) {
		e.printStackTrace();
	}
        
        return null;
        
    }
    
}
