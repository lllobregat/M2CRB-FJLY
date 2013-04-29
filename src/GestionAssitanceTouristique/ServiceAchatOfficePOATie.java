package GestionAssitanceTouristique;

/**
 * Interface definition : ServiceAchatOffice
 * 
 * @author OpenORB Compiler
 */
public class ServiceAchatOfficePOATie extends ServiceAchatOfficePOA
{

    //
    // Private reference to implementation object
    //
    private ServiceAchatOfficeOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public ServiceAchatOfficePOATie(ServiceAchatOfficeOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public ServiceAchatOfficePOATie(ServiceAchatOfficeOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public ServiceAchatOfficeOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(ServiceAchatOfficeOperations delegate_)
    {
        _tie = delegate_;
    }

    /**
     * _default_POA method
     */
    public org.omg.PortableServer.POA _default_POA()
    {
        if (_poa != null)
            return _poa;
        else
            return super._default_POA();
    }

    /**
     * Operation acheterPrestation
     */
    public GestionAssitanceTouristique.Carte acheterPrestation(short dateD, short dateF, float montant)
        throws GestionAssitanceTouristique.ServiceAchatOfficePackage.achatImpossibleException
    {
        return _tie.acheterPrestation( dateD,  dateF,  montant);
    }

}
