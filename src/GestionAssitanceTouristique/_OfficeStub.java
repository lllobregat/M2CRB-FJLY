package GestionAssitanceTouristique;

/**
 * Interface definition : Office
 * 
 * @author OpenORB Compiler
 */
public class _OfficeStub extends org.omg.CORBA.portable.ObjectImpl
        implements Office
{
    static final String[] _ids_list =
    {
        "IDL:GestionAssitanceTouristique/Office:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = GestionAssitanceTouristique.OfficeOperations.class;

    /**
     * Operation getListeSitesAVisiter
     */
    public GestionAssitanceTouristique.Site[] getListeSitesAVisiter(short idCarte, GestionAssitanceTouristique.Coordonnees coordGPS, GestionAssitanceTouristique.Site[] listeSitesVisites)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("getListeSitesAVisiter",true);
                    _output.write_short(idCarte);
                    GestionAssitanceTouristique.CoordonneesHelper.write(_output,coordGPS);
                    GestionAssitanceTouristique.t_listeSitesHelper.write(_output,listeSitesVisites);
                    _input = this._invoke(_output);
                    GestionAssitanceTouristique.Site[] _arg_ret = GestionAssitanceTouristique.t_listeSitesHelper.read(_input);
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("getListeSitesAVisiter",_opsClass);
                if (_so == null)
                   continue;
                GestionAssitanceTouristique.OfficeOperations _self = (GestionAssitanceTouristique.OfficeOperations) _so.servant;
                try
                {
                    return _self.getListeSitesAVisiter( idCarte,  coordGPS,  listeSitesVisites);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
