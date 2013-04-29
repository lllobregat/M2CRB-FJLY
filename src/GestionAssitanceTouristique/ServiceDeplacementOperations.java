package GestionAssitanceTouristique;

/**
 * Interface definition : ServiceDeplacement
 * 
 * @author OpenORB Compiler
 */
public interface ServiceDeplacementOperations
{
    /**
     * Operation calculerDureeTrajet
     */
    public int calculerDureeTrajet(GestionAssitanceTouristique.Coordonnees coordGPS_A, GestionAssitanceTouristique.Coordonnees coordGPS_B, String mode)
        throws GestionAssitanceTouristique.ServiceDeplacementPackage.coordNonValidesException;

}
