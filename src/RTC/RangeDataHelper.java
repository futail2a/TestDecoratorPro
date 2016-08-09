package RTC;


/**
* RTC/RangeDataHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

abstract public class RangeDataHelper
{
  private static String  _id = "IDL:RTC/RangeData:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.RangeData that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.RangeData extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [4];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = RTC.TimeHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "tm",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (RTC.RangeListHelper.id (), "RangeList", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "ranges",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.RangerGeometryHelper.type ();
          _members0[2] = new org.omg.CORBA.StructMember (
            "geometry",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.RangerConfigHelper.type ();
          _members0[3] = new org.omg.CORBA.StructMember (
            "config",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.RangeDataHelper.id (), "RangeData", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static RTC.RangeData read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.RangeData value = new RTC.RangeData ();
    value.tm = RTC.TimeHelper.read (istream);
    value.ranges = RTC.RangeListHelper.read (istream);
    value.geometry = RTC.RangerGeometryHelper.read (istream);
    value.config = RTC.RangerConfigHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.RangeData value)
  {
    RTC.TimeHelper.write (ostream, value.tm);
    RTC.RangeListHelper.write (ostream, value.ranges);
    RTC.RangerGeometryHelper.write (ostream, value.geometry);
    RTC.RangerConfigHelper.write (ostream, value.config);
  }

}
