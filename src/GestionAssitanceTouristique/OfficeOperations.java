package GestionAssitanceTouristique;

/**
 * Interface definition : Office
 * 
 * @author OpenORB Compiler
 */
public interface OfficeOperations
{
    /**
     * Operation getListeSitesAVisiter
     */
    public GestionAssitanceTouristique.Site[] getListeSitesAVisiter(short idCarte, GestionAssitanceTouristique.Coordonnees coordGPS, GestionAssitanceTouristique.Site[] listeSitesVisites);

}
