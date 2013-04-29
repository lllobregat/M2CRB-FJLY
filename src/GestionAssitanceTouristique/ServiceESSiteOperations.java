package GestionAssitanceTouristique;

/**
 * Interface definition : ServiceESSite
 * 
 * @author OpenORB Compiler
 */
public interface ServiceESSiteOperations
{
    /**
     * Operation autoriserEntree
     */
    public void autoriserEntree(GestionAssitanceTouristique.Carte carte);

    /**
     * Operation entrer
     */
    public boolean entrer(short idCarte)
        throws GestionAssitanceTouristique.ServiceESSitePackage.carteNonValideException, GestionAssitanceTouristique.ServiceESSitePackage.siteDejaVisiteException, GestionAssitanceTouristique.ServiceESSitePackage.siteSatureException, GestionAssitanceTouristique.ServiceESSitePackage.siteFermeException;

    /**
     * Operation sortir
     */
    public void sortir(short idCarte);

    /**
     * Operation donnerAvisVisite
     */
    public void donnerAvisVisite(String interet);

    /**
     * Operation getInfosES
     */
    public GestionAssitanceTouristique.Visite[] getInfosES();

    /**
     * Operation getAffluenceCourante
     */
    public short getAffluenceCourante();

}
