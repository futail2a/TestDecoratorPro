package RTC;


/**
* RTC/Hypothesis3DListHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef Hypothesis3DList
     */
abstract public class Hypothesis3DListHelper
{
  private static String  _id = "IDL:RTC/Hypothesis3DList:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.Hypothesis3D[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.Hypothesis3D[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = RTC.Hypothesis3DHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (RTC.Hypothesis3DListHelper.id (), "Hypothesis3DList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static RTC.Hypothesis3D[] read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.Hypothesis3D value[] = null;
    int _len0 = istream.read_long ();
    value = new RTC.Hypothesis3D[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = RTC.Hypothesis3DHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.Hypothesis3D[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      RTC.Hypothesis3DHelper.write (ostream, value[_i0]);
  }

}
