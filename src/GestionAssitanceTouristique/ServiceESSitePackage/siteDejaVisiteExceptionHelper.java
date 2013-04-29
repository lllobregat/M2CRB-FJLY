package GestionAssitanceTouristique.ServiceESSitePackage;

/** 
 * Helper class for : siteDejaVisiteException
 *  
 * @author OpenORB Compiler
 */ 
public class siteDejaVisiteExceptionHelper
{
    private static final boolean HAS_OPENORB;
    static {
        boolean hasOpenORB = false;
        try {
            Thread.currentThread().getContextClassLoader().loadClass("org.openorb.CORBA.Any");
            hasOpenORB = true;
        }
        catch(ClassNotFoundException ex) {
        }
        HAS_OPENORB = hasOpenORB;
    }
    /**
     * Insert siteDejaVisiteException into an any
     * @param a an any
     * @param t siteDejaVisiteException value
     */
    public static void insert(org.omg.CORBA.Any a, GestionAssitanceTouristique.ServiceESSitePackage.siteDejaVisiteException t)
    {
        a.insert_Streamable(new GestionAssitanceTouristique.ServiceESSitePackage.siteDejaVisiteExceptionHolder(t));
    }

    /**
     * Extract siteDejaVisiteException from an any
     * @param a an any
     * @return the extracted siteDejaVisiteException value
     */
    public static GestionAssitanceTouristique.ServiceESSitePackage.siteDejaVisiteException extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        if (HAS_OPENORB && a instanceof org.openorb.CORBA.Any) {
            // streamable extraction. The jdk stubs incorrectly define the Any stub
            org.openorb.CORBA.Any any = (org.openorb.CORBA.Any)a;
            try {
                org.omg.CORBA.portable.Streamable s = any.extract_Streamable();
                if(s instanceof GestionAssitanceTouristique.ServiceESSitePackage.siteDejaVisiteExceptionHolder)
                    return ((GestionAssitanceTouristique.ServiceESSitePackage.siteDejaVisiteExceptionHolder)s).value;
            } catch (org.omg.CORBA.BAD_INV_ORDER ex) {
            }
            GestionAssitanceTouristique.ServiceESSitePackage.siteDejaVisiteExceptionHolder h = new GestionAssitanceTouristique.ServiceESSitePackage.siteDejaVisiteExceptionHolder(read(a.create_input_stream()));
            a.insert_Streamable(h);
            return h.value;
        }
        return read(a.create_input_stream());
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;
    private static boolean _working = false;

    /**
     * Return the siteDejaVisiteException TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            synchronized(org.omg.CORBA.TypeCode.class) {
                if (_tc != null)
                    return _tc;
                if (_working)
                    return org.omg.CORBA.ORB.init().create_recursive_tc(id());
                _working = true;
                org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
                org.omg.CORBA.StructMember []_members = new org.omg.CORBA.StructMember[1];

                _members[0] = new org.omg.CORBA.StructMember();
                _members[0].name = "raison";
                _members[0].type = GestionAssitanceTouristique.t_raisonHelper.type();
                _tc = orb.create_exception_tc(id(),"siteDejaVisiteException",_members);
                _working = false;
            }
        }
        return _tc;
    }

    /**
     * Return the siteDejaVisiteException IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:GestionAssitanceTouristique/ServiceESSite/siteDejaVisiteException:1.0";

    /**
     * Read siteDejaVisiteException from a marshalled stream
     * @param istream the input stream
     * @return the readed siteDejaVisiteException value
     */
    public static GestionAssitanceTouristique.ServiceESSitePackage.siteDejaVisiteException read(org.omg.CORBA.portable.InputStream istream)
    {
        GestionAssitanceTouristique.ServiceESSitePackage.siteDejaVisiteException new_one = new GestionAssitanceTouristique.ServiceESSitePackage.siteDejaVisiteException();

        if (!istream.read_string().equals(id()))
         throw new org.omg.CORBA.MARSHAL();
        new_one.raison = GestionAssitanceTouristique.t_raisonHelper.read(istream);

        return new_one;
    }

    /**
     * Write siteDejaVisiteException into a marshalled stream
     * @param ostream the output stream
     * @param value siteDejaVisiteException value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, GestionAssitanceTouristique.ServiceESSitePackage.siteDejaVisiteException value)
    {
        ostream.write_string(id());
        GestionAssitanceTouristique.t_raisonHelper.write(ostream,value.raison);
    }

}
