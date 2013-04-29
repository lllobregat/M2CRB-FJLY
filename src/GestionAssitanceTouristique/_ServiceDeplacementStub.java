package GestionAssitanceTouristique;

/**
 * Interface definition : ServiceDeplacement
 * 
 * @author OpenORB Compiler
 */
public class _ServiceDeplacementStub extends org.omg.CORBA.portable.ObjectImpl
        implements ServiceDeplacement
{
    static final String[] _ids_list =
    {
        "IDL:GestionAssitanceTouristique/ServiceDeplacement:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = GestionAssitanceTouristique.ServiceDeplacementOperations.class;

    /**
     * Operation calculerDureeTrajet
     */
    public int calculerDureeTrajet(GestionAssitanceTouristique.Coordonnees coordGPS_A, GestionAssitanceTouristique.Coordonnees coordGPS_B, String mode)
        throws GestionAssitanceTouristique.ServiceDeplacementPackage.coordNonValidesException
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("calculerDureeTrajet",true);
                    GestionAssitanceTouristique.CoordonneesHelper.write(_output,coordGPS_A);
                    GestionAssitanceTouristique.CoordonneesHelper.write(_output,coordGPS_B);
                    _output.write_string(mode);
                    _input = this._invoke(_output);
                    int _arg_ret = _input.read_long();
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    if (_exception_id.equals(GestionAssitanceTouristique.ServiceDeplacementPackage.coordNonValidesExceptionHelper.id()))
                    {
                        throw GestionAssitanceTouristique.ServiceDeplacementPackage.coordNonValidesExceptionHelper.read(_exception.getInputStream());
                    }

                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("calculerDureeTrajet",_opsClass);
                if (_so == null)
                   continue;
                GestionAssitanceTouristique.ServiceDeplacementOperations _self = (GestionAssitanceTouristique.ServiceDeplacementOperations) _so.servant;
                try
                {
                    return _self.calculerDureeTrajet( coordGPS_A,  coordGPS_B,  mode);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
