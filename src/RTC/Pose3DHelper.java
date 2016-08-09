package RTC;


/**
* RTC/Pose3DHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 12時30分08秒 JST
*/

abstract public class Pose3DHelper
{
  private static String  _id = "IDL:RTC/Pose3D:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.Pose3D that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.Pose3D extract (org.omg.CORBA.Any a)
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
            "position",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Orientation3DHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "orientation",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.Pose3DHelper.id (), "Pose3D", _members0);
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

  public static RTC.Pose3D read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.Pose3D value = new RTC.Pose3D ();
    value.position = RTC.Point3DHelper.read (istream);
    value.orientation = RTC.Orientation3DHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.Pose3D value)
  {
    RTC.Point3DHelper.write (ostream, value.position);
    RTC.Orientation3DHelper.write (ostream, value.orientation);
  }

}
