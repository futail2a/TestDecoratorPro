package RTC;


/**
* RTC/Geometry2DHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

abstract public class Geometry2DHelper
{
  private static String  _id = "IDL:RTC/Geometry2D:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.Geometry2D that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.Geometry2D extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = RTC.Pose2DHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "pose",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Size2DHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "size",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.Geometry2DHelper.id (), "Geometry2D", _members0);
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

  public static RTC.Geometry2D read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.Geometry2D value = new RTC.Geometry2D ();
    value.pose = RTC.Pose2DHelper.read (istream);
    value.size = RTC.Size2DHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.Geometry2D value)
  {
    RTC.Pose2DHelper.write (ostream, value.pose);
    RTC.Size2DHelper.write (ostream, value.size);
  }

}
