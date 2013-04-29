package GestionAssitanceTouristique;

/**
 * Interface definition : ServiceStatSite
 * 
 * @author OpenORB Compiler
 */
public interface ServiceStatSiteOperations
{
    /**
     * Operation getStatsSite
     */
    public GestionAssitanceTouristique.Statistique[] getStatsSite();

    /**
     * Operation afficherInfosES
     */
    public void afficherInfosES(GestionAssitanceTouristique.Visite[] listeVisites);

}
