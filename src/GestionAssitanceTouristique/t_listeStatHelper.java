package GestionAssitanceTouristique;

/** 
 * Helper class for : t_listeStat
 *  
 * @author OpenORB Compiler
 */ 
public class t_listeStatHelper
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
     * Insert t_listeStat into an any
     * @param a an any
     * @param t t_listeStat value
     */
    public static void insert(org.omg.CORBA.Any a, GestionAssitanceTouristique.Statistique[] t)
    {
        a.insert_Streamable(new GestionAssitanceTouristique.t_listeStatHolder(t));
    }

    /**
     * Extract t_listeStat from an any
     * @param a an any
     * @return the extracted t_listeStat value
     */
    public static GestionAssitanceTouristique.Statistique[] extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        if(HAS_OPENORB && a instanceof org.openorb.CORBA.Any) {
            // streamable extraction. The jdk stubs incorrectly define the Any stub
            org.openorb.CORBA.Any any = (org.openorb.CORBA.Any)a;
            try {
                org.omg.CORBA.portable.Streamable s = any.extract_Streamable();
                if(s instanceof GestionAssitanceTouristique.t_listeStatHolder)
                    return ((GestionAssitanceTouristique.t_listeStatHolder)s).value;
            } catch (org.omg.CORBA.BAD_INV_ORDER ex) {
            }
            GestionAssitanceTouristique.t_listeStatHolder h = new GestionAssitanceTouristique.t_listeStatHolder(read(a.create_input_stream()));
            a.insert_Streamable(h);
            return h.value;
        }
        return read(a.create_input_stream());
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the t_listeStat TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_alias_tc(id(),"t_listeStat",orb.create_sequence_tc(0,GestionAssitanceTouristique.StatistiqueHelper.type()));
        }
        return _tc;
    }

    /**
     * Return the t_listeStat IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:GestionAssitanceTouristique/t_listeStat:1.0";

    /**
     * Read t_listeStat from a marshalled stream
     * @param istream the input stream
     * @return the readed t_listeStat value
     */
    public static GestionAssitanceTouristique.Statistique[] read(org.omg.CORBA.portable.InputStream istream)
    {
        GestionAssitanceTouristique.Statistique[] new_one;
        {
        int size7 = istream.read_ulong();
        new_one = new GestionAssitanceTouristique.Statistique[size7];
        for (int i7=0; i7<new_one.length; i7++)
         {
            new_one[i7] = GestionAssitanceTouristique.StatistiqueHelper.read(istream);

         }
        }

        return new_one;
    }

    /**
     * Write t_listeStat into a marshalled stream
     * @param ostream the output stream
     * @param value t_listeStat value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, GestionAssitanceTouristique.Statistique[] value)
    {
        ostream.write_ulong(value.length);
        for (int i7=0; i7<value.length; i7++)
        {
            GestionAssitanceTouristique.StatistiqueHelper.write(ostream,value[i7]);

        }
    }

}
