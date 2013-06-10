/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SiteGeorgesLabit;

import Office.OfficeImpl;
import Site.*;
import java.util.Date;
import org.omg.CosNaming.NamingContext;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

/**
 *
 * @author Lydia
 */
public class ServeurSiteGeorgesLabit {
    public static String nomSite="Georges Labit";
    
    public ServeurSiteGeorgesLabit() {
        
    }
    
    public void afficherHoraireFermeture(Date heureF) {
        
    }
    
    public static void main(String args[]) {
      try {
           org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);

            // Gestion du POA
             //****************
             // Recuperation du POA
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));

            // Creation du servant
            //*********************
           SiteTouristiqueImpl monSite = new SiteTouristiqueImpl();

            // Activer le servant au sein du POA et recuperer son ID
            byte[] monSiteId = rootPOA.activate_object(monSite);

            // Activer le POA manager
            rootPOA.the_POAManager().activate();

            /******** Enregistrement dans le service de nommage ********/
         
            // Recuperation du naming service
            NamingContext nameRoot=org.omg.CosNaming.NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));

            // Construction du nom a enregistrer
            org.omg.CosNaming.NameComponent[] nameToRegister = new org.omg.CosNaming.NameComponent[1];
            nameToRegister[0] = new org.omg.CosNaming.NameComponent(nomSite,"");

            // Enregistrement de l'objet CORBA dans le service de noms
            nameRoot.rebind(nameToRegister,rootPOA.servant_to_reference(monSite));
            System.out.println("==> Nom '"+ nomSite + "' est enregistre dans le service de noms.");

            String IORServant = orb.object_to_string(rootPOA.servant_to_reference(monSite));
            System.out.println("L'objet possede la reference suivante :");
            System.out.println(IORServant);

            // Lancement de l'ORB et mise en attente de requete
            //**************************************************
            orb.run();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
