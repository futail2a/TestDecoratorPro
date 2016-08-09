package RTC;


/**
* RTC/PointCloudPointHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

abstract public class PointCloudPointHelper
{
  private static String  _id = "IDL:RTC/PointCloudPoint:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.PointCloudPoint that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.PointCloudPoint extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = RTC.Point3DHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "point",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.RGBColourHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "colour",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.PointCloudPointHelper.id (), "PointCloudPoint", _members0);
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

  public static RTC.PointCloudPoint read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.PointCloudPoint value = new RTC.PointCloudPoint ();
    value.point = RTC.Point3DHelper.read (istream);
    value.colour = RTC.RGBColourHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.PointCloudPoint value)
  {
    RTC.Point3DHelper.write (ostream, value.point);
    RTC.RGBColourHelper.write (ostream, value.colour);
  }

}
