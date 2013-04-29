package GestionAssitanceTouristique;

/**
 * Interface definition : ServiceStatOffice
 * 
 * @author OpenORB Compiler
 */
public interface ServiceStatOfficeOperations
{
    /**
     * Operation getStatsGlobales
     */
    public GestionAssitanceTouristique.Statistique[] getStatsGlobales();

    /**
     * Operation afficherStatsSite
     */
    public void afficherStatsSite(GestionAssitanceTouristique.Statistique[] listeStat);

}
