package GestionAssitanceTouristique.ServiceAchatOfficePackage;

/** 
 * Helper class for : achatImpossibleException
 *  
 * @author OpenORB Compiler
 */ 
public class achatImpossibleExceptionHelper
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
     * Insert achatImpossibleException into an any
     * @param a an any
     * @param t achatImpossibleException value
     */
    public static void insert(org.omg.CORBA.Any a, GestionAssitanceTouristique.ServiceAchatOfficePackage.achatImpossibleException t)
    {
        a.insert_Streamable(new GestionAssitanceTouristique.ServiceAchatOfficePackage.achatImpossibleExceptionHolder(t));
    }

    /**
     * Extract achatImpossibleException from an any
     * @param a an any
     * @return the extracted achatImpossibleException value
     */
    public static GestionAssitanceTouristique.ServiceAchatOfficePackage.achatImpossibleException extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        if (HAS_OPENORB && a instanceof org.openorb.CORBA.Any) {
            // streamable extraction. The jdk stubs incorrectly define the Any stub
            org.openorb.CORBA.Any any = (org.openorb.CORBA.Any)a;
            try {
                org.omg.CORBA.portable.Streamable s = any.extract_Streamable();
                if(s instanceof GestionAssitanceTouristique.ServiceAchatOfficePackage.achatImpossibleExceptionHolder)
                    return ((GestionAssitanceTouristique.ServiceAchatOfficePackage.achatImpossibleExceptionHolder)s).value;
            } catch (org.omg.CORBA.BAD_INV_ORDER ex) {
            }
            GestionAssitanceTouristique.ServiceAchatOfficePackage.achatImpossibleExceptionHolder h = new GestionAssitanceTouristique.ServiceAchatOfficePackage.achatImpossibleExceptionHolder(read(a.create_input_stream()));
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
     * Return the achatImpossibleException TypeCode
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
                _tc = orb.create_exception_tc(id(),"achatImpossibleException",_members);
                _working = false;
            }
        }
        return _tc;
    }

    /**
     * Return the achatImpossibleException IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:GestionAssitanceTouristique/ServiceAchatOffice/achatImpossibleException:1.0";

    /**
     * Read achatImpossibleException from a marshalled stream
     * @param istream the input stream
     * @return the readed achatImpossibleException value
     */
    public static GestionAssitanceTouristique.ServiceAchatOfficePackage.achatImpossibleException read(org.omg.CORBA.portable.InputStream istream)
    {
        GestionAssitanceTouristique.ServiceAchatOfficePackage.achatImpossibleException new_one = new GestionAssitanceTouristique.ServiceAchatOfficePackage.achatImpossibleException();

        if (!istream.read_string().equals(id()))
         throw new org.omg.CORBA.MARSHAL();
        new_one.raison = GestionAssitanceTouristique.t_raisonHelper.read(istream);

        return new_one;
    }

    /**
     * Write achatImpossibleException into a marshalled stream
     * @param ostream the output stream
     * @param value achatImpossibleException value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, GestionAssitanceTouristique.ServiceAchatOfficePackage.achatImpossibleException value)
    {
        ostream.write_string(id());
        GestionAssitanceTouristique.t_raisonHelper.write(ostream,value.raison);
    }

}
