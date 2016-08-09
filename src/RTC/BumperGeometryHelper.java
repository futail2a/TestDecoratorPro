package RTC;


/**
* RTC/BumperGeometryHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

abstract public class BumperGeometryHelper
{
  private static String  _id = "IDL:RTC/BumperGeometry:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.BumperGeometry that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.BumperGeometry extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = RTC.Pose3DHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "pose",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Size3DHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "size",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[2] = new org.omg.CORBA.StructMember (
            "roc",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.BumperGeometryHelper.id (), "BumperGeometry", _members0);
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

  public static RTC.BumperGeometry read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.BumperGeometry value = new RTC.BumperGeometry ();
    value.pose = RTC.Pose3DHelper.read (istream);
    value.size = RTC.Size3DHelper.read (istream);
    value.roc = istream.read_double ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.BumperGeometry value)
  {
    RTC.Pose3DHelper.write (ostream, value.pose);
    RTC.Size3DHelper.write (ostream, value.size);
    ostream.write_double (value.roc);
  }

}
