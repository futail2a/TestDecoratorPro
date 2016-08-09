package RTC;


/**
* RTC/OGMapConfigHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

abstract public class OGMapConfigHelper
{
  private static String  _id = "IDL:RTC/OGMapConfig:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.OGMapConfig that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.OGMapConfig extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [5];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[0] = new org.omg.CORBA.StructMember (
            "xScale",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[1] = new org.omg.CORBA.StructMember (
            "yScale",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ulong);
          _members0[2] = new org.omg.CORBA.StructMember (
            "width",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ulong);
          _members0[3] = new org.omg.CORBA.StructMember (
            "height",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Pose2DHelper.type ();
          _members0[4] = new org.omg.CORBA.StructMember (
            "origin",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.OGMapConfigHelper.id (), "OGMapConfig", _members0);
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

  public static RTC.OGMapConfig read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.OGMapConfig value = new RTC.OGMapConfig ();
    value.xScale = istream.read_double ();
    value.yScale = istream.read_double ();
    value.width = istream.read_ulong ();
    value.height = istream.read_ulong ();
    value.origin = RTC.Pose2DHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.OGMapConfig value)
  {
    ostream.write_double (value.xScale);
    ostream.write_double (value.yScale);
    ostream.write_ulong (value.width);
    ostream.write_ulong (value.height);
    RTC.Pose2DHelper.write (ostream, value.origin);
  }

}
