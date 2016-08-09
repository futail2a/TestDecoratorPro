package RTC;


/**
* RTC/GPSFixTypeHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @enum GPSFixType
     */
abstract public class GPSFixTypeHelper
{
  private static String  _id = "IDL:RTC/GPSFixType:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.GPSFixType that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.GPSFixType extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (RTC.GPSFixTypeHelper.id (), "GPSFixType", new String[] { "GPS_FIX_NONE", "GPS_FIX_NORMAL", "GPS_FIX_DGPS"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static RTC.GPSFixType read (org.omg.CORBA.portable.InputStream istream)
  {
    return RTC.GPSFixType.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.GPSFixType value)
  {
    ostream.write_long (value.value ());
  }

}
