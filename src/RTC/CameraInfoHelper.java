package RTC;


/**
* RTC/CameraInfoHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

abstract public class CameraInfoHelper
{
  private static String  _id = "IDL:RTC/CameraInfo:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.CameraInfo that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.CameraInfo extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [6];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = RTC.Vector2DHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "focalLength",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Point2DHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "principalPoint",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[2] = new org.omg.CORBA.StructMember (
            "k1",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[3] = new org.omg.CORBA.StructMember (
            "k2",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[4] = new org.omg.CORBA.StructMember (
            "p1",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[5] = new org.omg.CORBA.StructMember (
            "p2",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.CameraInfoHelper.id (), "CameraInfo", _members0);
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

  public static RTC.CameraInfo read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.CameraInfo value = new RTC.CameraInfo ();
    value.focalLength = RTC.Vector2DHelper.read (istream);
    value.principalPoint = RTC.Point2DHelper.read (istream);
    value.k1 = istream.read_double ();
    value.k2 = istream.read_double ();
    value.p1 = istream.read_double ();
    value.p2 = istream.read_double ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.CameraInfo value)
  {
    RTC.Vector2DHelper.write (ostream, value.focalLength);
    RTC.Point2DHelper.write (ostream, value.principalPoint);
    ostream.write_double (value.k1);
    ostream.write_double (value.k2);
    ostream.write_double (value.p1);
    ostream.write_double (value.p2);
  }

}
