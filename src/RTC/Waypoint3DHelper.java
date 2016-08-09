package RTC;


/**
* RTC/Waypoint3DHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 12時30分09秒 JST
*/

abstract public class Waypoint3DHelper
{
  private static String  _id = "IDL:RTC/Waypoint3D:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.Waypoint3D that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.Waypoint3D extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = RTC.Pose3DHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "target",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[1] = new org.omg.CORBA.StructMember (
            "distanceTolerance",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[2] = new org.omg.CORBA.StructMember (
            "headingTolerance",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.TimeHelper.type ();
          _members0[3] = new org.omg.CORBA.StructMember (
            "timeLimit",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Velocity3DHelper.type ();
          _members0[4] = new org.omg.CORBA.StructMember (
            "maxSpeed",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.Waypoint3DHelper.id (), "Waypoint3D", _members0);
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

  public static RTC.Waypoint3D read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.Waypoint3D value = new RTC.Waypoint3D ();
    value.target = RTC.Pose3DHelper.read (istream);
    value.distanceTolerance = istream.read_double ();
    value.headingTolerance = istream.read_double ();
    value.timeLimit = RTC.TimeHelper.read (istream);
    value.maxSpeed = RTC.Velocity3DHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.Waypoint3D value)
  {
    RTC.Pose3DHelper.write (ostream, value.target);
    ostream.write_double (value.distanceTolerance);
    ostream.write_double (value.headingTolerance);
    RTC.TimeHelper.write (ostream, value.timeLimit);
    RTC.Velocity3DHelper.write (ostream, value.maxSpeed);
  }

}
