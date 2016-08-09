package RTC;


/**
* RTC/ActArrayActuatorGeometryListHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/


/*!
     * @typedef ActArrayActuatorGeometryList
     * @brief List of ActArrayActuatorGeometry elements.
     */
abstract public class ActArrayActuatorGeometryListHelper
{
  private static String  _id = "IDL:RTC/ActArrayActuatorGeometryList:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.ActArrayActuatorGeometry[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.ActArrayActuatorGeometry[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = RTC.ActArrayActuatorGeometryHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (RTC.ActArrayActuatorGeometryListHelper.id (), "ActArrayActuatorGeometryList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static RTC.ActArrayActuatorGeometry[] read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.ActArrayActuatorGeometry value[] = null;
    int _len0 = istream.read_long ();
    value = new RTC.ActArrayActuatorGeometry[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = RTC.ActArrayActuatorGeometryHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.ActArrayActuatorGeometry[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      RTC.ActArrayActuatorGeometryHelper.write (ostream, value[_i0]);
  }

}
