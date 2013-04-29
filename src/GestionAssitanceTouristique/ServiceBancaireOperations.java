package GestionAssitanceTouristique;

/**
 * Interface definition : ServiceBancaire
 * 
 * @author OpenORB Compiler
 */
public interface ServiceBancaireOperations
{
    /**
     * Operation verifierPaiement
     */
    public boolean verifierPaiement(float montant)
        throws GestionAssitanceTouristique.ServiceBancairePackage.operationImpossibleException;

}
