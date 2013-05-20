/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Smartphone;

import org.omg.CosNaming.*;
import org.omg.PortableServer.*;
/**
 *
 * @author Lydia
 */
public class ServeurSmartphone {
    
     public void enregistrerVisite(int idSite) {
        
     }
   
     public static void main(String[] args) {
         try {
            //1 
             org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
             
             /****** Gestion du POA ******/
             //2
             POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
             
             //3
             SmartphoneTouristeImpl monSmarphone = new SmartphoneTouristeImpl();
             
             //4
             byte[] monSmartphoneId = rootPOA.activate_object(monSmarphone);
             
             //5
             rootPOA.the_POAManager().activate();
             
             //6 Recuperation du naming service
             NamingContext nameRoot = org.omg.CosNaming.NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));
             
             //Construction du nom a enregistrer
             org.omg.CosNaming.NameComponent[] nameToRegister = new org.omg.CosNaming.NameComponent[1];
             
             nameToRegister[0] = new org.omg.CosNaming.NameComponent("MonSmatphone", "");
             
             //Enregistrement du nom de l'objet corba dans le service de nom
             nameRoot.rebind(nameToRegister, rootPOA.servant_to_reference(monSmarphone));
             
             //7
             orb.run();      
         }
         catch(Exception e) {
             
         }
    }
}
