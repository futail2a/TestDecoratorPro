package RTC;


/**
* RTC/BumperArrayGeometryHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

abstract public class BumperArrayGeometryHelper
{
  private static String  _id = "IDL:RTC/BumperArrayGeometry:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.BumperArrayGeometry that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.BumperArrayGeometry extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = RTC.Geometry3DHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "arrayGeometry",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.BumperGeometryHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (RTC.BumperGeometryListHelper.id (), "BumperGeometryList", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "bumperGeometry",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.BumperArrayGeometryHelper.id (), "BumperArrayGeometry", _members0);
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

  public static RTC.BumperArrayGeometry read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.BumperArrayGeometry value = new RTC.BumperArrayGeometry ();
    value.arrayGeometry = RTC.Geometry3DHelper.read (istream);
    value.bumperGeometry = RTC.BumperGeometryListHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.BumperArrayGeometry value)
  {
    RTC.Geometry3DHelper.write (ostream, value.arrayGeometry);
    RTC.BumperGeometryListHelper.write (ostream, value.bumperGeometry);
  }

}
