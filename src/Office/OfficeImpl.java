/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Office;
import AssistanceTouristique.*;
import org.omg.CosNaming.*; 

/**
 *
 * @author Lydia
 */
public class OfficeImpl extends OfficePOA {
    private org.omg.CORBA.ORB orb;
    //private HashMap<Short, String> listeSite;
    private short[] listeSite;
    private int nb_sites;
    private SiteTouristique monSite;
    private ServiceESSite monServES;
    private OfficeDBManager db;
    
    public OfficeImpl(org.omg.CORBA.ORB orb, short[] listeSite) {
        this.orb=orb;
        this.listeSite=listeSite;
        this.nb_sites=this.listeSite.length;
        this.db = new OfficeDBManager();
        
        try {
            NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(this.orb.resolve_initial_references("NameService"));
            //Set set = listeSite.entrySet();
            //Iterator it = set.iterator();
            
            //Pour chaque site
            for(int i=0; i<this.listeSite.length; i++) {
            // while(it.hasNext()) {
               // Map.Entry site = (Map.Entry)it.next();
                /*********** Recherche du site ***********/ 
                String nomSite = this.db.getNomSite(this.listeSite[i]);
                System.out.println("nom site " + nomSite);
                org.omg.CosNaming.NameComponent[] nameToFind = new org.omg.CosNaming.NameComponent[1];
                nameToFind[0] = new org.omg.CosNaming.NameComponent(nomSite, "");
                org.omg.CORBA.Object distantSite = nameRoot.resolve(nameToFind);
                
                this.monSite = SiteTouristiqueHelper.narrow(distantSite);
                
                /********** Recherche du service E/S du site *********/
                //String nomServES = "ES "+(String)site.getValue();
                /*String nomServES = "ES "+ nomSite;
                nameToFind[0] = new org.omg.CosNaming.NameComponent(nomServES, "");
                org.omg.CORBA.Object distantServES = nameRoot.resolve(nameToFind);
                
                this.monServES = ServiceESSiteHelper.narrow(distantServES);*/
             }
        }
	catch (Exception e) {
		e.printStackTrace();
	}  
    }
            
    public Site[] getListeSitesAVisiter(short idCarte, Coordonnees coordGPS, short[] listeSitesVisites) {
        //ServeurOffice servOffice = new ServeurOffice(this.nombd);
        // récupération des ids des sites à visiter
        short[] idSites = this.db.getIdSites();
        
        // pour chaque site à visiter, récupération des infos des sites
        Site[] sitesAVisiter = null;
        for(int j=0; j<this.listeSite.length; j++) {  
            // TODO !!! + affluence courante
            /*Site = infoSite = this.monSite.getInfoSite(this.listeSite[j]);
                   
            //Récupération de l'affluence courante auprès du service ES du site
            //affluenceCourante = this.monServES.getAffluenceCourante((short)site.getKey());

            affluenceCourante = (float)12.3;

            siteAVisiter[i] = new Site(infoSite.idSite, infoSite.titre, infoSite.coord, infoSite.horaireOuverture, infoSite.horairesFermeture, infoSite.description, infoSite.adresse, infoSite.telephone, affluenceCourante);
            i++;*/
        }
            //}
        
        
        return sitesAVisiter; 
    }
    
}
