package GestionAssitanceTouristique;

/**
 * Interface definition : ServiceAchatOffice
 * 
 * @author OpenORB Compiler
 */
public interface ServiceAchatOfficeOperations
{
    /**
     * Operation acheterPrestation
     */
    public GestionAssitanceTouristique.Carte acheterPrestation(short dateD, short dateF, float montant)
        throws GestionAssitanceTouristique.ServiceAchatOfficePackage.achatImpossibleException;

}
