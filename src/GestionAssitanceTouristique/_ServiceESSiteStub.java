package GestionAssitanceTouristique;

/**
 * Interface definition : ServiceESSite
 * 
 * @author OpenORB Compiler
 */
public class _ServiceESSiteStub extends org.omg.CORBA.portable.ObjectImpl
        implements ServiceESSite
{
    static final String[] _ids_list =
    {
        "IDL:GestionAssitanceTouristique/ServiceESSite:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = GestionAssitanceTouristique.ServiceESSiteOperations.class;

    /**
     * Operation autoriserEntree
     */
    public void autoriserEntree(GestionAssitanceTouristique.Carte carte)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("autoriserEntree",false);
                    GestionAssitanceTouristique.CarteHelper.write(_output,carte);
                    _input = this._invoke(_output);
                    return;
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("autoriserEntree",_opsClass);
                if (_so == null)
                   continue;
                GestionAssitanceTouristique.ServiceESSiteOperations _self = (GestionAssitanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    _self.autoriserEntree( carte);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation entrer
     */
    public boolean entrer(short idCarte)
        throws GestionAssitanceTouristique.ServiceESSitePackage.carteNonValideException, GestionAssitanceTouristique.ServiceESSitePackage.siteDejaVisiteException, GestionAssitanceTouristique.ServiceESSitePackage.siteSatureException, GestionAssitanceTouristique.ServiceESSitePackage.siteFermeException
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("entrer",true);
                    _output.write_short(idCarte);
                    _input = this._invoke(_output);
                    boolean _arg_ret = _input.read_boolean();
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    if (_exception_id.equals(GestionAssitanceTouristique.ServiceESSitePackage.carteNonValideExceptionHelper.id()))
                    {
                        throw GestionAssitanceTouristique.ServiceESSitePackage.carteNonValideExceptionHelper.read(_exception.getInputStream());
                    }

                    if (_exception_id.equals(GestionAssitanceTouristique.ServiceESSitePackage.siteDejaVisiteExceptionHelper.id()))
                    {
                        throw GestionAssitanceTouristique.ServiceESSitePackage.siteDejaVisiteExceptionHelper.read(_exception.getInputStream());
                    }

                    if (_exception_id.equals(GestionAssitanceTouristique.ServiceESSitePackage.siteSatureExceptionHelper.id()))
                    {
                        throw GestionAssitanceTouristique.ServiceESSitePackage.siteSatureExceptionHelper.read(_exception.getInputStream());
                    }

                    if (_exception_id.equals(GestionAssitanceTouristique.ServiceESSitePackage.siteFermeExceptionHelper.id()))
                    {
                        throw GestionAssitanceTouristique.ServiceESSitePackage.siteFermeExceptionHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("entrer",_opsClass);
                if (_so == null)
                   continue;
                GestionAssitanceTouristique.ServiceESSiteOperations _self = (GestionAssitanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    return _self.entrer( idCarte);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation sortir
     */
    public void sortir(short idCarte)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("sortir",false);
                    _output.write_short(idCarte);
                    _input = this._invoke(_output);
                    return;
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("sortir",_opsClass);
                if (_so == null)
                   continue;
                GestionAssitanceTouristique.ServiceESSiteOperations _self = (GestionAssitanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    _self.sortir( idCarte);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation donnerAvisVisite
     */
    public void donnerAvisVisite(String interet)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("donnerAvisVisite",false);
                    _output.write_string(interet);
                    _input = this._invoke(_output);
                    return;
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("donnerAvisVisite",_opsClass);
                if (_so == null)
                   continue;
                GestionAssitanceTouristique.ServiceESSiteOperations _self = (GestionAssitanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    _self.donnerAvisVisite( interet);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation getInfosES
     */
    public GestionAssitanceTouristique.Visite[] getInfosES()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("getInfosES",true);
                    _input = this._invoke(_output);
                    GestionAssitanceTouristique.Visite[] _arg_ret = GestionAssitanceTouristique.t_listeVisitesHelper.read(_input);
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("getInfosES",_opsClass);
                if (_so == null)
                   continue;
                GestionAssitanceTouristique.ServiceESSiteOperations _self = (GestionAssitanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    return _self.getInfosES();
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation getAffluenceCourante
     */
    public short getAffluenceCourante()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("getAffluenceCourante",true);
                    _input = this._invoke(_output);
                    short _arg_ret = _input.read_short();
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("getAffluenceCourante",_opsClass);
                if (_so == null)
                   continue;
                GestionAssitanceTouristique.ServiceESSiteOperations _self = (GestionAssitanceTouristique.ServiceESSiteOperations) _so.servant;
                try
                {
                    return _self.getAffluenceCourante();
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
